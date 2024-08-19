package testcases.projectlisting;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.ProjectTaskSearchResource;
import pages.QuickTaskPageResources;
import testcases.projectoverview.ProjectDetails;
import testcomponents.BaseTest;
import testcomponents.QuickTask;

public class ProjectTaskSearchFunctionality extends BaseTest {

	@BeforeClass
	public void gNavigation() throws IOException, InterruptedException, AWTException {
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
	}

	@Test(priority = 1)
	public void randomSearchGlobal() throws IOException, InterruptedException {
		ProjectTaskSearchResource ptsr = new ProjectTaskSearchResource(driver);
		test.log(Status.INFO, "Verify that the No data found image is displaying or not");
		ptsr.randomSearch();

	}

	@Test(priority = 2)
	public void taskSearchGlobal() throws IOException, InterruptedException {
		ProjectTaskSearchResource obj1 = new ProjectTaskSearchResource(driver);
		obj1.taskSearchingGlobally();
	}

	@Test(priority = 3)
	public void projectSearchGlobal() throws IOException, InterruptedException {
		ProjectTaskSearchResource obj1 = new ProjectTaskSearchResource(driver);
		obj1.projectSearchingGlobally();
	}

	@Test(priority = 4)
	public void searchCommonProjectAndTaskNamesGlobally() throws IOException, InterruptedException {
		ProjectTaskSearchResource obj1 = new ProjectTaskSearchResource(driver);
		obj1.commonProjectAndTaskGloballySearch();

	}

}
