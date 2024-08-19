package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickTaskPageResources {
	public WebDriver driver;

	public QuickTaskPageResources(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='Tasks']")
	public WebElement leftMenu;

	@FindBy(xpath = "//p[@class='text-primary dark:text-white font-semibold cursor-pointer absolute top-2']")
	public WebElement quickTaskLink;

	@FindBy(xpath = "//input[@placeholder='Enter Task Title...']")
	public WebElement taskTitle;

	@FindBy(xpath = "//button[@type='button'][normalize-space()='Save']")
	public WebElement saveButton;

	@FindBy(css = "tbody tr:nth-child(2) td:nth-child(3) p:nth-child(1)")
	public WebElement topTask;

	@FindBy(xpath = "//div[contains(text(),'Task created successfully!')]")
	public WebElement successToast;
	
	@FindBy(xpath = "//button[@class='flex justify-center rounded border mr-2 border-stroke py-2 px-6 font-medium text-black hover:shadow-1 dark:border-strokedark dark:text-white']")
	public WebElement cancelbutton;

	public void leftMenuTask() throws InterruptedException {
		leftMenu.click();
		Thread.sleep(3000);
	}

	public void quickTask() throws InterruptedException {
		quickTaskLink.click();
		Thread.sleep(3000);
	}
	public void enterTaskName(String taskName) throws InterruptedException 
	{
		taskTitle.sendKeys(taskName);
		Thread.sleep(3000);
		saveButton.click();
	}
	
	public String getTaskTitle() {
		return topTask.getText();
	}
	public void compareTaskTitle(String createdTaskTitle, String expectedTaskTitle)
	{
		if (createdTaskTitle.equals(expectedTaskTitle)) 
		{
			System.out.println("Created task title matches the expected task title: " + expectedTaskTitle);
		} else {
			System.out.println("Created task title does not match with the expected task title: " + expectedTaskTitle);
		}
	}

	public String getToastMessageText() throws InterruptedException
	{
		Thread.sleep(3000);
		return successToast.getText();
	}

	public void compareToastMessage(String expectedToastMessage) throws InterruptedException {
		String actualToastMessage = getToastMessageText();
		if (actualToastMessage.equals(expectedToastMessage)) {
			System.out.println("Toast message is as expected: " + expectedToastMessage);
		} else {
			System.out.println("Toast message is not as expected. Expected: " + expectedToastMessage + ", Actual: " + actualToastMessage);
			throw new AssertionError("Toast message is not as expected.");
		}
		System.out.println("Correct toast message: " + actualToastMessage);
	}
	public void cancelTaskName(String taskName) throws InterruptedException 
	{
		taskTitle.sendKeys(taskName);
		Thread.sleep(3000);
		cancelbutton.click();
		System.out.println("Cancel button working properly");
	}
}
