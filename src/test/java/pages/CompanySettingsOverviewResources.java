package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

public class CompanySettingsOverviewResources {
	public WebDriver driver;
	public Faker faker;

	public CompanySettingsOverviewResources(WebDriver driver) {
		this.driver = driver;
		faker = new Faker();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div[class='relative flex h-8 w-8 items-center justify-center rounded-full border-[0.5px] border-stroke bg-gray hover:text-primary dark:border-strokedark dark:bg-meta-4 dark:text-white cursor-pointer']")
	public WebElement settingsIcon;

	@FindBy(xpath = "//h6[text()='Company Settings']")
	public WebElement companySettings;

	@FindBy(xpath = "//input[@name='name']")
	public WebElement nameField;

	@FindBy(xpath = "//input[@name='website']")
	public WebElement websiteField;

	@FindBy(xpath = "//input[@name='phone']")
	public WebElement contactNumberField;

	@FindBy(xpath = "//select[@name='currency_code']")
	public WebElement currencyField;

	@FindBy(xpath = "//textarea[@placeholder='Add organization description']")
	public WebElement descriptionField;

	@FindBy(css = "button[value='Submit']")
	public WebElement updateBtn;

	@FindBy(css = ".Toastify__toast-body > div:nth-child(2)")
	public WebElement successToast;

	@FindBy(css = "div[class='font-semibold text-black text-[14px]']")
	public WebElement orgOwnerName;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > p:nth-child(2)")
	public WebElement orgOwnerEmail;

	@FindBy(css = "div[class='flex items-center justify-between gap-1 p-2 bg-[#8992d7]']")
	public WebElement osLogo;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/nav[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")
	public WebElement leftMenuCompanyName;

	public void navigateToCompanySettingsOverview() throws InterruptedException {
		settingsIcon.click();
		Thread.sleep(2000);
		companySettings.click();
		Thread.sleep(4000);
	}

	public void companyData(String currencyCode) throws InterruptedException {
		String fakeName = faker.name().fullName();
		setFakeName(fakeName);
		String fakeWebsite = faker.internet().url();
		String fakeContactNumber = faker.phoneNumber().phoneNumber();
		String fakeDescription = faker.lorem().sentence();

		String shortName = generateShortName(fakeName);

		System.out.println("Company Name: " + fakeName);
		System.out.println("Company Website: " + fakeWebsite);
		System.out.println("Company Contact Number: " + fakeContactNumber);
		System.out.println("Company Description: " + fakeDescription);

		nameField.clear();
		Thread.sleep(2000);
		nameField.sendKeys(fakeName);

		websiteField.clear();
		Thread.sleep(2000);
		websiteField.sendKeys(fakeWebsite);

		contactNumberField.clear();
		Thread.sleep(2000);
		contactNumberField.sendKeys(fakeContactNumber);

		Select currencySelect = new Select(currencyField);
		currencySelect.selectByValue(currencyCode);
		Thread.sleep(2000);

		descriptionField.clear();
		Thread.sleep(2000);
		descriptionField.sendKeys(fakeDescription);

		updateBtn.click();
		Thread.sleep(2000);
	}

	public String fakeName;

	public String getFakeName() {
		return fakeName;
	}

	public void setFakeName(String fakeName) {
		this.fakeName = fakeName;
	}

	public String generateShortName(String Name) {
		String[] words = Name.split("\\s+");
		if (words.length >= 2) {
			return Character.toString(words[0].toUpperCase().charAt(0))
					+ Character.toString(words[1].toUpperCase().charAt(0));
		} else if (words.length == 1) {
			return Character.toString(words[0].toUpperCase().charAt(0));
		} else {
			return "";
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

	public void verifyorganizationOwnerDetails() {
		System.out.println("Oragnization owner name is: " + orgOwnerName.getText());
		System.out.println("Oragnization owner email is: " + orgOwnerEmail.getText());
	}

	public void companyDataNegative() throws InterruptedException {
		websiteField.clear();
		Thread.sleep(2000);

		contactNumberField.clear();
		Thread.sleep(2000);

		descriptionField.clear();
		Thread.sleep(3000);

		updateBtn.click();
		Thread.sleep(2000);
	}

	public void companyNameMatchWithLeftMenu() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(nameField));
		String nameFieldText = nameField.getAttribute("value").trim();
		System.out.println("Company name from name field: " + nameFieldText);
		Thread.sleep(3000);

		osLogo.click();
		Thread.sleep(2000);

		String leftMenuCompanyNameText = leftMenuCompanyName.getText().trim();
		System.out.println("Company name from left menu: " + leftMenuCompanyNameText);

		if (nameFieldText.equals(leftMenuCompanyNameText)) {
			System.out.println("Company name is matching");

		} else {
			System.out.println("Company name is not matching");
		}
	}

}
