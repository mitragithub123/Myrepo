package testcomponents;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import pages.ProjectSettingsImportTasks;
import pages.ProjectSettingsOverviewResources;
import testcases.projectoverview.ProjectDetails;

public class ImportTasks extends BaseTest {
	@BeforeMethod
	public void importT() throws InterruptedException, IOException {
		ProjectDetails pd = new ProjectDetails();
		pd.projectDetails();
		test = extent.createTest("Project settings Import Tasks Test",
				"Verify project settings Import Tasks functionality");
		test.assignCategory("Project settings Import Tasks Test");

		ProjectSettingsOverviewResources psor = new ProjectSettingsOverviewResources(driver);
		test.log(Status.INFO, "Navigate to project settings");
		psor.navigateToProjectSettings();

		ProjectSettingsImportTasks psit = new ProjectSettingsImportTasks(driver);
		test.log(Status.INFO, "Navigate to project settings Import Tasks");
		psit.navigateImportTasks();
	}

	@Test(priority = 1)
	public void importTasks() throws InterruptedException {
		ProjectSettingsImportTasks psit = new ProjectSettingsImportTasks(driver);
		List<String> expectedTasks = Arrays.asList("Fix login issue", "Add logout functionality",
				"Update user documentation", "Implement logout button and functionality",
				"Add new feature details to the user documentation", "User login with email and password",
				"Send mail and then allow user to reset password", "Logout and redirects",
				"Admin listing should have access to edit & delete",
				"Registration with pricing plan details and subscription");

		test.log(Status.INFO, "CSV file upload, verify preview & count tasks");
		psit.uploadFile("C:\\Users\\Chandan\\Downloads\\testdata\\tasks_dummy_data.csv", expectedTasks);
		int taskCountPreview = psit.getTaskCountPreview();

		test.log(Status.INFO, "Success toast messsage validation");
		psit.comparedToastMessage("CREATED 10 TASKS SUCCESSFULLY");

		test.log(Status.INFO, "Navigating to tasks page and URL validations & counts task");
		psit.verifyNavigationToTasksPage();
		int taskCountTasksPage = psit.getTaskCountTasksPage();

		test.log(Status.INFO, "Match task count while preview vs task count in task list");
		Assert.assertEquals(taskCountPreview, taskCountTasksPage,
				"Task count in preview does not match task count in tasks page");
	}

	@Test(priority = 2)
	public void sampleFileDownloadCheck() throws InterruptedException {
		ProjectSettingsImportTasks psit = new ProjectSettingsImportTasks(driver);
		String downloadPath = "‪C:\\Users\\Chandan\\Downloads";
		String downloadedFileName = psit.findDownloadedFile(downloadPath, "tasks-data-export-demo");
		if (downloadedFileName != null) {
			System.out.println("File downloaded successfully: " + downloadedFileName);
		} else {
			Assert.fail("Failed to download the file");
		}
	}

	@Test(priority = 3)
	public void importTasksDifferentFiles() throws InterruptedException {
		ProjectSettingsImportTasks psit = new ProjectSettingsImportTasks(driver);
		test.log(Status.INFO, "PDF file upload, verify preview");
		psit.uploadFile("C:\\Users\\Chandan\\Downloads\\testdata\\REL1054972.pdf");

		test.log(Status.INFO, "Error message validation");
		psit.compareToastMessage("Invalid File Type,Please Give Csv Format");
	}

	@Test(priority = 4)
	public void importTasksMoreThan100Rows() throws InterruptedException {
		ProjectSettingsImportTasks psit = new ProjectSettingsImportTasks(driver);
		test.log(Status.INFO, "CSV file upload more than 100 rows, verify preview");
		psit.uploadFile("C:\\Users\\Chandan\\Downloads\\testdata\\tasks_dummy_data_more.csv");

		test.log(Status.INFO, "Error message validation");
		psit.compareToastMessage("Csv File Exceeds The 100-Line Limit");
	}
}
