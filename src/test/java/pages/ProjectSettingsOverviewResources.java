package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

public class ProjectSettingsOverviewResources {
	public static WebDriver driver;
	public static Faker faker;

	public ProjectSettingsOverviewResources(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.faker = new Faker();
	}

	@FindBy(css = "a[title='Project Settings']")
	WebElement leftMenuProjectSettingsLink;

	@FindBy(css = "input[placeholder='Project Name']")
	WebElement projectNameField;

	@FindBy(css = "button[title='Update']")
	WebElement updateBtnForProjectNameNDescription;

	@FindBy(xpath = "//button[contains(@class, 'relative') and contains(@class, 'z-20') and contains(@class, 'w-[10vw]') and contains(@class, 'bg-transparent') and contains(@class, 'outline-none') and contains(@class, 'transition') and contains(@class, 'focus:border-primary') and contains(@class, 'text-left') and contains(@class, 'active:border-primary') and contains(@class, 'dark:border-form-strokedark') and contains(@class, 'dark:bg-form-input') and contains(@class, 'cursor-pointer') and contains(@class, 'custom-scrollbar') and contains(@class, 'dark:text-white')]\r\n"
			+ "")
	WebElement custDtlDropdwn;

	@FindBy(css = "li[id='headlessui-listbox-option-:r14:'] span[class='font-normal block truncate']")
	WebElement firstCustSelect;

	@FindBy(css = "button[title='Change']:nth-of-type(2)")
	WebElement updateBtnForCust;

	@FindBy(xpath = "//button[normalize-space()='No']")
	WebElement popupDismiss;

	@FindBy(xpath = "//button[normalize-space()='Yes']")
	WebElement popupAccept;

	@FindBy(css = "button[title='Delete Project']")
	WebElement deleteBtn;

	@FindBy(css = "div[placeholdertext='Description']")
	WebElement proDesc;

	@FindBy(css = "button[title='Update']")
	WebElement updateBtnForProDesc;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")
	WebElement selectCustomerDetails;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")
	WebElement customerDetailsFirstOption;

	@FindBy(css = "div[class='grid grid-cols-5 gap-6 mt-3'] button:nth-child(2)")
	WebElement customerDetailsUpdatebtn;

	public void navigateToProjectSettings() {
		leftMenuProjectSettingsLink.click();
	}

	public void changeProjectName(String projectName) throws InterruptedException {
		if (projectNameField.isEnabled()) {
			projectNameField.clear();
			projectNameField.sendKeys(projectName);
			updateBtnForProjectNameNDescription.click();
		} else {
			System.out.println("Project name field is not enabled.");
		}
	}

	public String generateShortName(String projectName) {
		String[] words = projectName.split("\\s+");
		if (words.length >= 2) {
			return Character.toString(words[0].toUpperCase().charAt(0))
					+ Character.toString(words[1].toUpperCase().charAt(0));
		} else if (words.length == 1) {
			return Character.toString(words[0].toUpperCase().charAt(0));
		} else {
			return "";
		}
	}

	public void changeProDesc() {
		proDesc.click();
		proDesc.sendKeys("ABc");
		updateBtnForProDesc.click();

	}

	public void changeCustomerDetails() {
		selectCustomerDetails.click();
		customerDetailsFirstOption.click();
		customerDetailsUpdatebtn.click();
	}

	public void deleteProject() throws InterruptedException {
		deleteBtn.click();
		Thread.sleep(3000);
		popupDismiss.click();
		Thread.sleep(3000);
		deleteBtn.click();
		popupAccept.click();
	}

	public void changeProjectDescription() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement descriptionBox = wait.until(ExpectedConditions.elementToBeClickable(proDesc));

