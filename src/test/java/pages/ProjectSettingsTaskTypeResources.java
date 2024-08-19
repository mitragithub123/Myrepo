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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.github.javafaker.Faker;

public class ProjectSettingsTaskTypeResources {
	public WebDriver driver;
	public Faker faker;

	public ProjectSettingsTaskTypeResources(WebDriver driver) {
		this.driver = driver;
		this.faker = new Faker();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "button[title=' Add Task Type']")
	public WebElement addTaskTypeBtn;

	@FindBy(xpath = "(//input[@id='tasktype'])[2]")
	public WebElement taskTypeName;

	@FindBy(xpath = "(//input[@id='shortName'])[2]")
	public WebElement taskTypeShortName;

	@FindBy(xpath = "(//button[@title=' Save'][normalize-space()='Save'])[2]")
	public WebElement saveBtn;

	@FindBy(xpath = "(//button[@title='Cancel'][normalize-space()='Cancel'])[2]")
	public WebElement cancelBtn;

	@FindBy(xpath = "(//button[@class='absolute right-1 top-1 sm:right-5 sm:top-5'])[2]")
	public WebElement closeBtn;

	@FindBy(css = "a[title='Task Type']")
	public WebElement leftMenuTaskType;

	@FindBy(xpath = "//*[@id=\"2\"]/div[1]/div[2]")
	public WebElement successToast;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > ul:nth-child(1) > li:nth-child(1) > div:nth-child(1) > div:nth-child(1)")
	public WebElement itemToHover;

	@FindBy(css = "body div[id='__next'] div[class='dark:bg-boxdark-2 dark:text-bodydark'] div[class='flex h-screen overflow-hidden'] div[class='relative flex flex-1 flex-col overflow-y-auto overflow-x-hidden'] main div[class='mx-auto max-w-screen-2xl p-4 xl:pt-2 md:p-6 2xl:p-6'] div div[class='flex flex-col gap-y-4 rounded-sm py-0 px-1 dark:border-strokedark dark:bg-boxdark sm:flex-row sm:items-center sm:justify-between'] div[class='flex flex-col gap-4 2xsm:flex-row 2xsm:items-center'] div div:nth-child(1)")
	public WebElement taskTypeNameErrorMsg;

	@FindBy(css = "body div[id='__next'] div[class='dark:bg-boxdark-2 dark:text-bodydark'] div[class='flex h-screen overflow-hidden'] div[class='relative flex flex-1 flex-col overflow-y-auto overflow-x-hidden'] main div[class='mx-auto max-w-screen-2xl p-4 xl:pt-2 md:p-6 2xl:p-6'] div div[class='flex flex-col gap-y-4 rounded-sm py-0 px-1 dark:border-strokedark dark:bg-boxdark sm:flex-row sm:items-center sm:justify-between'] div[class='flex flex-col gap-4 2xsm:flex-row 2xsm:items-center'] div div:nth-child(1)")
	public WebElement taskTypeShortNameErrorMsg;

	@FindBy(css = "label[for='defaultToggle3'] div[class='relative'] div[class='block h-6 w-11 rounded-full bg-primary dark:bg-[#5A616B]']")
	public WebElement disableToggle;

	@FindBy(css = "div[class='block h-6 w-11 rounded-full bg-meta-9 dark:bg-[#5A616B]']")
	public WebElement enableToggle;

	@FindBy(css = "ul.divide-y.divide-meta-9 li label.text-medium.font-semibold.leading-6.text-black")
	public List<WebElement> listItems;

	@FindBy(css = "a[title='Tasks']")
	public WebElement tasksMenu;

	@FindBy(css = "button[title='Add Task']")
	public WebElement addTaskBtn;

	@FindBy(name = "task_type")
	public WebElement taskTypeSelect;

	@FindBy(css = "select[name='task_type'] option")
	public List<WebElement> taskTypeOptions;

	@FindBy(css = "div[id='__next'] div[class='mt-3 px-6 py-1 rounded-sm border border-stroke bg-white shadow-default dark:border-strokedark dark:bg-boxdark min-h-[75vh]'] div:nth-child(2) ul:nth-child(1) li:nth-child(1)")
	public WebElement taskTypeItemToHover;

	@FindBy(css = "div[id='__next'] div[class='mt-3 px-6 py-1 rounded-sm border border-stroke bg-white shadow-default dark:border-strokedark dark:bg-boxdark min-h-[75vh]'] div:nth-child(2) ul:nth-child(1) li:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(2) div:nth-child(2)")
	public WebElement editIcon;

	@FindBy(xpath = "(//div[@class='MdDeleteOutline'])[2]")
	public WebElement deleteIcon;

	@FindBy(css = "button[class='block w-full rounded border border-add bg-success p-3 text-center font-medium text-white transition hover:bg-opacity-90']")
	public WebElement deletePopUpYesBtn;

