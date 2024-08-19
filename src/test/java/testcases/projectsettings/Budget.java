package testcases.projectsettings;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import pages.ProjectSettingsBudgetResources;
import pages.ProjectSettingsOverviewResources;
import testcases.projectoverview.ProjectDetails;
import testcomponents.BaseTest;

public class Budget extends BaseTest {

	@BeforeMethod
	public void budget() throws IOException, InterruptedException {
		ProjectDetails pd = new ProjectDetails();
		pd.projectDetails();
		test = extent.createTest("Project settings overview Test", "Verify project settings overview functionality");
		test.assignCategory("Project settings overview Test");

		ProjectSettingsOverviewResources psor = new ProjectSettingsOverviewResources(driver);
		test.log(Status.INFO, "Navigate to project settings");
		psor.navigateToProjectSettings();

		ProjectSettingsBudgetResources psbr = new ProjectSettingsBudgetResources(driver);
		test.log(Status.INFO, "Navigate to project settings budget");
		psbr.navigateToBudget();
	}

	@Test(priority = 1)
	public void addBudgetData() throws IOException, InterruptedException {
		ProjectSettingsBudgetResources psbr = new ProjectSettingsBudgetResources(driver);
		test.log(Status.INFO, "Budget form positive validations");
		psbr.addDataToBudgetForm();
		test.log(Status.INFO, "Success toast message comparison");
		psbr.compareToastMessage("Budget updated successfully!");
	}

	@Test(priority = 2)
	public void addNegativeBudgetData() throws IOException, InterruptedException {
		ProjectSettingsBudgetResources psbr = new ProjectSettingsBudgetResources(driver);
		test.log(Status.INFO, "Budget form negative validations");
		psbr.addNegativeDataToBudgetForm();
		test.log(Status.INFO, "Print all error messages in console");
		psbr.captureErrorMessages();
	}

}
