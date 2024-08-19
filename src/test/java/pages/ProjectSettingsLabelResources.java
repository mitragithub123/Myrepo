package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.github.javafaker.Faker;

public class ProjectSettingsLabelResources {
	public WebDriver driver;
	public Faker faker;

	public ProjectSettingsLabelResources(WebDriver driver) {
		this.driver = driver;
		this.faker = new Faker();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a[title='Label']")
	public WebElement leftMenuLabel;

	@FindBy(css = "button[class='flex items-center gap-2 rounded bg-primary py-2 px-4.5 font-medium text-white hover:bg-opacity-90 text-sm']")
	public WebElement addLabelBtn;

	@FindBy(xpath = "(//select[@name='project_id'])[2]")
	public WebElement projectDropdown;

	@FindBy(xpath = "(//input[@name='label_name'])[2]")
	public WebElement labelName;

	@FindBy(xpath = "(//button[@title=' Save'])[2]")
	public WebElement saveBtn;

	@FindBy(xpath = "(//button[@title='Cancel'])[2]")
	public WebElement cancelBtn;

	@FindBy(xpath = "(//button[@class='absolute right-1 top-1 sm:right-5 sm:top-5'])[3]")
	public WebElement closeBtn;

	@FindBy(xpath = "//div[@class='Toastify__toast-body']")
	public WebElement successToast;

	@FindBy(css = "body div div div div div div div div div form div div:nth-child(2)")
	public WebElement projectNameErrorMsg;

	@FindBy(css = "body div[id='__next'] div[class='dark:bg-boxdark-2 dark:text-bodydark'] div[class='flex h-screen overflow-hidden'] div[class='relative flex flex-1 flex-col overflow-y-auto overflow-x-hidden'] main div[class='mx-auto max-w-screen-2xl p-4 xl:pt-2 md:p-6 2xl:p-6'] div div[class='flex flex-col gap-y-4 rounded-sm py-0 px-1 dark:border-strokedark dark:bg-boxdark sm:flex-row sm:items-center sm:justify-between'] div[class='flex flex-col gap-4 2xsm:flex-row 2xsm:items-center'] div div:nth-child(1)")
	public WebElement labelNameErrorMsg;

	@FindBy(css = "label[for='defaultToggle1'] div[class='relative'] div[class='block h-6 w-11 rounded-full bg-primary dark:bg-[#5A616B]']")
	public WebElement disableToggle;

	@FindBy(css = "div[class='block h-6 w-11 rounded-full bg-meta-9 dark:bg-[#5A616B]']")
	public WebElement enableToggle;

	@FindBy(css = "div[id='__next'] div[class='mt-3 px-6 py-1 rounded-sm border border-stroke bg-white shadow-default dark:border-strokedark dark:bg-boxdark min-h-[75vh]'] div:nth-child(2) ul:nth-child(1) li:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(2) div:nth-child(1) label:nth-child(1)")
	public WebElement labelItemToHover;

	@FindBy(xpath = "(//div[@class='MdOutlineEdit'])[2]")
	public WebElement editIcon;

	@FindBy(css = "button[title='Update']")
	public WebElement updateLabelBtn;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(3) > input:nth-child(2)")
	public WebElement editLabelName;

	@FindBy(css = "ul.divide-y.divide-meta-9 li label.text-medium.font-semibold.leading-6.text-black")
	public List<WebElement> listItems;

	@FindBy(css = "div[class='flex items-center justify-between gap-1 p-2 bg-[#8992d7]'] a")
	public WebElement projectsMenu;

	@FindBy(css = ".font-semibold.text-black.text-xl.block.overflow-hidden")
	public List<WebElement> allProjectNames;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(4) > button:nth-child(1)")
	public WebElement closeBtnEdit;

	@FindBy(css = "button[title='Update']")
	public WebElement cancelBtnEdit;

	@FindBy(xpath = "//div[@id='__next']//div[contains(@class,'mt-3 px-6 py-1 rounded-sm border border-stroke bg-white shadow-default dark:border-strokedark dark:bg-boxdark min-h-[75vh]')]//div[2]//ul[1]//li[1]//div[1]//div[1]//div[2]//div[3]//*[name()='svg']")
	public WebElement deleteIcon;

	@FindBy(xpath = "//button[text()='Yes']")
	public WebElement deletePopUpYesBtn;

	@FindBy(css = "button[class='block w-full rounded border border-stroke bg-gray p-3 text-center font-medium text-black transition hover:border-meta-1 hover:bg-meta-1 hover:text-white dark:border-strokedark dark:bg-meta-4 dark:text-white dark:hover:border-meta-1 dark:hover:bg-meta-1']")
	public WebElement deletePopUpNoBtn;

	public void navigateToLabel() {
		leftMenuLabel.click();
	}

	public void cancelBtnValidation() throws InterruptedException {
		addLabelBtn.click();
		Thread.sleep(3000);
		cancelBtn.click();
		addLabelBtn.click();
		Thread.sleep(3000);
		closeBtn.click();
	}

	public void addLabel() throws InterruptedException {
		addLabelBtn.click();
		Thread.sleep(3000);
		Select select = new Select(projectDropdown);
		select.selectByIndex(2);
		labelName.sendKeys(faker.lorem().characters(8));
		Thread.sleep(3000);
		saveBtn.click();

	}

	public void clickAddLabelBtnNClickProjects() throws InterruptedException {
		addLabelBtn.click();
		Thread.sleep(3000);
		Select select = new Select(projectDropdown);
		select.selectByIndex(2);
		closeBtn.click();
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

	public void addLabelNegativeTest() throws InterruptedException {
		addLabelBtn.click();
		Thread.sleep(3000);
		saveBtn.click();

		String projectNameErrorText = projectNameErrorMsg.getText().trim();
		String labelNameErrorText = labelNameErrorMsg.getText().trim();

		System.out.println("Project Name Error Message: " + projectNameErrorText);
		System.out.println("Label Name Error Message: " + labelNameErrorText);

		if (projectNameErrorText.equalsIgnoreCase("Task Type is required")) {
			System.out.println("Validation message for project name is correct");

		} else if (labelNameErrorText.equalsIgnoreCase("Short Name is required")) {
			System.out.println("Validation message for label name is correct");

		} else {
			System.out.println("Test fail: Error messages do not match expected values.");
		}

	}

	public void verifyToggleBtn() throws InterruptedException {
		disableToggle.click();
		Thread.sleep(3000);
		enableToggle.click();

	}

	public void verifyProjectNamesOfAddLabelWrtProjectList() throws InterruptedException {
		List<String> listItemsText = new ArrayList<>();
		for (WebElement item : listItems) {
			String disabledAttr = item.getAttribute("disabled");
			if (disabledAttr == null || !disabledAttr.equals("true")) {
				listItemsText.add(item.getText());
			}
		}
		projectsMenu.click();
		Thread.sleep(10000);

		List<String> optionsText = new ArrayList<>();
		for (WebElement option : allProjectNames) {
			optionsText.add(option.getText());
		}

		boolean isSubset = optionsText.containsAll(listItemsText);
		System.out.println("Project names in the Add Label popup: " + listItemsText);
		System.out.println("All project names in the Projects menu: " + optionsText);

		if (!isSubset) {
			System.out.println("Some project names from the Add Label popup are not found in the Projects menu.");
		}
		Assert.assertTrue(isSubset,
				"All project names from the Add Label popup should be listed in the Projects menu.");
	}

	public void editLabel() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(labelItemToHover).perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(editIcon));

		if (editIcon.isDisplayed()) {
			editIcon.click();
			Thread.sleep(3000);
			editLabelName.clear();
			editLabelName.sendKeys(faker.lorem().characters(3, 5, true));
			updateLabelBtn.click();
		} else {
			System.out.println("Skipping label editing as the edit icon is not visible.");
		}

	}

