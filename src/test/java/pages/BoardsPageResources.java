package pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcomponents.ActionUtility;
import testcomponents.RandomStringGenerator;
import testcomponents.ReadConfig;

public class BoardsPageResources {
	public WebDriver driver;
	ReadConfig config = new ReadConfig();

	public BoardsPageResources(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.au = new ActionUtility(driver);

	}

	@FindBy(css = "h4[class='text-xl font-semibold text-black dark:text-white flex justify-between'] button")
	public WebElement addTaskPlusIcon;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > input:nth-child(1)")
	public WebElement addTaskBox;

	@FindBy(css = "//h5[contains(@class, 'text-lg')]")
	public WebElement createdTask;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)")
	public WebElement sourceTask;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2)")
	public WebElement doingTab;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2)")
	public WebElement doneTab;

	@FindBy(css = "h4[class='text-xl font-semibold text-black dark:text-white flex justify-between']")
	public WebElement todoElement;

	@FindBy(css = "div[class='mt-2 grid grid-cols-1 gap-7.5 sm:grid-cols-2 xl:grid-cols-3'] div:nth-child(1) h4:nth-child(1)")
	public WebElement doingElement;

	@FindBy(css = "div[class='mt-2 grid grid-cols-1 gap-7.5 sm:grid-cols-2 xl:grid-cols-3'] div:nth-child(1) h4:nth-child(1)")
	public WebElement doneElement;

	public void addTask() {
		addTaskPlusIcon.click();
	}

	RandomStringGenerator rsg = new RandomStringGenerator();
	String taskName = rsg.generateRandomString(10);

	public void taskNameInput() throws InterruptedException {
		addTaskBox.sendKeys(taskName);
		Thread.sleep(3000);
	}

	public void taskMatch() {
		if (createdTask.getText().equals(taskName)) {
			System.out.println("Task added succesfully");
		} else {
			System.out.println("Task not added");
		}
	}

	ActionUtility au;

	public void dragTaskToDoing() throws InterruptedException {
		au.clickAndHoldNdragAndDrop(sourceTask, doingTab);
		Thread.sleep(3000);
	}

	public void dragTaskToDone() throws InterruptedException {
		au.clickAndHoldNdragAndDrop(sourceTask, doneTab);
		Thread.sleep(3000);
	}

	public Map<String, Integer> todoTaskCounts = new HashMap<>();
	public Map<String, Integer> doingTaskCounts = new HashMap<>();
	public Map<String, Integer> doneTaskCounts = new HashMap<>();

	public void todoCount() {
		String todoText = todoElement.getText();
		if (!todoText.isEmpty()) {
			String taskName = todoText.split("\\s+")[0];
			todoTaskCounts.put(taskName, todoTaskCounts.getOrDefault(taskName, 0) + 1);
			System.out.println("To Do task count for " + taskName + ": " + todoTaskCounts.get(taskName));
		} else {
			System.out.println("No To Do tasks found.");
		}
	}

	public void doingCount() {
		String doingText = doingElement.getText();
		if (!doingText.isEmpty()) {
			String taskName = doingText.split("\\s+")[0];
			doingTaskCounts.put(taskName, doingTaskCounts.getOrDefault(taskName, 0) + 1);
			System.out.println("Doing task count for " + taskName + ": " + doingTaskCounts.get(taskName));
		} else {
			System.out.println("No Doing tasks found.");
		}
	}

	public void doneCount() {
		String doneText = doneElement.getText();
		if (!doneText.isEmpty()) {
			String taskName = doneText.split("\\s+")[0];
			doneTaskCounts.put(taskName, doneTaskCounts.getOrDefault(taskName, 0) + 1);
			System.out.println("Done task count for " + taskName + ": " + doneTaskCounts.get(taskName));
		} else {
			System.out.println("No Done tasks found.");
		}
	}

}
