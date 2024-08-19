package testcases.login;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.qa.util.Encryption;

import pages.LoginResources;
import testcomponents.BaseTest;

public class LoginTest extends BaseTest {

	@Test
	public void measureLoginPageResponseTime() throws IOException, InterruptedException {
		WebDriver driver = initializeDriver();
		LoginResources loginPage = new LoginResources(driver);
		test = extent.createTest("Login Test", "Verify Login functionality");
		test.assignCategory("Login Test");

		test.log(Status.INFO, "Login to app");
		logger.info("Login to app");
		loginPage.navigateToLoginPage();

		test.log(Status.INFO, "OS logo click");
		logger.info("OS logo click");
		loginPage.logoClick();
		
		String encryptedPassword = Encryption.encryptPassword("MTIzNDU2Nzg5MA==");
		
		test.log(Status.INFO, "Login form submit");
		logger.info("Login form submit");
		loginPage.loginToApp("13j9lony@gmail.com", encryptedPassword);

		test.log(Status.INFO, "URL validation after Login");
		logger.info("URL validation after Login");
		loginPage.validateUrl(driver);

		test.log(Status.INFO, "Closing the driver");
		logger.info("Closing the driver");
		driver.quit();
	}
}
