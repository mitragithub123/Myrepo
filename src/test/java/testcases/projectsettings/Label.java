package testcases.projectsettings;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.ProjectSettingsLabelResources;
import pages.ProjectSettingsOverviewResources;
import testcases.projectoverview.ProjectDetails;
import testcomponents.BaseTest;

public class Label extends BaseTest {
	@BeforeMethod
	public void label() throws IOException, InterruptedException {
		ProjectDetails pd = new ProjectDetails();
		pd.projectDetails();
		test = extent.createTest("Project settings overview Test", "Verify project settings overview functionality");
		test.assignCategory("Project settings overview Test");

		ProjectSettingsOverviewResources psor = new ProjectSettingsOverviewResources(driver);
		test.log(Status.INFO, "Navigate to project settings");
		psor.navigateToProjectSettings();

		ProjectSettingsLabelResources pslr = new ProjectSettingsLabelResources(driver);
		test.log(Status.INFO, "Navigate to project settings label");
		pslr.navigateToLabel();

	}

	@Test(priority = 1)
	public void cancelBtnValidations() throws IOException, InterruptedException {
		ProjectSettingsLabelResources pslr = new ProjectSettingsLabelResources(driver);
		test.log(Status.INFO, "Cancel & close buttons validations in Add label popup");
		pslr.cancelBtnValidation();
	}

	@Test(priority = 2)
	public void addLabel() throws InterruptedException {
		ProjectSettingsLabelResources pslr = new ProjectSettingsLabelResources(driver);
		test.log(Status.INFO, "Add label popup positive validations");
		pslr.addLabel();

		test.log(Status.INFO, "Success toast message validation");
		pslr.compareToastMessage("Label created successfully!");
	}

	@Test(priority = 3)
	public void addLabelNegativeTest() throws IOException, InterruptedException {
		ProjectSettingsLabelResources pslr = new ProjectSettingsLabelResources(driver);
		test.log(Status.INFO, "Add label popup validations");
		pslr.addLabel();

		test.log(Status.INFO, "Negative validation of add label popup");
		pslr.addLabelNegativeTest();

	}

	@Test(priority = 4)
	public void verifyToggle() throws InterruptedException {
		ProjectSettingsLabelResources pslr = new ProjectSettingsLabelResources(driver);
		test.log(Status.INFO, "Add label popup validations");
		pslr.addLabel();

		test.log(Status.INFO, "Verify toggle button");
		pslr.verifyToggleBtn();
	}

	@Test(priority = 5)
	public void listItemNamesNCountOfTaskTypeWrtAddTask() throws InterruptedException {
		ProjectSettingsLabelResources pslr = new ProjectSettingsLabelResources(driver);
		test.log(Status.INFO, "Add label popup validations");
		pslr.clickAddLabelBtnNClickProjects();

		test.log(Status.INFO,
				"Verify All project names from the Add Label popup should be listed in the Projects menu");
		pslr.verifyProjectNamesOfAddLabelWrtProjectList();
	}

	@Test(priority = 6)
	public void verifyEditLabel() throws InterruptedException {
		ProjectSettingsLabelResources pslr = new ProjectSettingsLabelResources(driver);
		test.log(Status.INFO, "Add label popup validations");
		pslr.addLabel();

		test.log(Status.INFO, "Edit label positive test");
		pslr.editLabel();
	}

	@Test(priority = 7)
	public void verifyEditTaskTypeNegativeTest() throws InterruptedException {
		ProjectSettingsLabelResources pslr = new ProjectSettingsLabelResources(driver);
		test.log(Status.INFO, "Add label popup validations");
		pslr.addLabel();

		test.log(Status.INFO, "Edit label negative test");
		pslr.editLabelNegativeTest();
	}

	@Test(priority = 8)
	public void verifyEditTaskTypeCancelNCloseBtn() throws InterruptedException {
		ProjectSettingsLabelResources pslr = new ProjectSettingsLabelResources(driver);
		test.log(Status.INFO, "Add label popup validations");
		pslr.addLabel();

		test.log(Status.INFO, "Cancel & close btn validation of edit label popup");
		pslr.cancelBtnValidationEditTaskType();
	}

	@Test(priority = 9)
	public void verifyDeleteTaskType() throws InterruptedException, TimeoutException {
		ProjectSettingsLabelResources pslr = new ProjectSettingsLabelResources(driver);
		test.log(Status.INFO, "Add label popup validations");
		pslr.addLabel();

		test.log(Status.INFO, "Click on label delete icon");
		pslr.deleteTaskType();
	}
}