	@FindBy(css = "button[class='block w-full rounded border border-stroke bg-gray p-3 text-center font-medium text-black transition hover:border-meta-1 hover:bg-meta-1 hover:text-white dark:border-strokedark dark:bg-meta-4 dark:text-white dark:hover:border-meta-1 dark:hover:bg-meta-1']")
	public WebElement deletePopUpNoBtn;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(2) > input:nth-child(2)")
	public WebElement taskTypeSelectEditPopup;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(3) > input:nth-child(2)")
	public WebElement shortNameEdtPopUp;

	@FindBy(css = "button[title='Update']")
	public WebElement updateTaskTypeBtn;

	@FindBy(xpath = "(//button[@title='Cancel'][normalize-space()='Cancel'])[1]")
	public WebElement cancelBtnEdit;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")
	public WebElement closeBtnEdit;

	public void navigateToTaskType() {
		leftMenuTaskType.click();
	}

	public void addTaskType() {
		addTaskTypeBtn.click();
		taskTypeName.sendKeys(faker.lorem().characters(5, 10, true));
		taskTypeShortName.sendKeys(faker.lorem().characters(3, 5, true));
		saveBtn.click();
	}

	public void cancelBtnValidation() throws InterruptedException {
		addTaskTypeBtn.click();
		Thread.sleep(3000);
		cancelBtn.click();
		addTaskTypeBtn.click();
		Thread.sleep(3000);
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

	public void addTaskTypeNegativeTest() throws InterruptedException {
		addTaskTypeBtn.click();
		Thread.sleep(3000);
		saveBtn.click();

		String taskTypeNameErrorText = taskTypeNameErrorMsg.getText().trim();
		String taskTypeShortNameErrorText = taskTypeShortNameErrorMsg.getText().trim();

		System.out.println("Task Type Name Error Message: " + taskTypeNameErrorText);
		System.out.println("Task Type Short Name Error Message: " + taskTypeShortNameErrorText);

		if (taskTypeNameErrorText.equalsIgnoreCase("Task Type is required")) {
			System.out.println("Validation message for task type name is correct");

		} else if (taskTypeShortNameErrorText.equalsIgnoreCase("Short Name is required")) {
			System.out.println("Validation message for task type short name is correct");

		} else {
			System.out.println("Test fail: Error messages do not match expected values.");
		}

	}

	public void verifyToggleBtn() throws InterruptedException {
		disableToggle.click();
		Thread.sleep(3000);
		enableToggle.click();

	}

	public void verifyListItemNamesOfTaskTypeWrtAddTask() throws InterruptedException {
		List<String> listItemsText = new ArrayList<>();
		for (WebElement item : listItems) {
			listItemsText.add(item.getText());
		}
		tasksMenu.click();
		Thread.sleep(10000);
		addTaskBtn.click();
		Thread.sleep(3000);
		taskTypeSelect.click();
		Thread.sleep(3000);

		List<String> optionsText = new ArrayList<>();
		for (WebElement option : taskTypeOptions) {
			String disabledAttr = option.getAttribute("disabled");
			if (disabledAttr == null || !disabledAttr.equals("true")) {
				optionsText.add(option.getText());
			}
		}

		boolean isSubset = optionsText.containsAll(listItemsText);
		System.out.println("List Items: " + listItemsText);
		System.out.println("Select Options: " + optionsText);

		if (!isSubset) {
			System.out.println("List items are not a subset of select options.");
		}
		Assert.assertTrue(isSubset, "All list items should be present in the select options.");
	}

	public void editTaskType() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(taskTypeItemToHover).perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(editIcon));

		editIcon.click();
		Thread.sleep(3000);
		taskTypeSelectEditPopup.clear();
		taskTypeSelectEditPopup.sendKeys(faker.lorem().characters(5, 10, true));
		Thread.sleep(3000);
		shortNameEdtPopUp.clear();
		shortNameEdtPopUp.sendKeys(faker.lorem().characters(3, 5, true));
		updateTaskTypeBtn.click();

	}

	public void editTaskTypeNegativeTest() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(taskTypeItemToHover).perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(editIcon));

		editIcon.click();
		Thread.sleep(3000);
		taskTypeSelectEditPopup.clear();
		Thread.sleep(3000);
		shortNameEdtPopUp.clear();
		Thread.sleep(3000);
		updateTaskTypeBtn.click();

	}

	public void cancelBtnValidationEditTaskType() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(taskTypeItemToHover).perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(editIcon));

		editIcon.click();
		Thread.sleep(3000);

		closeBtnEdit.click();

		actions.moveToElement(taskTypeItemToHover).perform();
		editIcon.click();
		Thread.sleep(3000);
		cancelBtnEdit.click();

	}

	public void deleteTaskType() throws TimeoutException {

		Actions actions = new Actions(driver);
		actions.moveToElement(taskTypeItemToHover).perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(deleteIcon));

		deleteIcon.click();
		deletePopUpYesBtn.click();

		actions.moveToElement(taskTypeItemToHover).perform();
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.visibilityOf(deleteIcon));
		deleteIcon.click();
		deletePopUpNoBtn.click();
	}

}
