package testcases.tasklist;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.ProjectListingResources;
import pages.QuickTaskPageResources;
import testcomponents.BaseTest;
import testcomponents.CreateProject;
import testcomponents.Login;
import testcomponents.RandomStringGenerator;

public class QuickTaskField extends BaseTest {
	@Test
	public void quickTask() throws IOException, InterruptedException {
		Login l = new Login();
		test = extent.createTest("Quick task Test", "Verify quick task functionality");
		test.assignCategory("Quick task Test");
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

		test.log(Status.INFO, "click on quick task");
		tpr.quickTask();

		test.log(Status.INFO, "generate a random task name");
		RandomStringGenerator generator = new RandomStringGenerator();
		String randomTaskTitle = generator.generateRandomString(20);

		test.log(Status.INFO, "Create a task by entering the task title");
		tpr.enterTaskName(randomTaskTitle);

		test.log(Status.INFO, "Matching the task title");
		String createdTaskTitle = tpr.getTaskTitle();

		logger.info("Verifying whether the created task matches the task title or not");
		QuickTaskPageResources cmt= new QuickTaskPageResources(driver);
		cmt.compareTaskTitle(createdTaskTitle, randomTaskTitle);

		test.info("Verify if the correct toast message is displayed or not");
		String expectedToastMessage = "Task created successfully!";
		tpr.compareToastMessage(expectedToastMessage);
		
		test.log(Status.INFO, "click on quick task");
		tpr.quickTask();

		test.log(Status.INFO, "generate a random task name");
		RandomStringGenerator generator1 = new RandomStringGenerator();
		String randomTaskTitle1 = generator1.generateRandomString(20);
		
		test.log(Status.INFO, "verifying cancel button functionality");
		tpr.cancelTaskName(randomTaskTitle);

	}
}
