package testcases.companysettings;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.CompanySettingsApiKeyResources;
import pages.CompanySettingsOverviewResources;
import testcomponents.BaseTest;
import testcomponents.LoginNew;

public class CompanySettingsApiKey extends BaseTest {
	@BeforeMethod
	public void apiKey() throws IOException, InterruptedException {
		driver = initializeDriver();
		LoginNew lgn = new LoginNew(driver);
		test = extent.createTest("Company settings api key Test", "Verify Company settings api key  functionality");
		test.assignCategory("Company settings overview Test");
		lgn.login();

		CompanySettingsOverviewResources csor = new CompanySettingsOverviewResources(driver);
		test.log(Status.INFO, "Navigate to company settings overview page");
		csor.navigateToCompanySettingsOverview();

		CompanySettingsApiKeyResources csakr = new CompanySettingsApiKeyResources(driver);
		test.log(Status.INFO, "Navigate to company settings api key page");
		csakr.goToApiKeyPage();
	}

	@Test(priority = 1)
	public void verifyOverview() throws IOException, InterruptedException {
		CompanySettingsApiKeyResources csakr = new CompanySettingsApiKeyResources(driver);
		test.log(Status.INFO, "Generate api key");
		csakr.apiKeyRegenerate();

		// test.log(Status.INFO, "Success toast message validation");
		// csakr.compareToastMessage("Task Type created successfully!");

		test.log(Status.INFO, "Click on eye icon twice");
		csakr.clickEyeIcon();
		
		test.log(Status.INFO, "Print api key in console");
		csakr.printApiKey();
	}

}