	public void editLabelNegativeTest() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(labelItemToHover).perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(editIcon));

		if (editIcon.isDisplayed()) {
			editIcon.click();
			Thread.sleep(3000);
			editLabelName.clear();
			updateLabelBtn.click();
		} else {
			System.out.println("Skipping label editing as the edit icon is not visible.");
		}

	}

	public void cancelBtnValidationEditTaskType() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(labelItemToHover).perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(editIcon));

		if (editIcon.isDisplayed()) {
			editIcon.click();
			Thread.sleep(3000);
			closeBtnEdit.click();
			actions.moveToElement(labelItemToHover).perform();
			editIcon.click();
			Thread.sleep(3000);
			cancelBtnEdit.click();
		} else {
			System.out.println("Skipping label editing as the edit icon is not visible.");
		}

	}

	public void deleteTaskType() throws TimeoutException {
		Actions actions = new Actions(driver);
		actions.moveToElement(labelItemToHover).perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Increased timeout
		wait.until(ExpectedConditions.visibilityOf(deleteIcon));
		wait.until(ExpectedConditions.elementToBeClickable(deleteIcon));

		deleteIcon.click();

		wait.until(ExpectedConditions.visibilityOf(deletePopUpYesBtn));
		wait.until(ExpectedConditions.elementToBeClickable(deletePopUpYesBtn));
		deletePopUpYesBtn.click();

		actions.moveToElement(labelItemToHover).perform();
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.visibilityOf(deleteIcon));
		deleteIcon.click();

		wait.until(ExpectedConditions.visibilityOf(deletePopUpNoBtn));
		wait.until(ExpectedConditions.elementToBeClickable(deletePopUpNoBtn));
		deletePopUpNoBtn.click();
	}

}
