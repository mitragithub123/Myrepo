package testcases.projectsettings;

import java.io.IOException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.ProjectListingResources;
import pages.ProjectSettingsOverviewResources;
import testcases.projectoverview.ProjectDetails;
import testcomponents.BaseTest;

public class ProjectSettingsOverview extends BaseTest {
	@Test
	public void verifyProjectSettingsOverview() throws IOException, InterruptedException {
		ProjectDetails pd = new ProjectDetails();
		pd.projectDetails();
		test = extent.createTest("Project settings overview Test", "Verify project settings overview functionality");
		test.assignCategory("Project settings overview Test");

		ProjectSettingsOverviewResources psor = new ProjectSettingsOverviewResources(driver);
		test.log(Status.INFO, "Navigate to projectsettings");
		psor.navigateToProjectSettings();

		ProjectListingResources plr = new ProjectListingResources(driver);
		test.log(Status.INFO, "Change project name");
		String randomProName = plr.generateRandomWords(5);
		psor.changeProjectName(randomProName);

		test.log(Status.INFO, "Extracting the short name and match");
		String expectedShortName = psor.generateShortName(randomProName);
		String actualShortName = psor.generateShortName(randomProName);
		if (actualShortName.equals(expectedShortName)) {
			System.out.println("Short name matches the expected short name: " + expectedShortName);
		} else {
			System.out.println("Short name does not match the expected short name.");
		}

		//psor.changeProjectDescription();
		Thread.sleep(5000);
		psor.changeCustomerDetails();
		test.log(Status.INFO, "Delete project");
		psor.deleteProject();

	}

}
