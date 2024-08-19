package testcases.projectoverview;

import java.io.IOException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.ProjectDetailsResources;
import pages.ProjectListingResources;
import testcomponents.BaseTest;

public class ProjectDetailsVerification extends BaseTest {
	@Test
	public void verifyProjectDetails() throws IOException, InterruptedException {

		test = extent.createTest("Project details Test", "Verify project details functionality");
		test.assignCategory("Project details Test");
		test.log(Status.INFO, "Go to project details");
		ProjectDetails pd = new ProjectDetails();
		pd.projectDetails();

		test.log(Status.INFO, "Extracting the random text (Project name) used while creating project ");
		ProjectListingResources plr = new ProjectListingResources(driver);
		String randomProjectName = plr.generateRandomProjectName();

		test.log(Status.INFO, "Verify the project name is matching with random text or not");
		ProjectDetailsResources pdr = new ProjectDetailsResources(driver);
		if (ProjectDetailsResources.projectName.getText().equalsIgnoreCase(randomProjectName)) {
			System.out.println("Project name is matching");
		} else {
			System.out.println("Project name is not matching");
		}

		test.log(Status.INFO, "Verify the work list link");
		pdr.workListLink();

		test.log(Status.INFO, "Verify the boards link");
		pdr.boardsLink();

		test.log(Status.INFO, "Print project members count from project details");
		int memberCount = pdr.printMemberCount();

		test.log(Status.INFO, "Print project members count from teams page");
		int rowCount = pdr.countRowsInTable();
		System.out.println("Number of rows in the table: " + rowCount);

		test.log(Status.INFO, "Project members count vs count from teams page.");
		if (memberCount == rowCount) {
			System.out.println("Project members count matches with the count from teams page.");
		} else {
			System.out.println("Project members count does not match with the count from teams page.");
		}

		test.log(Status.INFO, "Return back to project details");
		pdr.returnBackProjectDetails();

		// pdr.aboutEditIconClick();
		// pdr.descBoxClickNEntry();
		// pdr.descBoxSaveBtn();
		test.log(Status.INFO, "Completed task count");
		pdr.verifyCompletedTaskCount();

		test.log(Status.INFO, "Pending task count");
		pdr.verifyPendingTaskCount();

	}

}
