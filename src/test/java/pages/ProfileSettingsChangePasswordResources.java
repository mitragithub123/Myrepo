package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.Faker;

public class ProfileSettingsChangePasswordResources {
	public WebDriver driver;
	public Faker faker;

	public ProfileSettingsChangePasswordResources(WebDriver driver) {
		this.driver = driver;
		faker = new Faker();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > header:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(2) > figure:nth-child(1) > img:nth-child(1)")
	public WebElement userLogo;

	@FindBy(xpath = "//a[normalize-space()='My Profile']")
	public WebElement myProfileLink;

	@FindBy(css = "a[title='Change Password']")
	public WebElement changePasswordLink;

	@FindBy(css = "input[placeholder='Enter your current password']")
	public WebElement currentPassword;

	@FindBy(css = "input[placeholder='Enter your new password']")
	public WebElement newPassword;

	@FindBy(css = "input[placeholder='Enter your new password again']")
	public WebElement confirmPassword;

	@FindBy(css = "button[title='Save']")
	public WebElement saveBtn;

	@FindBy(css = ".absolute.right-4.top-4")
	public List<WebElement> eyeIcons;

	public void navigateToChangePassword() throws InterruptedException {
		Thread.sleep(3000);
		userLogo.click();
		Thread.sleep(3000);
		myProfileLink.click();
		Thread.sleep(3000);
		changePasswordLink.click();
		Thread.sleep(3000);
	}

	public void passwordChangeDataProvider(String currentPass, String newPass, String confirmPass)
			throws InterruptedException {
		currentPassword.sendKeys(currentPass);
		Thread.sleep(3000);
		newPassword.sendKeys(newPass);
		Thread.sleep(3000);
		confirmPassword.sendKeys(confirmPass);
		Thread.sleep(3000);
		saveBtn.click();
	}

	public void eyeIconCheck() throws InterruptedException {
		currentPassword.sendKeys(faker.lorem().characters(8, true));
		Thread.sleep(1000);
		newPassword.sendKeys(faker.lorem().characters(8, true));
		Thread.sleep(1000);
		confirmPassword.sendKeys(faker.lorem().characters(8, true));
		Thread.sleep(1000);

		for (WebElement eyeIcon : eyeIcons) {
			for (int i = 1; i <= 2; i++) {
				eyeIcon.click();
				Thread.sleep(1000);
			}
		}
	}

}
