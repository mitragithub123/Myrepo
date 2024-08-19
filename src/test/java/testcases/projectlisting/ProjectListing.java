package testcases.projectlisting;

import java.io.IOException;
import java.util.concurrent.TimeoutException;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.ProjectListingResources;
import testcomponents.BaseTest;
import testcomponents.CreateProject;
import testcomponents.Login;


public class ProjectListing extends BaseTest {
	@Test
	public static void createProjectPopUp() throws IOException, InterruptedException, TimeoutException {
		logger = Logger.getLogger(ProjectListing.class);
		
		logger.info("Login to app");
		Login ob = new Login();
		test = extent.createTest("Project listing Test", "Verify project listing functionality");
		test.assignCategory("Project listing Test");
		ob.login();
		
		test.log(Status.INFO, "Creating a project");
		logger.info("Creating a project");
		CreateProject cp = new CreateProject();
		cp.createProject();
		
		test.log(Status.INFO, "Added project name is matching or not with created project");
		logger.info("Added project name is matching or not with created project");
		String randomProjectName = ProjectListingResources.projectNameField.getText();
		ProjectListingResources.projectNameMatch(randomProjectName);
		
		test.log(Status.INFO, "Added project description is matching or not with created project description");
		logger.info("Added project description is matching or not with created project description");
		String randomDescription = ProjectListingResources.projectDescription.getText();
		ProjectListingResources.projectDescriptionMatch(randomDescription);

	}

}
