package testcases.profilesettings;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.ProfileSettingsMyProfileResources;
import testcomponents.BaseTest;
import testcomponents.Login;

public class MyProfile extends BaseTest {
	@BeforeMethod
	public void profile() throws IOException, InterruptedException {
		Login login = new Login();
		test = extent.createTest("Profile settings my profile Test",
				"Verify Profile settings my profile functionality");
		test.assignCategory("Profile settings my profile Test");
		login.login();

		ProfileSettingsMyProfileResources psmpr = new ProfileSettingsMyProfileResources(driver);
		test.log(Status.INFO, "Navigate to profile settings my profile");
		psmpr.navigateToProfileSettings();

	}

	@Test(priority = 1)
	public void addPersonalData() throws IOException, InterruptedException {
		ProfileSettingsMyProfileResources psmpr = new ProfileSettingsMyProfileResources(driver);
		test.log(Status.INFO, "Personal info update");
		psmpr.personalInfoUpdate();

		test.log(Status.INFO, "Success toast message comparison");
		psmpr.compareToastMessage("User detail updated successfully");
	}

	@Test(priority = 2)
	public void addPersonalDataCancel() throws IOException, InterruptedException {
		ProfileSettingsMyProfileResources psmpr = new ProfileSettingsMyProfileResources(driver);
		test.log(Status.INFO, "Personal info update cancel");
		psmpr.personalInfoUpdateCancel();
	}

	@Test(priority = 3)
	public void profilePicUpdate() throws IOException, InterruptedException, AWTException {
		ProfileSettingsMyProfileResources psmpr = new ProfileSettingsMyProfileResources(driver);
		test.log(Status.INFO, "Profile picture update");
		psmpr.uploadProfilePicture();
		
		//String filePath="‪D:\\Mitra\\Data_mitra\\1681466621620.jpg";
		//psmpr.uploadProfilePictureByRobot(filePath);

		test.log(Status.INFO, "Success toast message after profile picture upload");
		psmpr.compareToastMessage("Image updated successfully");
	}

}
