package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProjectSettingsImportTasks {

	public WebDriver driver;

	public ProjectSettingsImportTasks(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "a[title='Import Task']")
	public WebElement leftMenuImportTasks;

	@FindBy(css = "input[type='file']")
	public WebElement chooseFile;

	@FindBy(css = "button[title='Continue']")
	public WebElement continueBtn;

	@FindBy(css = "button[title='Submit']")
	public WebElement submitBtn;

	@FindBy(css = "table[class='w-full table-auto relative overflow-auto h-[35vh] custom-scrollbar']")
	WebElement previewDataTable;

	@FindBy(css = "a[title='Tasks']")
	WebElement taskLink;

	@FindBy(css = "div[class='p-2']")
	WebElement tableTaskList;

	@FindBy(xpath = "//a[normalize-space()='Download the sample']")
	WebElement downloadSampleFileLink;

	@FindBy(css = ".Toastify__toast-body div:nth-child(2)")
	WebElement errorToast;

	@FindBy(css = ".Toastify__toast-body div:nth-child(2)")
	WebElement successToast;

	public void navigateImportTasks() throws InterruptedException {
		leftMenuImportTasks.click();
		Thread.sleep(3000);
	}

	public void uploadFile(String fileName, List<String> expectedTasks) throws InterruptedException {
		chooseFile.sendKeys(fileName);
		Thread.sleep(3000);
		continueBtn.click();
		Thread.sleep(3000);
		if (!verifyPreviewData(expectedTasks)) {
			throw new AssertionError("Preview data does not match expected tasks!");
		}
		submitBtn.click();
	}

	public boolean verifyPreviewData(List<String> expectedTasks) {
		List<WebElement> rows = previewDataTable.findElements(By.tagName("tr"));
		int taskCountPreview = rows.size() - 1; // Subtracting 1 for the header row
		boolean allTasksMatch = true;
		if (taskCountPreview != expectedTasks.size()) {
			System.out.println("Task count in preview (" + taskCountPreview + ") does not match expected task count ("
					+ expectedTasks.size() + ")");
			allTasksMatch = false;
		}
		for (int i = 1; i < rows.size(); i++) { // Skipping the header row
			List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
			String taskName = cells.get(0).getText();
			if (!expectedTasks.contains(taskName)) {
				allTasksMatch = false;
				System.out.println("Expected task not found: " + taskName);
			} else {
				System.out.println("Found expected task: " + taskName);
			}
		}
		return allTasksMatch;
	}

	public int getTaskCountPreview() {
		List<WebElement> rows = previewDataTable.findElements(By.tagName("tr"));
		return rows.size() - 1; // Subtracting 1 for the header row
	}

	public int getTaskCountTasksPage() {
		List<WebElement> rows = tableTaskList.findElements(By.tagName("tr"));
		return rows.size() - 1; // Subtracting 1 for the header row
	}

	public void verifyNavigationToTasksPage() throws InterruptedException {
		taskLink.click();
		Thread.sleep(3000);
		String expectedUrl = "https://osbaseleaf.andolasoft.co.in/tasks";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Navigation to tasks page failed!");
	}

	public String findDownloadedFile(String downloadPath, String fileNamePattern) throws InterruptedException {
		downloadSampleFileLink.click();
		Thread.sleep(5000);
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Download path: '" + downloadPath + "'");
		downloadPath = downloadPath.replaceAll("[^\\x20-\\x7E]", "").trim();// Remove unwanted chars from download path
		File dir = new File(downloadPath);
		if (!dir.exists()) {
			System.out.println("Directory does not exist: " + downloadPath);
			return null;
		}
		File[] files = dir.listFiles();
		if (files == null) {
			System.out.println("Directory is empty or inaccessible: " + downloadPath);
			return null;
		}
		for (File file : files) {
			if (file.getName().startsWith(fileNamePattern)) {
				System.out.println("Downloaded file: " + file.getName());
				return file.getName();
			}
		}
		System.out.println("No files found matching the pattern: " + fileNamePattern);
		return null;
	}

	public void uploadFile(String fileName) throws InterruptedException {
		chooseFile.sendKeys(fileName);
		Thread.sleep(3000);
		continueBtn.click();
		Thread.sleep(3000);
		submitBtn.click();
	}

	public String getErrorToastMessageText() throws InterruptedException {
		Thread.sleep(3000);
		return errorToast.getText();
	}

	public void compareToastMessage(String expectedToastMessage) throws InterruptedException {
		String actualToastMessage = getErrorToastMessageText();
		if (actualToastMessage.equals(expectedToastMessage)) {
			System.out.println("Toast message is as expected: " + expectedToastMessage);
		} else {
			System.out.println("Toast message is not as expected. Expected: " + expectedToastMessage + ", Actual: "
					+ actualToastMessage);
			throw new AssertionError("Toast message is not as expected.");
		}
		System.out.println("Correct toast message: " + actualToastMessage);
	}

	public String getSuccessToastMessageText() throws InterruptedException {
		Thread.sleep(3000);
		return successToast.getText();
	}

	public void comparedToastMessage(String expectedToastMessage) throws InterruptedException {
		String actualToastMessage = getSuccessToastMessageText();
		if (actualToastMessage.equals(expectedToastMessage)) {
			System.out.println("Toast message is as expected: " + expectedToastMessage);
		} else {
			System.out.println("Toast message is not as expected. Expected: " + expectedToastMessage + ", Actual: "
					+ actualToastMessage);
			throw new AssertionError("Toast message is not as expected.");
		}
		System.out.println("Correct toast message: " + actualToastMessage);
	}

}
