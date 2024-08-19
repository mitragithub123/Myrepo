package testcases.projectoverview;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.ProjectDetailsResources;
import testcomponents.BaseTest;

public class ProjectDetailsChangeProject extends BaseTest {
	@Test
	public void verifyProjectDetailsChangeProject() throws IOException, InterruptedException {

		test = extent.createTest("Project details Test", "Verify project details functionality");
		test.assignCategory("Project details Test");
		test.log(Status.INFO, "Go to project details");
		ProjectDetails pd = new ProjectDetails();
		pd.projectDetails();

		test.log(Status.INFO, "Change project verification");
		ProjectDetailsResources pdr = new ProjectDetailsResources(driver);
		pdr.changeProject();

	}

}
