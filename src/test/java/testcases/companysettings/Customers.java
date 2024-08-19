package testcases.companysettings;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.CompanySettingsCustomers;
import pages.CompanySettingsOverviewResources;
import testcomponents.BaseTest;
import testcomponents.LoginNew;

public class Customers extends BaseTest {
	@BeforeMethod
	public void customer() throws IOException, InterruptedException {
		driver = initializeDriver();
		LoginNew lgn = new LoginNew(driver);
		test = extent.createTest("Company settings customers Test", "Verify Company settings customers functionality");
		test.assignCategory("Company settings overview Test");
		lgn.login();

		CompanySettingsOverviewResources csor = new CompanySettingsOverviewResources(driver);
		test.log(Status.INFO, "Navigate to company settings overview page");
		csor.navigateToCompanySettingsOverview();

		CompanySettingsCustomers csc = new CompanySettingsCustomers(driver);
		test.log(Status.INFO, "Navigate to company settings Customers page");
		csc.navigateToCustomers();
	}

	@Test(priority = 1)
	public void verifyOverview() throws IOException, InterruptedException {
		CompanySettingsCustomers csc = new CompanySettingsCustomers(driver);
		test.log(Status.INFO, "Click on add customer button");
		csc.clickAddCustBtn();

		test.log(Status.INFO, "Add customer popup postive validations");
		csc.addValidDataInCustPopup();

		test.log(Status.INFO, "Success toast message validation");
		csc.compareToastMessage("Customer Created Successfully!");
	}

	@Test(priority = 2)
	public void verifysaveNCancelBtn() throws IOException, InterruptedException {
		CompanySettingsCustomers csc = new CompanySettingsCustomers(driver);
		test.log(Status.INFO, "Click on add customer button");
		csc.clickAddCustBtn();

		test.log(Status.INFO, "Click on cancel button");
		csc.cancelBtnClick();

		test.log(Status.INFO, "Click on add customer button again");
		csc.clickAddCustBtn();

		test.log(Status.INFO, "Click on close button");
		csc.closeBtnClick();
	}

	@Test(priority = 3)
	public void verifyAddCustPopupErrorMsg() throws IOException, InterruptedException {
		CompanySettingsCustomers csc = new CompanySettingsCustomers(driver);
		test.log(Status.INFO, "Click on add customer button");
		csc.clickAddCustBtn();

		test.log(Status.INFO, "Enter first name and click on save button & print error messages in console");
		csc.addCustNeg();
	}

	@Test(priority = 4)
	public void verifyEditCust() throws IOException, InterruptedException {
		CompanySettingsCustomers csc = new CompanySettingsCustomers(driver);
		test.log(Status.INFO, "Click on add customer button");
		csc.clickAddCustBtn();

		test.log(Status.INFO, "Add customer popup postive validations");
		csc.addValidDataInCustPopup();

		test.log(Status.INFO, "Verify edit customer popup");
		csc.editCust();

		test.log(Status.INFO, "Success toast message validation");
		csc.compareToastMessage("Customer Updated Successfully!");
	}

	@Test(priority = 5)
	public void verifysaveNCancelBtnEditPopup() throws IOException, InterruptedException {
		CompanySettingsCustomers csc = new CompanySettingsCustomers(driver);
		test.log(Status.INFO, "Click on edit customer button");
		csc.clickOnEdit();

		test.log(Status.INFO, "Click on cancel button");
		csc.cancelBtnClickEdit();

		test.log(Status.INFO, "Click on edit customer button again");
		csc.clickOnEdit();

		test.log(Status.INFO, "Click on close button");
		csc.closeBtnClickEdit();
	}

	@Test(priority = 6)
	public void verifyDeleteCustomer() throws IOException, InterruptedException, TimeoutException {
		CompanySettingsCustomers csc = new CompanySettingsCustomers(driver);
		test.log(Status.INFO, "Click on add customer button");
		csc.clickAddCustBtn();

		test.log(Status.INFO, "Add customer popup postive validations");
		csc.addValidDataInCustPopup();

		test.log(Status.INFO, "Delete popup validations");
		csc.deleteCustomer();

		test.log(Status.INFO, "Success toast message validation");
		csc.compareToastMessage("Customer Deleted Successfully!");
	}

}
