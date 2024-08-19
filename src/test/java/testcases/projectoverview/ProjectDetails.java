package testcases.projectoverview;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import pages.ProjectListingResources;
import testcomponents.BaseTest;
import testcomponents.CreateProject;
import testcomponents.Login;

public class ProjectDetails extends BaseTest {

	@Test
	public void projectDetails() throws IOException, InterruptedException {

		logger = Logger.getLogger(ProjectDetails.class);

		logger.info("Login to app");
		Login ob = new Login();
		test = extent.createTest("Project details Test", "Verify project details functionality");
		test.assignCategory("Project details Test");
		Thread.sleep(3000);
		ob.login();
		Thread.sleep(3000);

		test.log(Status.INFO, "Creating a project");
		logger.info("Creating a project");
		CreateProject cp = new CreateProject();
		cp.createProject();

		test.log(Status.INFO, "Go to project details by clicking project name");
		logger.info("Go to project details by clicking project name");
		ProjectListingResources plr = new ProjectListingResources(driver);
		plr.clickProjectName();

	}

}
