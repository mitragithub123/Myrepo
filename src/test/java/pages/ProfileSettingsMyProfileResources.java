package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class ProfileSettingsMyProfileResources {
	public WebDriver driver;
	public Faker faker;

	public ProfileSettingsMyProfileResources(WebDriver driver) {
		this.driver = driver;
		this.faker = new Faker();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > header:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(2) > figure:nth-child(1) > img:nth-child(1)")
	public WebElement userLogo;

	@FindBy(xpath = "//a[normalize-space()='My Profile']")
	public WebElement myProfileLink;

	@FindBy(css = "#fullName")
	public WebElement firstName;

	@FindBy(css = "input[name='last_name']")
	public WebElement lastName;

	@FindBy(css = "input[name='phone_number']")
	public WebElement phoneNumber;

	@FindBy(css = "select[name='time_zone']")
	public WebElement timeZoneDropdown;

	@FindBy(css = "select[name='time_format']")
	public WebElement timeFormatDropdown;

	@FindBy(css = "button[title='Update'][type='submit']")
	public WebElement updateBtn;

	@FindBy(xpath = "(//button[@title='Cancel'][normalize-space()='Cancel'])[1]")
	public WebElement cancelBtn;

	@FindBy(xpath = "//div[@class='Toastify__toast-body']")
	public WebElement successToast;

	@FindBy(xpath = "//div[@class='Toastify__toast-icon']")
	public WebElement successToastProfilePicture;

	@FindBy(css = "input[type='file']")
	public WebElement fileClick;

	@FindBy(css = "button[title='Update'][type='button']")
	public WebElement fileUpdateBtn;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > header:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(2) > figure:nth-child(1) > img:nth-child(1)")
	public WebElement profileImage;

	public void navigateToProfileSettings() throws InterruptedException {
		userLogo.click();
		myProfileLink.click();
		Thread.sleep(3000);
	}

	public void personalInfoUpdate() throws InterruptedException {
		firstName.clear();
		Thread.sleep(3000);
		firstName.sendKeys(faker.name().firstName());
		Thread.sleep(3000);

		lastName.clear();
		Thread.sleep(3000);
		lastName.sendKeys(faker.name().lastName());
		Thread.sleep(3000);

		Select selectTimeZone = new Select(timeZoneDropdown);
		selectTimeZone.selectByValue("Indian/Reunion");
		Thread.sleep(3000);

		Select selectTimeFormat = new Select(timeFormatDropdown);
		selectTimeFormat.selectByValue("24-hour");
		Thread.sleep(3000);

		updateBtn.click();
	}

	public String getToastMessageText() throws InterruptedException {
		Thread.sleep(3000);
		return successToast.getText();
	}

	public void compareToastMessage(String expectedToastMessage) throws InterruptedException {
		String actualToastMessage = getToastMessageText();
		if (actualToastMessage.equals(expectedToastMessage)) {
			System.out.println("Toast message is as expected: " + expectedToastMessage);
		} else {
			System.out.println("Toast message is not as expected. Expected: " + expectedToastMessage + ", Actual: "
					+ actualToastMessage);
			throw new AssertionError("Toast message is not as expected.");
		}
		System.out.println("Correct toast message: " + actualToastMessage);
	}

	public void personalInfoUpdateCancel() throws InterruptedException {
		String initialFirstName = firstName.getAttribute("value");
		String initialLastName = lastName.getAttribute("value");
		String initialTimeZone = new Select(timeZoneDropdown).getFirstSelectedOption().getAttribute("value");
		String initialTimeFormat = new Select(timeFormatDropdown).getFirstSelectedOption().getAttribute("value");

		firstName.clear();
		Thread.sleep(3000);
		firstName.sendKeys(faker.name().firstName());
		Thread.sleep(3000);

		lastName.clear();
		Thread.sleep(3000);
		lastName.sendKeys(faker.name().lastName());
		Thread.sleep(3000);

		Select selectTimeZone = new Select(timeZoneDropdown);
		selectTimeZone.selectByValue("Indian/Reunion");
		Thread.sleep(3000);

		Select selectTimeFormat = new Select(timeFormatDropdown);
		selectTimeFormat.selectByValue("24-hour");
		Thread.sleep(3000);

		cancelBtn.click();

		boolean isClickable = cancelBtn.isEnabled();
		if (isClickable) {
			System.out.println("Cancel button is clickable.");
		} else {
			System.out.println("Cancel button is not clickable.");
		}

		if (firstName.getAttribute("value").equals(initialFirstName)
				&& lastName.getAttribute("value").equals(initialLastName)
				&& new Select(timeZoneDropdown).getFirstSelectedOption().getAttribute("value").equals(initialTimeZone)
				&& new Select(timeFormatDropdown).getFirstSelectedOption().getAttribute("value")
						.equals(initialTimeFormat)) {
			System.out.println("Page data has been reset after clicking cancel button.");
		} else {
			System.out.println("Page data has not been reset after clicking cancel button.");
		}
	}

	public void uploadProfilePicture() throws InterruptedException {
		File file = new File(".\\images\\nature-image-for-website.jpg");
		String absolutePath = file.getAbsolutePath();
		fileClick.sendKeys(absolutePath);
		Thread.sleep(3000);
		fileUpdateBtn.click();
		if (profileImage.isDisplayed()) {
			System.out.println("Profile picture is displayed");
		} else {
			System.out.println("Profile picture is not displayed");
		}

	}

	public void uploadProfilePictureByRobot(String filePath) throws AWTException {
		fileClick.click();

		StringSelection ss = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Robot robot = new Robot();
		robot.delay(1000);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		fileUpdateBtn.click();

	}

	public String getToastMessageTextAfterProfilePictureUpload() throws InterruptedException {
		Thread.sleep(3000);
		return successToastProfilePicture.getText();
	}

	public void compareToastMessageAfterProfilePictureUpload(String expectedToastMessage) throws InterruptedException {
		String actualToastMessage = getToastMessageText();
		if (actualToastMessage.equals(expectedToastMessage)) {
			System.out.println("Toast message is as expected: " + expectedToastMessage);
		} else {
			System.out.println("Toast message is not as expected. Expected: " + expectedToastMessage + ", Actual: "
					+ actualToastMessage);
			throw new AssertionError("Toast message is not as expected.");
		}
		System.out.println("Correct toast message: " + actualToastMessage);
	}

}
