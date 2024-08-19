package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testcomponents.ReadConfig;

public class LoginResources {

	public WebDriver driver;
	ReadConfig config = new ReadConfig();

	public LoginResources(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "input[placeholder='Enter your email']")
	public WebElement email;

	@FindBy(css = "input[placeholder='Enter your password']")
	WebElement password;

	@FindBy(css = "input[value='Sign In']")
	public WebElement signIn;

	@FindBy(css = "img[alt='Orangescrum logo']")
	public WebElement logo;

	@FindBy(xpath = "//a[normalize-space()='Forgot Password']")
	WebElement forgetPass;

	@FindBy(xpath = "//button[normalize-space()='Sign in with Google']")
	WebElement googleSignIn;

	public void navigateToLoginPage() throws InterruptedException {
		driver.get(config.getUrl());
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	public void loginToApp(String id, String pwd) throws InterruptedException {
		email.sendKeys(id);
		password.sendKeys(pwd);
		signIn.click();
		Thread.sleep(3000);
	}

	public void logoClick() throws InterruptedException {
		logo.click();
		Thread.sleep(2000);
	}

	public void multipleLogin(String username, String pass) throws InterruptedException {
		signIn.click();
		email.sendKeys(username);
		password.sendKeys(pass);
		signIn.click();
		Thread.sleep(2000);
	}

	public void validateUrl(WebDriver driver) {
		try {
			String currentUrl = driver.getCurrentUrl();
			Assert.assertTrue(currentUrl.contains("https://qa-osbaseleaf.andolasoft.co.in/projects"),
					"URL does not contain 'https://qa-osbaseleaf.andolasoft.co.in/projects', Test Failed.");
			System.out.println("Test Passed: URL contains 'https://qa-osbaseleaf.andolasoft.co.in/projects'");
		} catch (AssertionError e) {
			System.out.println("Test Failed: URL does not contain 'https://qa-osbaseleaf.andolasoft.co.in/projects'");
			throw e;
		}
	}

}