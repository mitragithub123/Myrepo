package testcases.projectlisting;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.TaskPageResources;
import testcases.tasklist.SortTask;
import testcomponents.BaseTest;

public class ProjectTaskNStorageValue extends BaseTest {
	@Test
	public void taskAndStorageProjectList() throws IOException, InterruptedException {
		SortTask st = new SortTask();
		test = extent.createTest("Project listing Test", "Verify project listing storage and task functionality");
		test.assignCategory("Project listing Test");
		st.verifyTaskIdSort();

		TaskPageResources tpr = new TaskPageResources(driver);
		test.log(Status.INFO, "Go to project list");
		tpr.goToProjectList();

		test.log(Status.INFO, "Verify task count");
		tpr.verifyTaskCount();

		test.log(Status.INFO, "Verify storage");
		tpr.verifyStorage();

	}

}
