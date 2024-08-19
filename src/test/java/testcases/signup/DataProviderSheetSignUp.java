package testcases.signup;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import base.ExcelDataReader;
import pages.LoginResources;
import pages.SignUpResources;
import testcomponents.BaseTest;

public class DataProviderSheetSignUp extends BaseTest {
	@DataProvider(name = "signupData")
	public Object[][] signupData() throws IOException {
		String excelPath = "D:\\testdatasignup.xlsx";
		return ExcelDataReader.readExcelData(excelPath);
	}

	@Test(dataProvider = "signupData")
	public void loginTest(String email, String password) throws IOException, InterruptedException {
		logger = Logger.getLogger(DataProviderSheetSignUp.class);
		driver = initializeDriver();
		SignUpResources ob = new SignUpResources(driver);
		test = extent.createTest("Sign up Test dataProvider", "Verify Sign up functionality");
		test.assignCategory("Sign up Test dataProvider");

		test.log(Status.INFO, "Orangescrum landing page");
		logger.info("Orangescrum landing page");
		ob.navigateToSignUpPage();

		test.log(Status.INFO, "Submit the form");
		logger.info("Submit the form");
		ob.multipleSignUp(email, password);

		test.log(Status.INFO, "URL validation");
		logger.info("URL validation");
		LoginResources lr = new LoginResources(driver);
		lr.validateUrl(driver);
	}

}
