package testcases.projectsettings;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.ProjectSettingsOverviewResources;
import pages.ProjectSettingsTaskTypeResources;
import testcases.projectoverview.ProjectDetails;
import testcomponents.BaseTest;

public class TaskType extends BaseTest {

	@BeforeMethod
	public void taskType() throws IOException, InterruptedException {
		ProjectDetails pd = new ProjectDetails();
		pd.projectDetails();
		test = extent.createTest("Project settings overview Test", "Verify project settings overview functionality");
		test.assignCategory("Project settings overview Test");

		ProjectSettingsOverviewResources psor = new ProjectSettingsOverviewResources(driver);
		test.log(Status.INFO, "Navigate to project settings");
		psor.navigateToProjectSettings();

		ProjectSettingsTaskTypeResources pstr = new ProjectSettingsTaskTypeResources(driver);
		test.log(Status.INFO, "Navigate to project settings task type");
		pstr.navigateToTaskType();
	}

	@Test(priority = 1)
	public void cancelBtnValidations() throws IOException, InterruptedException {

		ProjectSettingsTaskTypeResources pstr = new ProjectSettingsTaskTypeResources(driver);
		test.log(Status.INFO, "Cancel & close buttons validations in Add task type popup");
		pstr.cancelBtnValidation();
	}

	@Test(priority = 2)
	public void addTaskType() throws IOException, InterruptedException {
		ProjectSettingsTaskTypeResources pstr = new ProjectSettingsTaskTypeResources(driver);
		test.log(Status.INFO, "Add task type popup validations");
		pstr.addTaskType();

		test.log(Status.INFO, "Success toast message validation");
		pstr.compareToastMessage("Task Type created successfully!");
	}

	@Test(priority = 3)
	public void addTaskTypeNegative() throws IOException, InterruptedException {
		ProjectSettingsTaskTypeResources pstr = new ProjectSettingsTaskTypeResources(driver);
		test.log(Status.INFO, "Add task type popup validations");
		pstr.addTaskType();

		test.log(Status.INFO, "Negative validation of add task popup");
		pstr.addTaskTypeNegativeTest();

	}

	@Test(priority = 4)
	public void verifyToggle() throws InterruptedException {
		ProjectSettingsTaskTypeResources pstr = new ProjectSettingsTaskTypeResources(driver);
		test.log(Status.INFO, "Add task type popup validations");
		pstr.addTaskType();

		test.log(Status.INFO, "Verify toggle button");
		pstr.verifyToggleBtn();
	}

	@Test(priority = 5)
	public void listItemNamesNCountOfTaskTypeWrtAddTask() throws InterruptedException {
		ProjectSettingsTaskTypeResources pstr = new ProjectSettingsTaskTypeResources(driver);
		test.log(Status.INFO, "Add task type popup validations");
		pstr.addTaskType();

		test.log(Status.INFO, "Verify task type list item name w.r.t add task popup");
		pstr.verifyListItemNamesOfTaskTypeWrtAddTask();
	}

	@Test(priority = 6)
	public void verifyEditTaskType() throws InterruptedException {
		ProjectSettingsTaskTypeResources pstr = new ProjectSettingsTaskTypeResources(driver);
		test.log(Status.INFO, "Edit task type popup positive validations");
		pstr.addTaskType();

		test.log(Status.INFO, "Click on task type edit icon");
		pstr.editTaskType();
	}

	@Test(priority = 7)
	public void verifyEditTaskTypeNegativeTest() throws InterruptedException {
		ProjectSettingsTaskTypeResources pstr = new ProjectSettingsTaskTypeResources(driver);
		test.log(Status.INFO, "Edit task type popup negative validations");
		pstr.addTaskType();

		test.log(Status.INFO, "Click on task type edit icon");
		pstr.editTaskTypeNegativeTest();
	}

	@Test(priority = 8)
	public void verifyEditTaskTypeCancelNCloseBtn() throws InterruptedException {
		ProjectSettingsTaskTypeResources pstr = new ProjectSettingsTaskTypeResources(driver);
		test.log(Status.INFO, "Edit task type popup validations");
		pstr.addTaskType();

		test.log(Status.INFO, "Click on task type edit icon");
		pstr.cancelBtnValidationEditTaskType();
	}

	@Test(priority = 9)
	public void verifyDeleteTaskType() throws InterruptedException, TimeoutException {
		ProjectSettingsTaskTypeResources pstr = new ProjectSettingsTaskTypeResources(driver);
		test.log(Status.INFO, "Add task type popup validations");
		pstr.addTaskType();

		test.log(Status.INFO, "Click on task type delete icon");
		pstr.deleteTaskType();
	}

}
