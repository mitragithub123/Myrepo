package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcomponents.ReadConfig;

public class SignUpResources {

	public WebDriver driver;
	ReadConfig config = new ReadConfig();

	public SignUpResources(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Sign Up']")
	WebElement signUp;

	@FindBy(css = "input[placeholder='Enter your email']")
	WebElement email;

	@FindBy(css = "input[placeholder='Enter your password']")
	WebElement password;

	@FindBy(css = "input[value='Create Account']")
	WebElement createAcc;

	@FindBy(xpath = "//button[normalize-space()='Sign up with Google']")
	WebElement signUpGoogle;

	@FindBy(xpath = "//a[normalize-space()='Privacy Policy']")
	WebElement privacy;

	@FindBy(xpath = "//a[normalize-space()='Terms of Service']")
	WebElement terms;

	@FindBy(xpath = "//a[normalize-space()='Sign in']")
	WebElement signIn;

	@FindBy(css = "img[alt='logo'][loading='lazy'][width='200']")
	WebElement logo;

	public void navigateToSignUpPage() throws InterruptedException {
		driver.get(config.getUrlSignUp());
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	public void signupToAppPage(String pwd) throws InterruptedException {
		String randomEmail = generateRandomEmail();
		System.out.println(randomEmail);
		email.sendKeys(randomEmail);
		Thread.sleep(3000);
		password.sendKeys(pwd);
		createAcc.click();
		Thread.sleep(10000);
	}
	
	public void multipleSignUp(String username, String pass) throws InterruptedException {
		email.sendKeys(username);
		password.sendKeys(pass);
		createAcc.click();
		Thread.sleep(5000);
	}
	

	// Random email id generate method
	public String generateRandomEmail() {
		// Define a list of characters that can be used in the username
		String usernameCharacters = "abcdefghijklmnopqrstuvwxyz0123456789";
		int usernameLength = 8;

		// Define a list of common domain names
		String[] domainNames = { "gmail.com", "yahoo.com", "hotmail.com" };

		// Random number generator
		java.util.Random rand = new java.util.Random();

		// Generate a random user name
		StringBuilder username = new StringBuilder();
		for (int i = 0; i < usernameLength; i++) {
			int randomIndex = rand.nextInt(usernameCharacters.length());
			username.append(usernameCharacters.charAt(randomIndex));
		}

		// Randomly select a domain name
		int randomDomainIndex = rand.nextInt(domainNames.length);
		String domain = domainNames[randomDomainIndex];

		// Create the random email address
		return username.toString() + "@" + domain;
	}

}