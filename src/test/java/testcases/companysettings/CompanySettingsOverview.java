package testcases.companysettings;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.CompanySettingsOverviewResources;
import testcomponents.BaseTest;
import testcomponents.LoginNew;

public class CompanySettingsOverview extends BaseTest {
	@BeforeMethod
	public void overview() throws IOException, InterruptedException {
		driver = initializeDriver();
		LoginNew lgn = new LoginNew(driver);
		test = extent.createTest("Company settings overview Test", "Verify Company settings overview functionality");
		test.assignCategory("Company settings overview Test");
		lgn.login();

		CompanySettingsOverviewResources csor = new CompanySettingsOverviewResources(driver);
		test.log(Status.INFO, "Navigate to company settings overview page");
		csor.navigateToCompanySettingsOverview();
	}

	@Test(priority = 1)
	public void verifyOverview() throws IOException, InterruptedException {
		CompanySettingsOverviewResources csor = new CompanySettingsOverviewResources(driver);
		test.log(Status.INFO, "Company data");
		csor.companyData("INR");

		String fakeName = csor.getFakeName();
		test.log(Status.INFO, "Verify company short name");
		String shortName = csor.generateShortName(fakeName);
		System.out.println("Short Name: " + shortName);

		// test.log(Status.INFO, "Success toast message validation");
		// csor.compareToastMessage("Company details updated successfully!");
	}

	@Test(priority = 2)
	public void verifyOrgDetails() throws IOException, InterruptedException {
		CompanySettingsOverviewResources csor = new CompanySettingsOverviewResources(driver);
		test.log(Status.INFO, "Organizations details verify");
		csor.verifyorganizationOwnerDetails();
	}

	@Test(priority = 3, dependsOnMethods = "verifyOverview")
	public void verifyOverviewNegative() throws IOException, InterruptedException {
		CompanySettingsOverviewResources csor = new CompanySettingsOverviewResources(driver);
		test.log(Status.INFO, "Company data negative validations");
		csor.companyDataNegative();
	}

	@Test(priority = 4)
	public void verifycompanyNameMatchWithLeftMenu() throws IOException, InterruptedException {
		CompanySettingsOverviewResources csor = new CompanySettingsOverviewResources(driver);
		test.log(Status.INFO, "Company name match with left menu");
		csor.companyNameMatchWithLeftMenu();
	}

}
