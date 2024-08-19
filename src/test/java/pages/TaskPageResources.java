package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPageResources {
	public WebDriver driver;

	public TaskPageResources(WebDriver driver) {
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

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(3) > div:nth-child(1)")
	public WebElement sortTaskId;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(4) > div:nth-child(1)")
	public WebElement sortTaskName;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(6) > div:nth-child(1)")
	public WebElement sortAssignTo;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(7) > div:nth-child(1)")
	public WebElement sortStatus;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(8) > div:nth-child(1)")
	public WebElement sortPriority;

	@FindBy(xpath = "(//button[contains(@title,'Cancel')][normalize-space()='Cancel'])[1]")
	public WebElement cancelButton;

	@FindBy(css = "body div main div table tbody tr td h5")
	public List<WebElement> taskIds;

	@FindBy(css = "tbody tr td:nth-child(4) p:nth-child(1)")
	public List<WebElement> taskNames;

	@FindBy(xpath = "//img[contains(@alt,'Orangescrum')]")
	public WebElement osLogo;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > span:nth-child(2)")
	public WebElement taskCount;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > span:nth-child(2)")
	public WebElement storage;
	@FindBy(css = "tbody tr:nth-child(2) td:nth-child(5) p:nth-child(1)")
	public WebElement taskCreatedDueDate;

	@FindBy(xpath = "//div[@class='text-black cursor-pointer']//*[name()='svg']")
	public WebElement filterIcon;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > section:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > button:nth-child(1)")
	public WebElement taskType;

	@FindBy(css = "li[id^='headlessui-listbox-option-'] span[class='font-normal block truncate']")
	public List<WebElement> taskTypeFilters;
	
	@FindBy(css = "div[class='bg-[#8992d7] relative w-full cursor-default rounded-md py-1.5 px-2 text-left text-white sm:text-sm sm:leading-6 font-semibold']")
	public WebElement resetIcon;

	@FindBy(css ="body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > section:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > button:nth-child(1)")
	public WebElement assignedTo;

	@FindBy(xpath = "//span[@class='font-normal block truncate']")
	public WebElement assignedToFilter;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > section:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > button:nth-child(1)")
	public WebElement priority;

	@FindBy(xpath = "//li[starts-with(@id, 'headlessui-listbox-option-')]//span[@class='font-normal block truncate']")
	public List<WebElement> priorityFilters;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > section:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(4) > button:nth-child(1)")
	public WebElement DueDate;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > section:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(4) > ul:nth-child(2) > li:nth-child(n)")
	public List<WebElement> dueDateFilters;

	@FindBy(xpath = "(//*[name()='svg'][@class='h-3 w-3 text-gray-400 transition-transform transform '])[1]")
	public WebElement groupBy;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > ul:nth-child(2) > li:nth-child(n)")
	public List<WebElement> groupByFilters;
	
	@FindBy(xpath = "//tbody/tr[2]/td[1]/div[1]/div[2]/button[1]//*[name()='svg']//*[name()='path' and contains(@d,'M2.25 11.2')]")
	public WebElement quickTaskKebabMenu;
	
	@FindBy(xpath = "(//button[@class='flex w-full items-center gap-2 rounded-sm px-4 py-1.5 text-left text-sm hover:bg-gray dark:hover:bg-meta-4'][normalize-space()='Edit'])[1]")
	public WebElement taskEdit;
	
	@FindBy(xpath = "//button[normalize-space()='Update']")
	public WebElement taskUpdateButton;
	
	

	public void selectingPriorityFilters() throws InterruptedException {
		for (int i = 0; i < priorityFilters.size(); i++) {
			Thread.sleep(2000);
			WebElement filter2 = priorityFilters.get(i);
			Thread.sleep(3000);
			filter2.click();
			Thread.sleep(3000);
			priority.click();
		}
	}

	public void selectingGroupByFilters() throws InterruptedException {
		for (int i = 0; i < groupByFilters.size(); i++) {
			Thread.sleep(2000);
			WebElement filter3 = groupByFilters.get(i);
			Thread.sleep(3000);
			filter3.click();
			Thread.sleep(3000);
			groupBy.click();
		}
	}

	public void selectingDueDateFilters() throws InterruptedException {
		for (int i = 0; i < dueDateFilters.size(); i++) {
			Thread.sleep(2000);
			WebElement filter3 = dueDateFilters.get(i);
			filter3.click();
			Thread.sleep(3000);
			DueDate.click();
		}
	}

	public void selectingTaskTypeFilters() throws InterruptedException {
		for (int i = 0; i < taskTypeFilters.size(); i++) {
			WebElement filter = taskTypeFilters.get(i);
			Thread.sleep(2000);
			filter.click();
			Thread.sleep(2000);
			taskType.click();
		}
	}

	
	public void quickTaskKababMenu() {
		quickTaskKebabMenu.click();
	}
	public void taskEdit() {
		taskEdit.click();
	}
	public void filterIconClick() {
		filterIcon.click();
	}
	
	public void filterResetIcon() {
		resetIcon.click();
	}
	
	public void taskUpdateButton() {
		taskUpdateButton.click();
	}

	public void taskTypeClick() {
		taskType.click();
	}

	public void assignedToClick() throws InterruptedException {
		assignedTo.click();
	}

	public void selectingAssignedToFilters() {
		assignedToFilter.click();
	}

	public void taskPriorityClick() {
		priority.click();
	}

	public void taskDueDateClick() {
		DueDate.click();
	}

	public void groupByClick() {
		groupBy.click();
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

	public void clickSortIconTaskID() {
		sortTaskId.click();
	}

	public void verifyTaskIdSort() {

		List<String> beforeSort = taskIds.stream().map(WebElement::getText).collect(Collectors.toList());
		List<String> afterSort = new ArrayList<>(beforeSort);
		Collections.sort(afterSort);
		if (beforeSort.equals(afterSort)) {
			System.out.println("Sorting by task id works");
		} else {
			System.out.println("Sorting by task id is not working");
		}
	}

	public void clickSortIconTaskName() {
		sortTaskName.click();
	}

	public void verifyTaskNameSort() {

		List<String> beforeSort = taskNames.stream().map(WebElement::getText).collect(Collectors.toList());
		List<String> afterSort = new ArrayList<>(beforeSort);
		Collections.sort(afterSort);

		if (beforeSort.equals(afterSort)) {
			System.out.println("Sorting by task name works");
		} else {
			System.out.println("Sorting by task name is not working");
		}
	}

	public void clickSortIconAssignTo() throws InterruptedException {
		sortAssignTo.click();
		Thread.sleep(3000);
	}

	public void verifyAssignToSort() throws InterruptedException {

		List<String> beforeSort = taskNames.stream().map(WebElement::getText).collect(Collectors.toList());
		List<String> afterSort = new ArrayList<>(beforeSort);
		Collections.sort(afterSort);

		if (beforeSort.equals(afterSort)) {
			System.out.println("Sorting by assign to works");
		} else {
			System.out.println("Sorting by assign to is not working");
		}
	}

	public void clickSortIconStatus() throws InterruptedException {
		sortStatus.click();
		Thread.sleep(3000);
	}

	public void verifyStatusSort() throws InterruptedException {
		List<String> beforeSort = taskNames.stream().map(WebElement::getText).collect(Collectors.toList());
		List<String> afterSort = new ArrayList<>(beforeSort);
		Collections.sort(afterSort);

		if (beforeSort.equals(afterSort)) {
			System.out.println("Sorting by status works");
		} else {
			System.out.println("Sorting by status is not working");
		}
	}

	public void clickSortIconPriority() throws InterruptedException {
		sortPriority.click();
		Thread.sleep(3000);
	}

	public void verifyPrioritySort() throws InterruptedException {
		List<String> beforeSort = taskNames.stream().map(WebElement::getText).collect(Collectors.toList());
		List<String> afterSort = new ArrayList<>(beforeSort);
		Collections.sort(afterSort);

		if (beforeSort.equals(afterSort)) {
			System.out.println("Sorting by priority works");
		} else {
			System.out.println("Sorting by task priority is not working");
		}
	}

	public void goToProjectList() {
		osLogo.click();
	}

	public void verifyTaskCount() {
		System.out.println("Total task count on the project: " + taskCount.getText());
	}

	public void verifyStorage() {
		System.out.println("Total storage on the project: " + storage.getText());
	}
	public String getbeforeDueDateText() {
		return dueDate.getText();
	}

	public String getDueDateText() {
		return taskCreatedDueDate.getText();
	}

	public static boolean verifyDueDate(TaskPageResources tp) {
		String beforeDueDate = tp.getbeforeDueDateText();
		String afterDueDate = tp.getDueDateText();

		if (beforeDueDate.equals(afterDueDate)) {
			System.out.println("Due date while task creation: " + beforeDueDate);
			System.out.println("Due date after task creation: " + afterDueDate);
			return true;
		} else {
			System.out.println("Due date while task creation: " + beforeDueDate);
			System.out.println("Due date after task creation: " + afterDueDate);
			return false;
		}
	}

}
