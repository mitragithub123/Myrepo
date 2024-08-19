package testcases.profilesettings;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.DataProviderTestDataHashMapChangePassword;
import pages.ProfileSettingsChangePasswordResources;
import testcomponents.BaseTest;
import testcomponents.LoginNew;

public class ChangePassword extends BaseTest {
	public WebDriver driver;

	public ChangePassword() {
		super();
	}

	@DataProvider(name = "changePassword")
	public Object[][] getPasswordChangeData() {
		return DataProviderTestDataHashMapChangePassword.getPasswordChangeData();
	}

	@Test(dataProvider = "changePassword")
	public void testChangePassword(HashMap<String, String> input) throws InterruptedException, IOException {
		driver = initializeDriver();
		LoginNew lgn = new LoginNew(driver);
		test = extent.createTest("Profile settings change password Test",
				"Verify Profile settings change password functionality");
		test.assignCategory("Profile settings change password Test");
		lgn.login();

		ProfileSettingsChangePasswordResources pscpr = new ProfileSettingsChangePasswordResources(driver);
		test.log(Status.INFO, "Navigate to change password page");
		pscpr.navigateToChangePassword();

		pscpr.passwordChangeDataProvider(input.get("currentPassword"), input.get("newPassword"),
				input.get("confirmPassword"));

		test.log(Status.INFO, "Closing the window");
		driver.quit();
	}

	@Test(priority = 1)
	public void verifyEyeIcon() throws IOException, InterruptedException {
		driver = initializeDriver();
		LoginNew lgn = new LoginNew(driver);
		test = extent.createTest("Profile settings change password Test",
				"Verify Profile settings change password functionality");
		test.assignCategory("Profile settings change password Test");
		lgn.login();

		ProfileSettingsChangePasswordResources pscpr = new ProfileSettingsChangePasswordResources(driver);
		test.log(Status.INFO, "Navigate to change password page");
		pscpr.navigateToChangePassword();
		
		test.log(Status.INFO, "Eye icon check");
		pscpr.eyeIconCheck();
	}
}
