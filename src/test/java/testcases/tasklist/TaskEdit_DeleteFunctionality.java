package testcases.tasklist;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.QuickTaskPageResources;
import pages.TaskEditResources;
import testcases.projectoverview.ProjectDetails;
import testcomponents.BaseTest;
import testcomponents.QuickTask;

public class TaskEdit_DeleteFunctionality extends BaseTest 
{

	@Test
	public void taskEditDelete() throws IOException, InterruptedException, AWTException {
		ProjectDetails pd = new ProjectDetails();
		pd.projectDetails();
		test = extent.createTest("Project settings overview Test", "Verify project settings overview functionality");
		test.assignCategory("Project settings overview Test");

		QuickTaskPageResources tpr = new QuickTaskPageResources(driver);
		test.log(Status.INFO, "quick task page navigation");
		tpr.leftMenuTask();

		QuickTask qty = new QuickTask();
		for (int i = 0; i < 1; i++) {
			qty.quickTask();
		}
		
		TaskEditResources terv= new TaskEditResources(driver);
		test.log(Status.INFO, "Verifying the Task Edit Operations");
		terv.taskEditOperation();
		
		Thread.sleep(2000);
		TaskEditResources ctret= new TaskEditResources(driver);
		test.log(Status.INFO, "Verifying the Task with respect to prjects");
		ctret.displayTaskRespectToProject();
		
}
}
