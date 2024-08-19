package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class ProjectSettingsResourceCostResources {
	public WebDriver driver;
	public Faker faker;

	public ProjectSettingsResourceCostResources(WebDriver driver) {
		this.driver = driver;
		this.faker = new Faker();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h3[text()='Phoenix']")
	public WebElement projectNamePhoenix;

	@FindBy(css = "a[title='Project Settings']")
	public WebElement projectSettings;

	@FindBy(xpath = "//a[text()='Resource Cost']")
	public WebElement leftMenuResourceCost;

	@FindBy(xpath = "//button[text()='Add New']")
	public WebElement addResourceBtn;

	@FindBy(css = "select[name='resource_id']")
	public WebElement selectUser;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(2) > button:nth-child(2)")
	public WebElement saveBtn;

	@FindBy(css = "button[class='flex justify-center rounded border border-stroke py-2 px-6 font-medium text-black hover:shadow-1 dark:border-strokedark dark:text-white text-sm']")
	public WebElement cancelBtn;

	@FindBy(css = "div[class='relative m-auto w-full max-w-180 rounded-sm border border-stroke bg-gray p-4 shadow-default dark:border-strokedark dark:bg-meta-4 sm:p-8 xl:p-10'] button[class='absolute right-1 top-1 sm:right-5 sm:top-5']")
	public WebElement closeBtn;

	@FindBy(xpath = "//div[@class='Toastify__toast-body']")
	public WebElement successToast;

	@FindBy(css = ".inline-flex.items-center.bg-gray-50.text-sm.text-gray-600")
	public List<WebElement> resourceNames;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > div:nth-child(2) > button:nth-child(1)")
	public WebElement kebabMenu;

	@FindBy(css = "div[class='absolute left-0 top-full z-40 w-46 space-y-1 rounded-sm border border-stroke bg-white p-1.5 shadow-default dark:border-strokedark dark:bg-boxdark block'] button:nth-child(1)")
	public WebElement kebabMenuEdit;

	@FindBy(css = "tbody button:nth-child(2)")
	public WebElement kebabMenuReset;

	@FindBy(css = "body tr td:nth-child(4) input:nth-child(1)")
	public WebElement costToClient;

	@FindBy(css = "body tr td:nth-child(5) input:nth-child(1)")
	public WebElement costToCompany;

	@FindBy(xpath = "//h2[text()='Resource Cost']")
	public WebElement clickOnPageHeader;

	@FindBy(xpath = "//button[normalize-space()='No']")
	public WebElement resetPopupNoBtn;

	@FindBy(xpath = "//button[normalize-space()='Yes']")
	public WebElement resetPopupYesBtn;

	public void navigateToResourceCost() throws InterruptedException {
		projectNamePhoenix.click();
		Thread.sleep(3000);
		projectSettings.click();
		Thread.sleep(3000);
		leftMenuResourceCost.click();
		Thread.sleep(3000);
	}

	public void addResource() throws InterruptedException {
		addResourceBtn.click();
		Thread.sleep(3000);
		Select select = new Select(selectUser);
		select.selectByIndex(2);
		Thread.sleep(3000);
		saveBtn.click();
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

	public List<String> getResourceNames() {
		List<String> names = new ArrayList<>();
		for (WebElement element : resourceNames) {
			names.add(element.getText());
		}
		return names;
	}

	public boolean isResourcePresent(WebDriver driver, String resourceName) {
		List<String> resourceNames = getResourceNames();
		return resourceNames.contains(resourceName);
	}

	public void addResourceNegativeValidation() throws InterruptedException {
		addResourceBtn.click();
		Thread.sleep(3000);
		cancelBtn.click();
		addResourceBtn.click();
		Thread.sleep(3000);
		closeBtn.click();
	}

	public void addCost() {
		kebabMenu.click();
		kebabMenuEdit.click();
		costToClient.clear();
		costToCompany.clear();
		String costToClientValue = faker.number().digits(5);
		String costToCompanyValue = faker.number().digits(5);
		costToClient.sendKeys(costToClientValue);
		costToCompany.sendKeys(costToCompanyValue);
		System.out.println("Cost to Client: " + costToClientValue);
		System.out.println("Cost to Company: " + costToCompanyValue);
		clickOnPageHeader.click();
	}

	public void resetCost() {
		kebabMenu.click();
		kebabMenuReset.click();
		resetPopupNoBtn.click();
		kebabMenu.click();
		kebabMenuReset.click();
		resetPopupYesBtn.click();
	}
}
