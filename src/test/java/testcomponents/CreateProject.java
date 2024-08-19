package testcomponents;

import org.testng.annotations.Test;

import pages.ProjectListingResources;

public class CreateProject extends BaseTest {
	@Test
	public void createProject() throws InterruptedException {
		ProjectListingResources newOb = new ProjectListingResources(driver);

		logger.info("Create project button click");
		newOb.newProject();

		logger.info("Project name, description, advanced, priority field value set");
		newOb.addDetailsToProject();

		logger.info("Priority select");
		newOb.selectPriority("Medium");

		logger.info("Start date select");
		newOb.clickOnStartDate();

		logger.info("Submit button click");
		newOb.createPopUpSubmit();

		logger.info("Printing the project creation toast message");
		newOb.toastMessageDisplay();
	}
}
