package pages;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.github.javafaker.Faker;

public class CompanySettingsCustomers {
	public WebDriver driver;
	public Faker faker;

	public CompanySettingsCustomers(WebDriver driver) {
		this.driver = driver;
		this.faker = new Faker();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a[title='Customers']")
	public WebElement leftMenuCustomers;

	@FindBy(css = "button[title='Add Customer']")
	public WebElement addCustBtn;

	@FindBy(xpath = "(//input[@id='firstname'])[2]")
	public WebElement firstName;

	@FindBy(xpath = "(//input[@id='lastname'])[2]")
	public WebElement lastName;

	@FindBy(xpath = "(//input[@id='email'])[2]")
	public WebElement email;

	@FindBy(xpath = "(//select[contains(@name,'currency_code')])[2]")
	public WebElement currency;

	@FindBy(xpath = "(//input[@id='customer_organization'])[2]")
	public WebElement org;

	@FindBy(xpath = "(//button[@title='Save'][normalize-space()='Save'])[2]")
	public WebElement saveBtn;

	@FindBy(xpath = "(//button[contains(@title,'Cancel')][normalize-space()='Cancel'])[2]")
	public WebElement cancelBtn;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > button:nth-child(1)")
	public WebElement closeBtn;

	@FindBy(css = "tbody tr:nth-child(1) td:nth-child(2) span:nth-child(1)")
	public WebElement nameInListing;

	@FindBy(css = "tbody tr:nth-child(1) td:nth-child(3) span:nth-child(1)")
	public WebElement orgInListing;

	@FindBy(css = "tbody tr:nth-child(1) td:nth-child(4) span:nth-child(1)")
	public WebElement emailInListing;

	@FindBy(css = "tbody tr:nth-child(1) td:nth-child(5) span:nth-child(1)")
	public WebElement currencyInListing;

	@FindBy(css = "tbody tr:nth-child(1) td:nth-child(6) span:nth-child(1)")
	public WebElement statusInListing;

	@FindBy(css = ".Toastify__toast-body > div:nth-child(2)")
	public WebElement successToast;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(2) > div:nth-child(3)")
	public WebElement lastNameErrorMsg;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(3) > div:nth-child(3)")
	public WebElement emailErrorMsg;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(5) > div:nth-child(3)")
	public WebElement orgErrorMsg;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]")
	public WebElement kebabMenu;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Edit'])[1]")
	public WebElement edit;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Remove'])[1]")
	public WebElement remove;

	@FindBy(xpath = "(//input[@id='firstname'])[1]")
	public WebElement firstNameEdit;

	@FindBy(xpath = "(//input[@id='lastname'])[1]")
	public WebElement lastNameEdit;

	@FindBy(xpath = "(//input[@id='email'])[1]")
	public WebElement emailEdit;

	@FindBy(xpath = "(//input[@id='customer_organization'])[1]")
	public WebElement orgEdit;

	@FindBy(css = "button[title='Update']")
	public WebElement saveBtnEdit;

	@FindBy(xpath = "(//button[contains(@title,'Cancel')][normalize-space()='Cancel'])[1]")
	public WebElement cancelBtnEdit;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")
	public WebElement closeBtnEdit;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Remove'])[1]")
	public WebElement removeIcon;

	@FindBy(xpath = "//button[normalize-space()='Yes']")
	public WebElement deletePopUpYesBtn;

	@FindBy(xpath = "//button[normalize-space()='No']")
	public WebElement deletePopUpNoBtn;

	public void navigateToCustomers() throws InterruptedException {
		leftMenuCustomers.click();
		Thread.sleep(3000);
	}

	public void clickAddCustBtn() throws InterruptedException {
		addCustBtn.click();
		Thread.sleep(3000);
	}

	public void addValidDataInCustPopup() throws InterruptedException {
		String firstNameField = faker.name().firstName();
		String lastNameField = faker.name().lastName();
		String emailField = faker.internet().safeEmailAddress();
		String orgField = faker.company().name();

		firstName.sendKeys(firstNameField);
		lastName.sendKeys(lastNameField);
		email.sendKeys(emailField);
		org.sendKeys(orgField);

		Select select = new Select(currency);
		select.selectByValue("INR");

		saveBtn.click();
		Thread.sleep(5000);

		System.out.println("Customer name: " + nameInListing.getText());
		System.out.println("Customer organization: " + orgInListing.getText());
		System.out.println("Customer email: " + emailInListing.getText());
		System.out.println("Customer currency: " + currencyInListing.getText());
		System.out.println("Customer status: " + statusInListing.getText());

		Assert.assertEquals(nameInListing.getText(), firstNameField, "Name does not match");
		Assert.assertEquals(orgInListing.getText(), orgField, "Organization does not match");
		Assert.assertEquals(emailInListing.getText(), emailField, "Email does not match");
		Assert.assertEquals(currencyInListing.getText(), "INR", "Currency does not match");
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

	public void cancelBtnClick() throws InterruptedException {
		cancelBtn.click();
		Thread.sleep(3000);
	}

	public void closeBtnClick() throws InterruptedException {
		closeBtn.click();
		Thread.sleep(3000);
	}

	public void addCustNeg() throws InterruptedException {
		String firstNameField = faker.name().firstName();
		firstName.sendKeys(firstNameField);
		saveBtn.click();
		Thread.sleep(5000);

		System.out.println("Add customer popup error messages are: ");
		System.out.println(lastNameErrorMsg.getText());
		System.out.println(emailErrorMsg.getText());
		System.out.println(orgErrorMsg.getText());
	}

	public void editCust() throws InterruptedException {
		kebabMenu.click();
		edit.click();
		Thread.sleep(3000);

		firstNameEdit.clear();
		Thread.sleep(2000);
		lastNameEdit.clear();
		Thread.sleep(2000);
		// emailEdit.clear();
		// Thread.sleep(4000);
		orgEdit.clear();
		Thread.sleep(2000);

		String firstNameField = faker.name().firstName();
		String lastNameField = faker.name().lastName();
		// String emailField = faker.internet().safeEmailAddress();
		String orgField = faker.company().name();

		firstNameEdit.sendKeys(firstNameField);
		lastNameEdit.sendKeys(lastNameField);
		// Thread.sleep(3000);
		// emailEdit.sendKeys(emailField);
		orgEdit.sendKeys(orgField);

		System.out.println("Edited Customer name: " + nameInListing.getText());
		System.out.println("Edited Customer organization: " + orgInListing.getText());
		System.out.println("Edited Customer email: " + emailInListing.getText());
		System.out.println("Edited Customer currency: " + currencyInListing.getText());
		System.out.println("Edited Customer status: " + statusInListing.getText());

		saveBtnEdit.click();
	}

	public void clickOnEdit() throws InterruptedException {
		kebabMenu.click();
		edit.click();
		Thread.sleep(3000);
	}

	public void cancelBtnClickEdit() throws InterruptedException {
		cancelBtnEdit.click();
		Thread.sleep(3000);
	}

	public void closeBtnClickEdit() throws InterruptedException {
		closeBtnEdit.click();
		Thread.sleep(3000);
	}

	public void deleteCustomer() throws TimeoutException, InterruptedException {
		kebabMenu.click();
		Thread.sleep(3000);
		removeIcon.click();
		Thread.sleep(3000);

		deletePopUpNoBtn.click();
		Thread.sleep(3000);

		kebabMenu.click();
		Thread.sleep(3000);
		removeIcon.click();
		Thread.sleep(3000);

		deletePopUpYesBtn.click();
		Thread.sleep(3000);
	}
}
