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
import testcomponents.RandomStringGenerator;

public class TaskPageFunctionality extends BaseTest
{
	@Test
	public void taskPage() throws IOException, InterruptedException {
		Login l = new Login();
		test = extent.createTest("Task page", "Verify task page functionality");
		test.assignCategory("Verify Task Page Functionality");
		l.login();

		CreateProject cp = new CreateProject();
		test.log(Status.INFO, "Project creation");
		cp.createProject();

		ProjectListingResources plr = new ProjectListingResources(driver);
		test.log(Status.INFO, "Project details page navigation");
		plr.clickProjectName();

		QuickTaskPageResources tpr = new QuickTaskPageResources(driver);
		test.log(Status.INFO, "quick task page navigation");
		tpr.leftMenuTask();

		TaskPageResources tp = new  TaskPageResources(driver);
		test.log(Status.INFO, "click on Add Task Link");
		tp.clickAddTaskLink();

		test.log(Status.INFO, "generate a random task name");
		RandomStringGenerator generator = new RandomStringGenerator();
		String randomTaskTitle = generator.generateRandomString(20);

		test.log(Status.INFO, "Create a task by entering the task title");
		tp.enterTitle(randomTaskTitle);

		test.log(Status.INFO, "click on task type dropdown & select task type");
		tp.clickDropdown();
		Thread.sleep(3000);
		tp.selectOptionByText();

		test.log(Status.INFO, "click on Assign To dropdown");
		tp.clickAssignToDropdown();
		Thread.sleep(3000);
		tp.selectAssignto();

		test.log(Status.INFO, "click on Priority To dropdown");
		tp.clickTaskPriority();
		Thread.sleep(3000); 
		tp.selectTaskPriority();

		test.log(Status.INFO, "click on Start Date");
		tp.clickStartDate();
		Thread.sleep(3000); 
		tp.selectStartDate();

		test.log(Status.INFO, "click on Due Date");
		tp.clickDueDate();
		Thread.sleep(3000); 
		tp.selectDueDate();

		test.log(Status.INFO, "Enter the task description");
		ProjectListingResources dest=new ProjectListingResources(driver);
		String randomdes = plr.generateRandomDescription();
		tp.enterDescription(randomdes);

		test.log(Status.INFO, "click on save button");
		tp.clickSave();
		
		test.log(Status.INFO, "Matching the task title");
		String newtasktitle = tp.getNewTaskTitle();
		
		logger.info("Verifying whether the created task matches the task title or not");
		tp.compareTaskTitle(randomTaskTitle, newtasktitle);
		
		logger.info("Verifying whether the created task matches the task title or not");
		tp.compareTaskTitle(randomTaskTitle, newtasktitle);
		
		
		logger.info("Verifying whether the task is Cancelling or not");
		tp.clickAddTaskLink();
		tp.cancellingTheTask();

	}
}
