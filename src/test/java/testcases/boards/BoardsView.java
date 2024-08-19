package testcases.boards;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.BoardsPageResources;
import pages.ProjectDetailsResources;
import testcases.projectoverview.ProjectDetails;
import testcomponents.BaseTest;

public class BoardsView extends BaseTest {
	@Test
	public void boardViewOpeartions() throws IOException, InterruptedException {
		test = extent.createTest("Boards view Test", "Verify board view functionality");
		test.assignCategory("Boards view Test");
		test.log(Status.INFO, "Go to project details");
		ProjectDetails pd = new ProjectDetails();
		pd.projectDetails();

		test.log(Status.INFO, "Click on boards view in project overview");
		ProjectDetailsResources pdr = new ProjectDetailsResources(driver);
		pdr.clickOnBoardsView();

		test.log(Status.INFO, "Click on boards view add task + icon");
		BoardsPageResources bpr = new BoardsPageResources(driver);
		bpr.addTask();

		test.log(Status.INFO, "Task name entry");
		bpr.taskNameInput();

		test.log(Status.INFO, "Click on boards view add task + icon again to create task");
		bpr.addTask();
		test.log(Status.INFO, "Click on boards view add task + icon again to close task field");
		bpr.addTask();
		test.log(Status.INFO, "calculate to do task count");
		bpr.todoCount();
		// bpr.taskMatch();

		test.log(Status.INFO, "Drag the task from to do tab to doing tab");
		bpr.dragTaskToDoing();
		test.log(Status.INFO, "calculate doing task count");
		bpr.doingCount();

		test.log(Status.INFO, "create another task");
		bpr.addTask();
		bpr.taskNameInput();
		bpr.addTask();
		bpr.addTask();

		test.log(Status.INFO, "Drag the task from to do tab to done tab");
		bpr.dragTaskToDone();
		test.log(Status.INFO, "calculate done task count");
		bpr.doneCount();

	}

}
