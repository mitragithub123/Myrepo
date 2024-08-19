package testcases.tasklist;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.QuickTaskPageResources;
import pages.TaskEditResources;
import testcases.projectoverview.ProjectDetails;
import testcomponents.BaseTest;
import testcomponents.QuickTask;

public class TaskMultiSelectCheckBoxFunctionality extends BaseTest {

	@Test
	public void taskMultiSelectCheck() throws IOException, InterruptedException {
		ProjectDetails pd = new ProjectDetails();
		pd.projectDetails();
		test = extent.createTest("Project settings overview Test", "Verify project settings overview functionality");
		test.assignCategory("Project settings overview Test");

		QuickTaskPageResources tpr = new QuickTaskPageResources(driver);
		test.log(Status.INFO, "quick task page navigation");
		tpr.leftMenuTask();

		QuickTask qty = new QuickTask();
		for (int i = 0; i < 4; i++) {
			qty.quickTask();
		}
		
		TaskEditResources taskPageFun = new TaskEditResources(driver);
		test.log(Status.INFO, "Clicking the multiselect checkBox");
		Thread.sleep(3000);
		taskPageFun.MultiSelectAssignToFunctionality();
		Thread.sleep(3000);
		taskPageFun.MultiSelectStatusFunctionality();
		driver.navigate().refresh();
		Thread.sleep(2000);
		taskPageFun.MultiSelectTaskDeleteFunctionality();
		Thread.sleep(3000);
	}
}


