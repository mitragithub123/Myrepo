package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class ProjectSettingsBudgetResources {
	public WebDriver driver;
	public Faker faker;

	public ProjectSettingsBudgetResources(WebDriver driver) {
		this.driver = driver;
		this.faker = new Faker();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a[title='Budget']")
	public WebElement leftMenuBudget;

	@FindBy(css = "select[name='currency_code']")
	public WebElement currency;

	@FindBy(css = "#Budgetcost")
	public WebElement totalBudget;

	@FindBy(css = "#Approvedcost")
	public WebElement approvedCost;

	@FindBy(css = "#min_tolerance")
	public WebElement minTolerance;

	@FindBy(css = "#max_tolerance")
	public WebElement maxTolerance;

	@FindBy(xpath = "//button[normalize-space()='Update']")
	public WebElement updateBtn;

	@FindBy(xpath = "//div[@class='Toastify__toast-body']")
	public WebElement successToast;

	@FindBy(css = ".text-red-500")
	public List<WebElement> errorMsg;

	public void navigateToBudget() {
		leftMenuBudget.click();
	}

	public void addDataToBudgetForm() throws InterruptedException {
		Select select = new Select(currency);
		select.selectByValue("INR");
		Thread.sleep(3000);

		String totalBudgetValue = faker.number().digits(5);
		totalBudget.sendKeys(totalBudgetValue);
		Thread.sleep(3000);

		String approvedCostValue = faker.number().digits(5);
		approvedCost.sendKeys(approvedCostValue);
		Thread.sleep(3000);

		int minTol = faker.number().numberBetween(0, 10); // Between 0 and 10 inclusive
		int maxTol = faker.number().numberBetween(minTol, 10); // Between minTol and 10 inclusive
		minTolerance.sendKeys(String.valueOf(minTol));
		Thread.sleep(3000);
		maxTolerance.sendKeys(String.valueOf(maxTol));

		updateBtn.click();

		System.out.println("Currency: INR");
		System.out.println("Total Budget: " + totalBudget.getAttribute("value"));
		System.out.println("Approved Cost: " + approvedCost.getAttribute("value"));
		System.out.println("Min Tolerance: " + minTol);
		System.out.println("Max Tolerance: " + maxTol);

		// Validate the values
		boolean isValid = true;
		if (minTol < 0 || minTol > 10) {
			System.out.println("Min Tolerance is out of range: " + minTol);
			isValid = false;
		}
		if (maxTol < minTol || maxTol > 10) {
			System.out.println("Max Tolerance is out of range or less than Min Tolerance: " + maxTol);
			isValid = false;
		}
		if (isValid) {
			System.out.println("Values are valid.");
		} else {
			System.out.println("Values are not valid.");
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

	public void addNegativeDataToBudgetForm() throws InterruptedException {
		Select select = new Select(currency);
		select.selectByValue("INR");
		Thread.sleep(3000);
		updateBtn.click();
	}

	public void captureErrorMessages() {
		for (WebElement errorMessage : errorMsg) {
			System.out.println(errorMessage.getText());
		}
	}
}
