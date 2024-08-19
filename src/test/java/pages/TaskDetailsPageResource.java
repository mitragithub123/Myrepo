package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskDetailsPageResource {

	public WebDriver driver;

	public TaskDetailsPageResource(WebDriver driver) {
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

	@FindBy(xpath = "(//select[@name='task_priority'])[1]")
	public WebElement taskPriority;

	@FindBy(xpath = "(//select[@name='task_priority'])[1]//option[3]")
	public WebElement selectPriority;

	@FindBy(xpath = "(//input[@placeholder='Start Date'])[2]")
	public WebElement startDate;

	@FindBy(xpath = "//div[contains(@class, 'react-datepicker__day--today')]")
	public WebElement selectDate;

	@FindBy(xpath = "(//input[@placeholder='Due Date'])[1]")
	public WebElement dueDate;

	@FindBy(xpath = "//div[contains(@class, 'react-datepicker__day--today')]")
	public WebElement selectDueDate;

	@FindBy(xpath = "//div[@class='fixed left-0 top-0 z-99999 flex h-screen w-full justify-center overflow-y-scroll bg-black/80 px-4 py-5 block']//textarea[@id='taskDescription']")
	public WebElement enterDescription;

	@FindBy(xpath = "(//button[contains(.,'Save')])[2]")
	public WebElement saveButton;

	@FindBy(css = "tbody tr:nth-child(2) td:nth-child(4) p:nth-child(1)")
	public WebElement newTask;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(6) > div:nth-child(1)")
	public WebElement sortAssignTo;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(7) > div:nth-child(1)")
	public WebElement sortStatus;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(8) > div:nth-child(1)")
	public WebElement sortPriority;

	@FindBy(xpath = "(//button[contains(@title,'Cancel')][normalize-space()='Cancel'])[1]")
	public WebElement cancelButton;

	@FindBy(css = "tbody tr:nth-child(2) td:nth-child(5) p:nth-child(1)")
	public WebElement taskCreatedDueDate;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > section:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > button:nth-child(1)")
	public WebElement taskType;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > section:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > button:nth-child(1)")
	public WebElement assignedTo;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > section:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > button:nth-child(1)")
	public WebElement priority;
	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > section:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(4) > button:nth-child(1)")
	public WebElement DueDate;

	@FindBy(css = "tbody tr[class='hover:bg-slate-100'] td:nth-child(4) div:nth-child(1) p:nth-child(1)")
	public WebElement clicktaskname;

	@FindBy(xpath = "(//div[@class='flex text-[17px] font-semibold items-center w-full text-black mb-2'])[1]//span[3]")
	public WebElement tasktitledetailp;

	@FindBy(css = "tbody tr:nth-child(2) td:nth-child(5) p:nth-child(1)")
	public WebElement dueDateinTaskList;

	@FindBy(xpath = "(//div[@class='flex gap-1 '])[1]//div[4]//div[2]//div//input")
	public WebElement dueDateinTaskDetail;

	@FindBy(xpath = "//a[@title='Tasks']")
	public WebElement leftMenuTaskClick;

	@FindBy(css = "tbody tr:nth-child(2) td:nth-child(7) p:nth-child(1)")
	public WebElement taskStatusinTaskList;

	@FindBy(xpath = "(//span[@class='block truncate font-medium text-black'])[1]")
	public WebElement taskStatusinTaskDetails;
	
	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(8) > p:nth-child(1)")
	public WebElement taskpriorityintasklist;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > button:nth-child(1)")
	public WebElement taskpriorityintaskdetails;
	
	
	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(6) > p:nth-child(1)")
	public WebElement taskassigntointasklist;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > button:nth-child(1)")
	public WebElement taskassigntointaskdetails;
	
	
	public String getTaskPriorityOnTaskListPage() {
		return taskpriorityintasklist.getText();
	}

	public String getTaskPriorityOnTaskDetailsPage() {
		return taskpriorityintaskdetails.getText();
	}

	
	public String getTaskAssignToOnTaskListPage() {
		return taskassigntointasklist.getText();
	}

	public String getTaskAssignToOnTaskDetailsPage() {
		return taskassigntointaskdetails.getText();
	}
	public void taskTypeClick() {
		taskType.click();
	}

	public void assignedToClick() throws InterruptedException {
		assignedTo.click();
	}

	public String getCreatedTaskTitle() {
		return clicktaskname.getText();
	}

	public String getTaskTitleOnTaskDetailsPage() {
		return tasktitledetailp.getText();
	}

	public String getDueDateFromTaskList() {
		return dueDateinTaskList.getText();
	}

	public String getDueDateFromTaskDetail() {
		return dueDateinTaskDetail.getAttribute("value");
	}

	public String getTaskStatusFromTaskList() {
		return taskStatusinTaskList.getText();
	}

	public String getTaskStatusFromTaskDetail() {
		return taskStatusinTaskDetails.getText();
	}

	public void taskPriorityClick() {
		priority.click();
	}

	public void taskDueDateClick() {
		DueDate.click();
	}

	public void clickAddTaskLink() {
		addTaskLink.click();
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

	public String getNewTaskTitle() {
		return newTask.getText();
	}

	public void compareTaskTitle(String createdTaskTitle, String expectedTaskTitle) {
		if (createdTaskTitle.equals(expectedTaskTitle)) {
			System.out.println("Created task title matches the expected task title: " + expectedTaskTitle);
		} else {
			System.out.println("Created task title does not match with the expected task title: " + expectedTaskTitle);
		}
	}

	public void cancellingTheTask() throws InterruptedException {
		addTaskLink.click();
		Thread.sleep(2000);
		cancelButton.click();
	}

	public void compareTaskTitles() throws InterruptedException {
		Thread.sleep(3000);
		String createdTaskTitle = getCreatedTaskTitle();
		clicktaskname.click();
		Thread.sleep(3000);
		String taskDetailsPageTitle = getTaskTitleOnTaskDetailsPage();
		if (createdTaskTitle.equals(taskDetailsPageTitle)) {
			System.out.println("Test Case Passed: Task titles match!");
			System.out.println("Created Task Title: " + createdTaskTitle);
			System.out.println("Displayed Task Title on Details Page: " + taskDetailsPageTitle);
		} else {
			System.out.println("Test Case Failed: Task titles do not match!");
			System.out.println("Created Task Title: " + createdTaskTitle);
			System.out.println("Displayed Task Title on Details Page: " + taskDetailsPageTitle);
		}
	}

	public void compareDueDate() throws InterruptedException {
		leftMenuTaskClick.click();
		Thread.sleep(3000);
		String createdduedate = getDueDateFromTaskList();
		clicktaskname.click();
		Thread.sleep(3000);
		String taskDetailsPageduedate = getDueDateFromTaskDetail();
		Thread.sleep(3000);
		if (createdduedate.equals(taskDetailsPageduedate)) {
			System.out.println("Test Case Passed: The due date created matches the displayed due date");
			System.out.println("Created Due Date: " + createdduedate);
			System.out.println("Displayed Due Date: " + taskDetailsPageduedate);
		} else {
			System.out.println("Test Case Failed: The due date created do not matches with the displayed due date");
			System.out.println("Created Due Date: " + createdduedate);
			System.out.println("Displayed Due Date: " + taskDetailsPageduedate);
		}
	}

	public void compareTaskStatus() throws InterruptedException {
		leftMenuTaskClick.click();
		Thread.sleep(3000);
		String taskstatus = getTaskStatusFromTaskList();
		clicktaskname.click();
		Thread.sleep(3000);
		String taskstatusdetailspage = getTaskStatusFromTaskDetail();
		Thread.sleep(2000);
		if (taskstatus.equals(taskstatusdetailspage)) {
			System.out.println("Test Case Passed: Task status match!");
			System.out.println("Created Task Status: " + taskstatus);
			System.out.println("Displayed Task status: " + taskstatusdetailspage);
		} else {
			System.out.println("Test Case Failed: Task status do not match!");
			System.out.println("Created Task Status: " + taskstatus);
			System.out.println("Displayed Task status: " + taskstatusdetailspage);
		}
	}
	
	public void compareTaskPriority() throws InterruptedException {
		leftMenuTaskClick.click();
		Thread.sleep(3000);
		String taskpriorityontasklistpage = getTaskPriorityOnTaskListPage();
		clicktaskname.click();
		Thread.sleep(3000);
		String taskpriorityontaskdetailspage = getTaskPriorityOnTaskDetailsPage();
		Thread.sleep(2000);
		if (taskpriorityontasklistpage.equals(taskpriorityontaskdetailspage)) {
			System.out.println("Test Case Passed: Task priority match!");
			System.out.println("Created Task priority: " + taskpriorityontasklistpage);
			System.out.println("Displayed Task priority: " + taskpriorityontaskdetailspage);
		} else {
			System.out.println("Test Case Failed: Task priority do not match!");
			System.out.println("Created Task priority: " + taskpriorityontasklistpage);
			System.out.println("Displayed Task priority: " + taskpriorityontaskdetailspage);
		}
	}
	
	public void compareTaskAssignTo() throws InterruptedException {
		leftMenuTaskClick.click();
		Thread.sleep(3000);
		String taskassigntoinntasklistpage = getTaskAssignToOnTaskListPage();
		clicktaskname.click();
		Thread.sleep(3000);
		String taskassigntoinntaskdetailspage = getTaskAssignToOnTaskDetailsPage();
		Thread.sleep(2000);
		if (taskassigntoinntasklistpage.equals(taskassigntoinntaskdetailspage)) {
			System.out.println("Test Case Passed: Task AssignTo match!");
			System.out.println("Task AssignTo: " + taskassigntoinntasklistpage);
			System.out.println("Task AssignTo in Task Details Page: " + taskassigntoinntaskdetailspage);
		} else {
			System.out.println("Test Case Failed: Task AssignTo is not matching !");
			System.out.println("Task AssignTo: " + taskassigntoinntasklistpage);
			System.out.println("Task AssignTo in Task Details Page: " + taskassigntoinntaskdetailspage);
		}
	}

}
