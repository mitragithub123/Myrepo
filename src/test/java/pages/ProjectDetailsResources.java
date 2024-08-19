package pages;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProjectDetailsResources {
	public static WebDriver driver;

	public ProjectDetailsResources(WebDriver driver) {
		ProjectDetailsResources.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".edit_desc")
	WebElement aboutEdit;

	@FindBy(xpath = "(//button[text()='Save'])[2]")
	WebElement descBoxSave;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > select:nth-child(2)")
	WebElement projectChange;

	@FindBy(css = "body div main div div div a:nth-child(1)")
	WebElement workList;

	@FindBy(css = "body div main div div div a:nth-child(2)")
	WebElement boards;

	@FindBy(css = ".block.truncate")
	public static WebElement projectName;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > nav:nth-child(1) > ol:nth-child(1) > li:nth-child(2) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(2)")
	public static WebElement changeProjectDropdownListItem;

	@FindBy(css = "a[title='Teams']")
	public static WebElement TeamsLink;

	@FindBy(css = "p[class='rounded-xl bg-[#d0d5f7] px-4 text-black text-[12px] ml-3 font-semibold']")
	public static WebElement memberCount;

	@FindBy(css = "a[title='Project Settings']")
	public static WebElement projectSettingsLink;

	@FindBy(xpath = "//table[@class='w-full table-auto']")
	public static WebElement tableXPath;

	@FindBy(css = ".w-full.table-auto")
	public WebElement tableElement;

	@FindBy(css = "div[class='ql-editor'] p")
	public WebElement descriptionBox;

	@FindBy(css = "a[title='Project Overview']")
	public WebElement returnToProjectDetails;

	@FindBy(css = "a[title='Boards']")
	public WebElement leftMenuBoardLink;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > p:nth-child(2)")
	public WebElement completedTaskLink;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > p:nth-child(2)")
	public WebElement pendingTaskLink;

	public void aboutEditIconClick() {
		aboutEdit.click();
	}

	public void descBoxClickNEntry() throws InterruptedException {
		Thread.sleep(3000);
		descriptionBox.click();
		descriptionBox.sendKeys(Keys.chord(Keys.CONTROL, "a")); // Select all
		descriptionBox.sendKeys(Keys.BACK_SPACE); // Delete selected content
		descriptionBox.click();
		Thread.sleep(3000);
	}

	public void descBoxSaveBtn() throws InterruptedException {
		descBoxSave.click();
		Thread.sleep(3000);
	}

	public void projectChangeDropdown() throws InterruptedException, IOException {
		projectChange.click();
		Thread.sleep(3000);
		Select dropdown = new Select(projectChange);
		dropdown.selectByVisibleText("Get Task");
		Thread.sleep(3000);
	}

	public void workListLink() throws InterruptedException {
		workList.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

	public void boardsLink() throws InterruptedException {
		boards.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

	public int printMemberCount() {
		System.out.println("Total no of members present in the project: " + Integer.parseInt(memberCount.getText()));
		return Integer.parseInt(memberCount.getText());
	}

	public int countRowsInTable() throws InterruptedException {

		projectSettingsLink.click();
		Thread.sleep(3000);
		TeamsLink.click();
		Thread.sleep(3000);
		List<WebElement> rows = tableElement.findElements(By.tagName("tr"));
		int rowCount = rows.size() - 1;
		return rowCount;

	}

	public void returnBackProjectDetails() {
		returnToProjectDetails.click();
	}

	public void changeProject() throws InterruptedException {
		projectName.click();
		Thread.sleep(3000);
		changeProjectDropdownListItem.click();
	}

	public void clickOnBoardsView() {
		leftMenuBoardLink.click();
	}

	public void verifyCompletedTaskCount() throws InterruptedException {
		System.out.println("Completed task: " + completedTaskLink.getText());
		completedTaskLink.click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	public void verifyPendingTaskCount() throws InterruptedException {
		System.out.println("Pending task: " + pendingTaskLink.getText());
		pendingTaskLink.click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

}