		try {
			descriptionBox.clear();
			descriptionBox.sendKeys(faker.lorem().characters(10, 30, false));
			updateBtnForProDesc.click();
		} catch (InvalidElementStateException e) {
			// Handle invalid element state exception
			System.err.println("Invalid element state: " + e.getMessage());
		}
	}

	/*------------------- Teams------------------- */

	@FindBy(css = "a[title='Teams']")
	WebElement leftMenuTeamsLink;

	@FindBy(css = "button[title='Add Member']")
	WebElement addMember;

	@FindBy(css = "select[name='resource_id']")
	WebElement teamDropdown;

	@FindBy(css = "button[class='flex justify-center rounded bg-primary py-2 px-6 font-medium text-gray hover:bg-opacity-90 text-sm']")
	WebElement saveBtn;

	@FindBy(xpath = "//div[@class='relative m-auto w-full max-w-180 rounded-sm border border-stroke bg-gray p-4 shadow-default dark:border-strokedark dark:bg-meta-4 sm:p-8 xl:p-10']//button[@class='absolute right-1 top-1 sm:right-5 sm:top-5']//*[name()='svg']")
	WebElement close;

	@FindBy(xpath = "//button[@type='submit'][normalize-space()='Cancel']")
	WebElement cancel;

	@FindBy(xpath = "(//button[contains(@class, 'text-[#98A6AD]')])[1]")
	WebElement kebabMenu;

	@FindBy(xpath = "//div[@class='absolute left-0 top-full z-40 w-40 space-y-1 rounded-sm border border-stroke bg-white p-1.5 shadow-default dark:border-strokedark dark:bg-boxdark block']//button")
	WebElement removeUser;

	@FindBy(css = "button[class='block w-full rounded border border-stroke bg-gray p-3 text-center font-medium text-black transition hover:border-meta-1 hover:bg-meta-1 hover:text-white dark:border-strokedark dark:bg-meta-4 dark:text-white dark:hover:border-meta-1 dark:hover:bg-meta-1']")
	WebElement removeUserDismiss;

	@FindBy(css = "button[class='block w-full rounded border border-add bg-success p-3 text-center font-medium text-white transition hover:bg-opacity-90']")
	WebElement removeUserAccept;

	@FindBy(css = "tbody input[type='checkbox']")
	List<WebElement> checkboxesOneByOne;

	public void navigateToProjectTeams() {
		leftMenuTeamsLink.click();
	}

	public void addTeams() throws InterruptedException {
		addMember.click();
		Thread.sleep(2000);

		close.click();
		Thread.sleep(2000);

		addMember.click();
		Thread.sleep(2000);

		cancel.click();
		Thread.sleep(2000);

		addMember.click();
		Thread.sleep(2000);
		Select select = new Select(teamDropdown);
		select.selectByIndex(1);
		Thread.sleep(2000);
		saveBtn.click();
		Thread.sleep(3000);

		addMember.click();
		Thread.sleep(2000);
		select.selectByIndex(2);
		saveBtn.click();

	}

	public void addNewTeamUser() throws InterruptedException {
		addMember.click();
		Thread.sleep(2000);
		Select select = new Select(teamDropdown);
		select.selectByIndex(2);
		Thread.sleep(2000);
		saveBtn.click();
	}

	public boolean isUserPresentInListing(String userName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement tbody = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("table.w-full tbody")));
		for (WebElement row : tbody.findElements(By.tagName("tr"))) {
			WebElement nameCell = row.findElement(By.xpath("(//td)[6]"));
			if (nameCell.getText().trim().equals(userName)) {
				return true;
			}
		}
		return false;
	}

	public void removeUser() throws InterruptedException {
		removeUserDismiss.click();
		Thread.sleep(2000);
		kebabMenu.click();
		Thread.sleep(2000);
		removeUser.click();
		Thread.sleep(2000);
		removeUserAccept.click();
		Thread.sleep(2000);

	}

	public boolean isUserAbsentInListing(String userName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			WebElement tbody = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("table.w-full tbody")));
			for (WebElement row : tbody.findElements(By.tagName("tr"))) {
				WebElement nameCell = row.findElement(By.xpath("(//td)[6]"));
				if (nameCell.getText().trim().equals(userName)) {
					return false;
				}
			}
		} catch (TimeoutException e) {
			System.out.println("Table element not found within the timeout period.");
		} catch (NoSuchElementException e) {
			System.out.println("Table element or user '" + userName + "' not found in the listing.");
		}
		return true;
	}

	public void clickCheckboxesOneByOne() {
		for (int i = 0; i < checkboxesOneByOne.size(); i++) {
			checkboxesOneByOne.get(i).click();
		}
	}
}