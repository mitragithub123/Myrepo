package pages;

import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectListingResources {
	public static WebDriver driver;

	public ProjectListingResources(WebDriver driver) {
		ProjectListingResources.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[normalize-space()='Add Project']")
	WebElement newProject;

	@FindBy(xpath = "//input[@id='taskTitle']")
	public static WebElement projectNameField;

	@FindBy(xpath = "//textarea[@id='taskDescription']")
	public static WebElement descriptionField;

	@FindBy(xpath = "//select[@name='project_priority']")
	WebElement priorityDropdown;

	@FindBy(xpath = "//input[@placeholder='Start Date']")
	WebElement startDate;

	@FindBy(css = ".react-datepicker__day--today")
	WebElement startDateSelect;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement submit;

	@FindBy(xpath = "(//div[contains(text(),'Project')])[1]")
	WebElement toastMessage;

	@FindBy(css = "body div div div div div div:nth-child(1) div:nth-child(1) div:nth-child(2) h3:nth-child(1)")
	public
	static WebElement projectName;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > p:nth-child(2)")
	public static WebElement projectDescription;

	public void newProject() {
		newProject.click();
	}

	public void addDetailsToProject() {
		String randomProjectName = generateRandomWords(5);
		projectNameField.sendKeys(randomProjectName);
		System.out.println(randomProjectName);
		String randomDescription = generateRandomDescription();
		descriptionField.sendKeys(randomDescription);
		System.out.println(randomDescription);
		priorityDropdown.click();
	}
	
	public String generateRandomProjectName() {
        return generateRandomWords(5);
    }

	public void selectPriority(String priority) {
		priorityDropdown.click();
		Select priorityDropdownSelect = new Select(priorityDropdown);
		priorityDropdownSelect.selectByVisibleText(priority);
	}

	public void clickOnStartDate() {
		startDate.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(startDate));
		startDateSelect.click();
	}

	public void createPopUpSubmit() throws InterruptedException {
		submit.click();
	}

	// Method to generate random words
	public String generateRandomWords(int count) {
		String[] words = { "apple", "banana", "orange", "grape", "strawberry", "peach", "pear", "watermelon",
				"pineapple", "kiwi" };
		Random random = new Random();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < count; i++) {
			int index = random.nextInt(words.length);
			stringBuilder.append(words[index]);
			if (i < count - 1) {
				stringBuilder.append(" ");
			}
		}
		return stringBuilder.toString();
	}

	// Method to generate random words (project description)
	public String generateRandomDescription() {
		String[] words = { "cat", "dog", "rabbit", "hamster", "guinea pig", "elephant", "giraffe", "zebra", "lion",
				"tiger", "ocean", "river", "lake", "mountain", "forest", "sun", "moon", "star", "planet", "galaxy" };

		StringBuilder descriptionBuilder = new StringBuilder();

		Random random = new Random();

		for (int i = 0; i < 30; i++) {
			int wordIndex = random.nextInt(words.length);
			descriptionBuilder.append(words[wordIndex]).append(" ");
		}

		return descriptionBuilder.toString().trim();
	}

	public WebElement getToastMessage() {
		return toastMessage;
	}

	public void toastMessageDisplay() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(toastMessage));
		String successMessage = toastMessage.getText();
		System.out.println(successMessage);
	}

	public static void projectNameMatch(String randomProjectName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(projectName));

		if (projectName.getText().equalsIgnoreCase(randomProjectName)) {
			System.out.println("Project name is matching");
		} else {
			System.out.println("Project name is not matching");
		}
	}

	public static void projectDescriptionMatch(String randomDescription) {
		if (projectDescription.getText().equalsIgnoreCase(randomDescription)) {
			System.out.println("Project description is matching");
		} else {
			System.out.println("Project description is not matching");
		}

	}

	public void clickProjectName() throws InterruptedException {
		projectName.click();
		Thread.sleep(3000);
	}

}
