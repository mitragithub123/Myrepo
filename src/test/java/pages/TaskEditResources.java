package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcomponents.RandomStringGenerator;

public class TaskEditResources {

	public WebDriver driver;

	public TaskEditResources(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[normalize-space()='Add Task']")
	public WebElement addTaskLink;

	@FindBy(xpath = "//div[@class='fixed left-0 top-0 z-99999 flex h-screen w-full justify-center overflow-y-scroll bg-black/80 px-4 py-5 block']//input[@placeholder='Enter title']")
	public WebElement enterTitle;

	@FindBy(xpath = "//div[contains(@class,'fixed left-0 top-0 z-99999 flex h-screen w-full justify-center overflow-y-scroll bg-black/80 px-4 py-5 block')]//select[@name='task_type']")
	public WebElement dropdown;

	@FindBy(xpath = "(//select[@name='task_type'])[1]//option[2]")
	public WebElement dropdownElement;

	@FindBy(xpath = "(//select[@name='assigned_to'])[1]")
	public WebElement assignTo;

	@FindBy(xpath = "(//select[@name='assigned_to'])[1]//option[2]")
	public WebElement assignToElement;
	
	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > select:nth-child(1)")
	public WebElement taskEditAssignTo;

	@FindBy(xpath = "(//select[@name='task_priority'])[1]")
	public WebElement taskPriority;

	@FindBy(xpath = "(//select[@name='task_priority'])[1]//option[3]")
	public WebElement selectPriority;
	
	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > select:nth-child(1)")
	public WebElement taskEditPriority;

	@FindBy(xpath = "(//input[@placeholder='Start Date'])[2]")
	public WebElement startDate;

	@FindBy(xpath = "//div[contains(@class, 'react-datepicker__day--today')]")
	public WebElement selectDate;
	
	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")
	public WebElement editTaskStartDate;

	@FindBy(xpath = "(//input[@placeholder='Due Date'])[1]")
	public WebElement dueDate;

	@FindBy(xpath = "//div[contains(@class, 'react-datepicker__day--today')]")
	public WebElement selectDueDate;
	
	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")
	public WebElement editTaskDueDate;

	@FindBy(xpath = "//div[@class='fixed left-0 top-0 z-99999 flex h-screen w-full justify-center overflow-y-scroll bg-black/80 px-4 py-5 block']//textarea[@id='taskDescription']")
	public WebElement enterDescription;

	@FindBy(xpath = "(//button[contains(.,'Save')])[2]")
	public WebElement saveButton;

	@FindBy(xpath = "//tbody/tr[2]/td[1]/div[1]/div[3]/button[1]//*[name()='svg']")
	public WebElement quickTaskKebabMenu;

	@FindBy(xpath = "(//button[@class='flex w-full items-center gap-2 rounded-sm px-4 py-1.5 text-left text-sm hover:bg-gray dark:hover:bg-meta-4'][normalize-space()='Edit'])[1]")
	public WebElement taskEdit;

	@FindBy(xpath = "//button[normalize-space()='Delete']")
	public WebElement taskDeleteIcon;

	@FindBy(xpath = "//button[normalize-space()='Yes']")
	public WebElement yesTaskDelete;

	@FindBy(xpath = "//button[normalize-space()='No']")
	public WebElement noTaskDelete;

	@FindBy(xpath = "//button[normalize-space()='Update']")
	public WebElement taskUpdateButton;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > nav:nth-child(1) > ol:nth-child(1) > li:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")
	public WebElement projectDropdown;
	
	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > p:nth-child(1)")
	public WebElement editProjectDropdown;

	@FindBy(css = "li[id^='headlessui-listbox-option-'] span.font-normal.block.truncate")
	public List<WebElement> ProjectNames;

	@FindBy(css = "#all")
	public WebElement multiSelectCheckBox;

	@FindBy(xpath = "//button[@class='text-gray-700 dark:text-gray-200 hover:text-gray-900 dark:hover:text-gray-300 focus:outline-none']//*[name()='svg']")
	public WebElement multiSelectDropDown;

	@FindBy(css = "li:nth-child(1) button:nth-child(1)")
	public WebElement multiSelectAssignTo;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(1) > div:nth-child(2) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > span:nth-child(1)")
	public WebElement multiSelectelement;

	@FindBy(xpath = "//button[normalize-space()='Status']")
	public WebElement multiSelectStatus;

	@FindBy(xpath = "//span[normalize-space()='Delete']")
	public WebElement multiSelectTaskDelete;

	@FindBy(xpath = "//button[normalize-space()='No']")
	public WebElement multiSelectTaskDeleteNo;

	public void multiSelectStatus() {
		multiSelectStatus.click();
	}

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(1) > div:nth-child(2) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(2) > ul:nth-child(2) > li > span:nth-child(1)")
	public List<WebElement> MultiSelectStatusElement;
	
	public void taskEditOperation() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		quickTaskKebabMenu.click();
		Thread.sleep(2000);
		taskEdit.click();
		Thread.sleep(2000);
		enterTitle.clear();
		Thread.sleep(2000);	
		RandomStringGenerator generator = new RandomStringGenerator();
		String randomTaskTitle = generator.generateRandomString(20);
		TaskPageResources obj = new  TaskPageResources(driver);
		obj.enterTitle(randomTaskTitle);
		Thread.sleep(2000);	
		dropdown.click();
		Thread.sleep(2000);	
		TaskEditResources juyt=new TaskEditResources(driver); 
		juyt.taskDropdownSelectByRobotClass();
		Thread.sleep(2000);	
		taskEditAssignTo.click();
		juyt.taskDropdownSelectByRobotClass();
		Thread.sleep(2000);	
		taskEditPriority.click();
		juyt.taskDropdownSelectByRobotClass();
		Thread.sleep(2000);	
		editTaskStartDate.click();
		Thread.sleep(2000);	
		selectDate.click();
		Thread.sleep(2000);	
		editTaskDueDate.click();
		Thread.sleep(2000);	
		selectDueDate.click();
		Thread.sleep(2000);			
		ProjectListingResources ytr=new ProjectListingResources(driver);
		String description = ytr.generateRandomDescription();	
		editProjectDropdown.sendKeys(description);
		Thread.sleep(1000);	
		taskUpdateButton.click();	
	}
	public void MultiSelectStatusFunctionality() throws InterruptedException {
		Thread.sleep(3000);
		multiSelectCheckBox.click();
		Thread.sleep(3000);
		multiSelectDropDown.click();
		Thread.sleep(3000);		
		multiSelectStatus.click();		
		for (int i = 0; i < MultiSelectStatusElement.size(); i++) {
			Thread.sleep(3000);
			WebElement filter3 = MultiSelectStatusElement.get(i);
			Thread.sleep(2000);
			filter3.click();
			Thread.sleep(2000);
			multiSelectCheckBox.click();
			Thread.sleep(3000);
			multiSelectDropDown.click();
			Thread.sleep(3000);
			multiSelectStatus.click();
		}
	}

