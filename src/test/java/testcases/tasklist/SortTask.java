package testcases.tasklist;

import java.io.IOException;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

import pages.ProjectListingResources;
import pages.QuickTaskPageResources;
import pages.TaskPageResources;
import testcomponents.BaseTest;
import testcomponents.CreateProject;
import testcomponents.Login;
import testcomponents.TaskCreation;

public class SortTask extends BaseTest {
	@Test
	public void verifyTaskIdSort() throws IOException, InterruptedException {

		test = extent.createTest("Task page", "Verify task page sort by id functionality");
		test.assignCategory("Verify Task Page sort by id Functionality");
		Login l = new Login();
		l.login();

		CreateProject cp = new CreateProject();
		test.log(Status.INFO, "Project creation");
		cp.createProject();

		ProjectListingResources plr = new ProjectListingResources(driver);
		test.log(Status.INFO, "Project details page navigation");
		plr.clickProjectName();

		QuickTaskPageResources qtr = new QuickTaskPageResources(driver);
		test.log(Status.INFO, "quick task page navigation");
		qtr.leftMenuTask();

		TaskCreation tc = new TaskCreation();
		test.log(Status.INFO, "Add task popup submit multiple times");
		for (int i = 0; i < 2; i++) {
			tc.addTask();
		}

		TaskPageResources tpr = new TaskPageResources(driver);
		test.log(Status.INFO, "Click on task id sort icon");
		tpr.clickSortIconTaskID();

		test.log(Status.INFO, "Verify sort by task ID");
		tpr.verifyTaskIdSort();

		test.log(Status.INFO, "Click on task name sort icon");
		tpr.clickSortIconTaskName();

		test.log(Status.INFO, "Verify sort by task Name");
		tpr.verifyTaskNameSort();

		test.log(Status.INFO, "Verify sort by assign to");
		tpr.clickSortIconAssignTo();
		tpr.verifyAssignToSort();

		test.log(Status.INFO, "Verify sort by status");
		tpr.clickSortIconStatus();
		tpr.verifyStatusSort();

		test.log(Status.INFO, "Verify sort by priority");
		tpr.clickSortIconPriority();
		tpr.verifyPrioritySort();

	}

}
