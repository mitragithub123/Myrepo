package testcases.Team;

import java.io.IOException;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import pages.ProjectSettingsOverviewResources;
import testcases.projectoverview.ProjectDetails;
import testcomponents.BaseTest;

public class AddTeam extends BaseTest {
	@Test
	public void verifyAddTeam() throws IOException, InterruptedException {
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

		test.log(Status.INFO, "Verify that added team member is present in the listing or not");
		boolean isUserPresent = psor.isUserPresentInListing("Mitra bhanu");
		if (isUserPresent) {
			System.out.println("User 'Mitra bhanu' is present in the listing.");
		} else {
			System.out.println("User 'Mitra bhanu' is not present in the listing.");
		}

		test.log(Status.INFO, "Remove a team member");
		psor.removeUser();

		test.log(Status.INFO, "Verify that removed team member is present in the listing or not");
		boolean isUserAbsent = psor.isUserAbsentInListing("Mitra bhanu");
		if (isUserAbsent) {
			System.out.println("User 'Mitra bhanu' is not present in the listing.");
		} else {
			System.out.println("User 'Mitra bhanu' is present in the listing.");
		}

	}

}
