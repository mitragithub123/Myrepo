package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testcomponents.QuickTask;
import testcomponents.RandomStringGenerator;

public class ProjectTaskSearchResource {
	public WebDriver driver;

	public ProjectTaskSearchResource(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[placeholder='Search by Project/Task name']")
	public WebElement searchInput;

	@FindBy(css = "img[alt='Orangescrum'][draggable='false']")
	public WebElement noSearchImage;

	@FindBy(css = "div[class=' overflow-auto h-[35vh] custom-scrollbar p-3']")
	public WebElement globalSearchPopup;

	@FindBy(css = "tbody tr:nth-child(2) td:nth-child(4) p:nth-child(1)")
	public WebElement getTaskTitle;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > header:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > div:nth-child(1) > p:nth-child(1)")
	public WebElement clickTaskTitleInSearchBox;

	@FindBy(css = "div[class='flex text-[17px] font-semibold items-center w-full text-black mb-2']")
	public WebElement taskDetailsHeader;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > nav:nth-child(1) > ol:nth-child(1) > li:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")
	public WebElement projectDropdownClick;

	@FindBy(css = ".font-semibold.block.truncate")
	public WebElement getProjectName;
	
	@FindBy(xpath = "//a[@title='Tasks']")
	public WebElement leftMenuTaskClick;
	
	@FindBy(css = "p[class='text-sm text-black dark:text-white max-w-[30rem] truncate']")
	public WebElement clickProjectTitleInSearchBox;
	
	@FindBy(xpath = "//p[@class='text-primary dark:text-white font-semibold cursor-pointer absolute top-2']")
	public WebElement quickTaskLink;

	@FindBy(xpath = "//input[@placeholder='Enter Task Title...']")
	public WebElement taskTitle;
	
	@FindBy(xpath = "//button[@type='button'][normalize-space()='Save']")
	public WebElement saveButton;
	
	public void randomSearch() throws InterruptedException {
		Thread.sleep(2000);
		searchInput.click();
		RandomStringGenerator generator = new RandomStringGenerator();
		String randomTaskTitle = generator.generateRandomString(20);
		System.out.println(randomTaskTitle);
		searchInput.sendKeys(randomTaskTitle);
		Thread.sleep(3000);
		if (noSearchImage.isDisplayed()) {
			System.out.println("No search Image is displaying");
		} else {
			System.out.println("No search Image is not displaying");
		}
		searchInput.clear();
		searchInput.sendKeys(Keys.ENTER);
		if (globalSearchPopup.isDisplayed()) {
			System.out.println("Global search Popup is not closed");
		} else {
			System.out.println("Global search Popup is closed");
		}
	}

	public void taskSearchingGlobally() throws InterruptedException, IOException {
		QuickTask task = new QuickTask();
		task.quickTask();
		Thread.sleep(2000);
		String taskName = getTaskTitle.getText();
		Thread.sleep(2000);
		searchInput.click();
		Thread.sleep(2000);
		searchInput.sendKeys(taskName);
		Thread.sleep(2000);
		clickTaskTitleInSearchBox.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement taskDetailsHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.cssSelector("div[class='flex text-[17px] font-semibold items-center w-full text-black mb-2']")));

		if (taskDetailsHeader.isDisplayed()) {
			System.out.println("Task details page is displayed");
		} else {
			System.out.println("Task details page is not displayed");
		}
		Thread.sleep(1000);
		leftMenuTaskClick.click();		
	}

	public String getFirstProjectFromDropdown() throws InterruptedException {
		projectDropdownClick.click();
		Thread.sleep(2000);
		String firstProjectText = getProjectName.getText();
		return firstProjectText;
	}
	
	public void projectSearchingGlobally() throws InterruptedException, IOException {
		Thread.sleep(2000);
		projectDropdownClick.click();
		Thread.sleep(2000);
		String firstProjectText = getProjectName.getText();
		Thread.sleep(1000);	
		searchInput.click();
		Thread.sleep(2000);
		searchInput.sendKeys(firstProjectText);
		Thread.sleep(2000);
		clickProjectTitleInSearchBox.click();
		Thread.sleep(2000);
		leftMenuTaskClick.click();
	}
	
	public void commonProjectAndTaskGloballySearch() throws InterruptedException
	{
		Thread.sleep(1000);
		projectDropdownClick.click();
		Thread.sleep(2000);
		String getprojectname = getProjectName.getText();
		Thread.sleep(3000);	
		projectDropdownClick.click();
		Thread.sleep(1000);	
		quickTaskLink.click();
		Thread.sleep(1000);	
		taskTitle.sendKeys(getprojectname);
		Thread.sleep(1000);	
		saveButton.click();
		Thread.sleep(2000);	
		searchInput.click();
		Thread.sleep(2000);
		searchInput.sendKeys(getprojectname);
	}
		
}
