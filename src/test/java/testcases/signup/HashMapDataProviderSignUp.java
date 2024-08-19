package testcases.signup;

import java.io.IOException;
import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.DataProviderTestDataHashMapSignUp;
import pages.SignUpResources;
import testcomponents.BaseTest;

public class HashMapDataProviderSignUp extends BaseTest {

	public WebDriver driver;

	public HashMapDataProviderSignUp() {
		super();
	}

	@DataProvider(name = "signup")
	public Object[][] getSignUpData() {
		return DataProviderTestDataHashMapSignUp.getSignUpData();
	}

	@Test(dataProvider = "signup")
	public void testSignUp(HashMap<String, String> input) throws InterruptedException, IOException {
		driver = initializeDriver();
		SignUpResources ob = new SignUpResources(driver);
		test = extent.createTest("Multiple sign up Test", "Verify sign up functionality using hash map");
		test.assignCategory("Multiple sign up Test");

		test.log(Status.INFO, "Orangescrum landing page");
		logger.info("Orangescrum landing page");
		ob.navigateToSignUpPage();

		test.log(Status.INFO, "Submit the form");
		logger.info("Submit the form");
		ob.multipleSignUp(input.get("email"), input.get("password"));
		// Assert.assertTrue(false);

		test.log(Status.INFO, "Closing the window");
		logger.info("Closing the window");
		driver.quit();
	}

}