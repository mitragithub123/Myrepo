package testcomponents;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.LoginResources;

public class Login extends BaseTest {

	@Test // (retryAnalyzer=Retry.class)
	public void login() throws IOException, InterruptedException {
		WebDriver driver = initializeDriver();
		LoginResources ob = new LoginResources(driver);
		test = extent.createTest("Login Test", "Verify login functionality");
		test.assignCategory("Smoke Test");

		test.log(Status.INFO, "Navigate to OS Login page");
		logger.info("Navigate to OS Login page");
		ob.navigateToLoginPage();

		//test.log(Status.INFO, "Logo navigation verification");
		//logger.info("Logo navigation verification");
		//ob.logoClick();

		test.log(Status.INFO, "Create an instance of ReadConfig to retrieve email and password");
		ReadConfig config = new ReadConfig();
		String email = config.getEmail();
		String password = config.getPassword();

		test.log(Status.INFO, "Login page submission");
		logger.info("Login page submission");
		ob.loginToApp(email, password);
		Thread.sleep(5000);
	}

}
