package testcomponents;

import java.io.IOException;
import com.aventstack.extentreports.Status;
import pages.TaskPageResources;

public class TaskCreation extends BaseTest {
	public void addTask() throws IOException, InterruptedException {

		TaskPageResources tp = new TaskPageResources(driver);
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

		/*
		 * test.log(Status.INFO, "Enter the task description"); ProjectListingResources
		 * plr = new ProjectListingResources(driver); String randomdes =
		 * plr.generateRandomDescription(); tp.enterDescription(randomdes);
		 */

		test.log(Status.INFO, "click on save button");
		tp.clickSave();
	}

}