	public void MultiSelectAssignToFunctionality() throws InterruptedException {
		Thread.sleep(3000);
		multiSelectCheckBox.click();
		Thread.sleep(3000);
		multiSelectDropDown.click();
		Thread.sleep(3000);
		multiSelectAssignTo.click();
		Thread.sleep(3000);
		multiSelectelement.click();
	}
	public void MultiSelectTaskDeleteFunctionality() throws InterruptedException {
		Thread.sleep(3000);
		multiSelectCheckBox.click();
		Thread.sleep(3000);
		multiSelectDropDown.click();
		Thread.sleep(3000);
		multiSelectTaskDelete.click();
		Thread.sleep(3000);
		multiSelectTaskDeleteNo.click();
	}
	public void projectDropdown() {
		projectDropdown.click();
		
	}
	
	public void taskDropdownSelectByRobotClass() throws InterruptedException, AWTException {
		 Robot robot = new Robot();
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_DOWN);
         robot.keyRelease(KeyEvent.VK_DOWN);
         Thread.sleep(2000);
         robot.keyPress(KeyEvent.VK_ENTER);
         robot.keyRelease(KeyEvent.VK_ENTER);
	}
	

	public void selectingProjects() throws InterruptedException {
		for (int i = 0; i < ProjectNames.size(); i++) {
			Thread.sleep(2000);
			WebElement filter3 = ProjectNames.get(i);
			Thread.sleep(3000);
			filter3.click();
			Thread.sleep(3000);
			projectDropdown.click();
		}
	}
	
	
	
	public void displayTaskRespectToProject() throws InterruptedException
	{
		projectDropdown.click();
		Thread.sleep(3000);
		TaskEditResources obj54= new TaskEditResources(driver);
		obj54.selectingProjects();
	}
	

	

	public void taskEdit() {
		taskEdit.click();
	}

	public void yesTaskDelete() {
		yesTaskDelete.click();
	}

	public void noTaskDelete() {
		noTaskDelete.click();
	}

	public void clickAddTaskLink() {
		addTaskLink.click();
	}

	public void taskDeletetion() {
		taskDeleteIcon.click();

	}

	public void enterTitle(String taskName) throws InterruptedException {
		enterTitle.sendKeys(taskName);
	}

	public void clickDropdown() {
		dropdown.click();
	}

	public void selectOptionByText() throws InterruptedException {
		Thread.sleep(3000);
		dropdownElement.click();
	}

	public void clickAssignToDropdown() {
		assignTo.click();
	}

	public void selectAssignto() {
		assignToElement.click();
	}

	public void clickTaskPriority() {
		taskPriority.click();
	}

	public void quickTaskKababMenuIcon() {
		quickTaskKebabMenu.click();
	}

	public void selectTaskPriority() {
		selectPriority.click();
	}

	public void clickStartDate() {
		startDate.click();
	}

	public void selectStartDate() {
		selectDate.click();
	}

	public void clickDueDate() {
		dueDate.click();
	}

	public void selectDueDate() {
		selectDueDate.click();
	}

	public void enterDescription(String description) {
		enterDescription.sendKeys(description);
	}

	public void clickSave() {
		saveButton.click();
	}

}
