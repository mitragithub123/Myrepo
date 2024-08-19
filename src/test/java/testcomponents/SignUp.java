package testcomponents;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.qa.util.Encryption;

import pages.SignUpResources;

public class SignUp extends BaseTest {
	@Test
	public static void signup() throws IOException, InterruptedException {
		WebDriver driver = initializeDriver();
		SignUpResources ob = new SignUpResources(driver);
		test = extent.createTest("Sign up Test", "Verify Sign up functionality");
		test.assignCategory("Sign up Test");

		test.log(Status.INFO, "Orangescrum landing page");
		logger.info("Orangescrum landing page");
		ob.navigateToSignUpPage();

		String encryptedPassword = Encryption.encryptPassword("MTIzNDU2Nzg5MA==");

		test.log(Status.INFO, "Submit the form");
		logger.info("Submit the form");
		ob.signupToAppPage(encryptedPassword);

	}

}
