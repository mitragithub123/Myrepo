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

public class TaskFiltersVerification extends BaseTest {
	@Test
	public void taskFilters() throws IOException, InterruptedException {
		Login l = new Login();
		test = extent.createTest("Task page", "Verify task page functionality");
		test.assignCategory("Verify Task Page Functionality");
		l.login();
		Thread.sleep(2000);

		CreateProject cp = new CreateProject();
		test.log(Status.INFO, "Project creation");
		cp.createProject();

		ProjectListingResources plr = new ProjectListingResources(driver);
		test.log(Status.INFO, "Project details page navigation");
		plr.clickProjectName();

		QuickTaskPageResources tpr = new QuickTaskPageResources(driver);
		test.log(Status.INFO, "quick task page navigation");
		tpr.leftMenuTask();

		test.log(Status.INFO, "Creating a task");
		TaskCreation tc = new TaskCreation();
		tc.addTask();

		test.log(Status.INFO, "Clicking on filter icon");
		TaskPageResources tprf = new TaskPageResources(driver);
		tprf.filterIconClick();
		Thread.sleep(3000);

		test.log(Status.INFO, "Selecting Task type");
		tprf.taskTypeClick();

		test.log(Status.INFO, "Selecting Task type Filters");
		tprf.selectingTaskTypeFilters();
		Thread.sleep(2000);
		tprf.filterResetIcon();;

		test.log(Status.INFO, "Click assigned To");
		tprf.assignedToClick();
		Thread.sleep(2000);
		
		test.log(Status.INFO, "Selecting assigned to priority filter");
		tprf.selectingAssignedToFilters();
		Thread.sleep(2000);
		tprf.filterResetIcon();

		test.log(Status.INFO, "Selecting Task priority filter");
		tprf.taskPriorityClick();

		test.log(Status.INFO, "Selecting Task priority Filters");
		tprf.selectingPriorityFilters();
		Thread.sleep(2000);
		tprf.filterResetIcon();

		test.log(Status.INFO, "Selecting DueDate priority");
		tprf.taskDueDateClick();

		test.log(Status.INFO, "Selecting DueDate priority Filters");
		tprf.selectingDueDateFilters();
		Thread.sleep(2000);
		tprf.filterResetIcon();

		test.log(Status.INFO, "Selecting groupBy priority");
		tprf.groupByClick();

		test.log(Status.INFO, "Selecting GroupBy Filters");
		tprf.selectingGroupByFilters();
	}
}
