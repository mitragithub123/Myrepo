package testcases.Team;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.ProjectSettingsOverviewResources;
import testcases.projectoverview.ProjectDetails;
import testcomponents.BaseTest;

public class Teams extends BaseTest {
	@Test
	public void verifyTeam() throws IOException, InterruptedException {
		ProjectDetails pd = new ProjectDetails();
		pd.projectDetails();
		test = extent.createTest("Project settings teams Test", "Verify project settings teams functionality");
		test.assignCategory("Project settings teams Test");

		ProjectSettingsOverviewResources psor = new ProjectSettingsOverviewResources(driver);
		test.log(Status.INFO, "Navigate to project settings");
		psor.navigateToProjectSettings();

		test.log(Status.INFO, "Navigate to project teams");
		psor.navigateToProjectTeams();

		test.log(Status.INFO, "Add a new team member");
		psor.addNewTeamUser();
		
		test.log(Status.INFO, "Click check boxes one by one");
		psor.clickCheckboxesOneByOne();
		
	}

}
