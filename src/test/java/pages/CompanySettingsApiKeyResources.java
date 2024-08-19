package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.Faker;

public class CompanySettingsApiKeyResources {
	public WebDriver driver;
	public Faker faker;

	public CompanySettingsApiKeyResources(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.faker = new Faker();
	}

	@FindBy(xpath = "//a[text()='API Key']")
	WebElement leftMenuApiKeyLink;

	@FindBy(css = "button[title='Regenerate']")
	WebElement regenerateBtn;

	@FindBy(xpath = "//button[text()='No']")
	WebElement noBtn;

	@FindBy(xpath = "//button[text()='Yes']")
	WebElement yesBtn;

	@FindBy(css = ".ml-2")
	WebElement eyeIcon;

	@FindBy(css = ".Toastify__toast-body > div:nth-child(2)")
	public WebElement successToast;

	@FindBy(css = "p[class='flex justify-between']")
	public WebElement apiKeyText;

	public void goToApiKeyPage() throws InterruptedException {
		leftMenuApiKeyLink.click();
		Thread.sleep(3000);
	}

	public void apiKeyRegenerate() throws InterruptedException {
		regenerateBtn.click();
		Thread.sleep(2000);
		noBtn.click();
		Thread.sleep(2000);
		regenerateBtn.click();
		Thread.sleep(2000);
		yesBtn.click();
		Thread.sleep(2000);
	}

	public void clickEyeIcon() throws InterruptedException {
		for (int i = 1; i <= 2; i++) {
			eyeIcon.click();
			Thread.sleep(2000);
		}
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

	public void printApiKey() throws InterruptedException {
		eyeIcon.click();
		Thread.sleep(2000);
		String text = apiKeyText.getText().trim();
		System.out.println("Regenerated api key is: " + text);
	}

}
