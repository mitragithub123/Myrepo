package testcases.signup;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.qa.util.Encryption;

import pages.LoginResources;
import pages.SignUpResources;
import testcomponents.BaseTest;

public class SignUpTest extends BaseTest {
	@Test
	public static void signup() throws IOException, InterruptedException {
		WebDriver driver = initializeDriver();
		SignUpResources ob = new SignUpResources(driver);
		test = extent.createTest("Sign up Test", "Verify sign up functionality");
		test.assignCategory("Sign up Test");

		test.log(Status.INFO, "Creating a project");
		logger.info("Orangescrum landing page");
		ob.navigateToSignUpPage();

		String encryptedPassword = Encryption.encryptPassword("MTIzNDU2Nzg5MA==");

		test.log(Status.INFO, "Submit the form");
		logger.info("Submit the form");
		ob.signupToAppPage(encryptedPassword);

		LoginResources lr = new LoginResources(driver);
		test.log(Status.INFO, "URL validation after sign up");
		logger.info("URL validation after sign up");
		lr.validateUrl(driver);

		test.log(Status.INFO, "Closing the window");
		logger.info("Closing the window");
		driver.close();

	}

}
