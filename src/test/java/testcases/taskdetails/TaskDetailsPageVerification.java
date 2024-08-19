package testcases.taskdetails;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.ProjectListingResources;
import pages.QuickTaskPageResources;
import pages.TaskDetailsPageResource;
import testcomponents.BaseTest;
import testcomponents.Login;
import testcomponents.RandomStringGenerator;

public class TaskDetailsPageVerification extends BaseTest
{


	@BeforeClass
	public void gNavigation() throws IOException, InterruptedException, AWTException
	{
		Login l = new Login();
		test = extent.createTest("Task page", "Verify task page functionality");
		test.assignCategory("Verify Task Page Functionality");
		l.login();
		
		ProjectListingResources plr = new ProjectListingResources(driver);
		test.log(Status.INFO, "Project details page navigation");
		plr.clickProjectName();
		
		QuickTaskPageResources tpr = new QuickTaskPageResources(driver);
		test.log(Status.INFO, "quick task page navigation");
		tpr.leftMenuTask();
		
		TaskDetailsPageResource tp = new  TaskDetailsPageResource(driver);
		test.log(Status.INFO, "click on Add Task Link");
		tp.clickAddTaskLink();
		Thread.sleep(3000);

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

		test.log(Status.INFO, "click on save button");
		tp.clickSave();
		
	}
	@Test(priority = 1)
	public void checkTaskTitleOnDetailsPage() throws IOException, InterruptedException
	{
		TaskDetailsPageResource tdp= new TaskDetailsPageResource(driver);
		tdp.compareTaskTitles();
	}
	@Test(priority = 2)
	public void checkDuedateOnDetailsPage() throws IOException, InterruptedException
	{
		TaskDetailsPageResource tdp= new TaskDetailsPageResource(driver);
		tdp.compareDueDate();
	}	
	@Test(priority = 3)
	public void checkTaskStatusOnDetailsPage() throws IOException, InterruptedException
	{
		TaskDetailsPageResource tdp= new TaskDetailsPageResource(driver);
		tdp.compareTaskStatus();
	}
	@Test(priority = 4)
	public void checkTaskPriorityOnDetailsPage() throws IOException, InterruptedException
	{
		TaskDetailsPageResource tdp= new TaskDetailsPageResource(driver);
		tdp.compareTaskPriority();
	}
	@Test(priority = 5)
	public void checkTaskAssignToinDetailsPage() throws IOException, InterruptedException
	{
		TaskDetailsPageResource tdp= new TaskDetailsPageResource(driver);
		tdp.compareTaskAssignTo();
	}
}
