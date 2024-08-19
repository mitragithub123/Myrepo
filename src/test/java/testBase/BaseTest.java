package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.net.URL;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	public Logger logger;
	public Properties property;

	@BeforeClass(groups = { "Regression", "Master", "Sanity", "Datadriven" })
	public void setup() throws IOException {
		FileInputStream file = new FileInputStream(".\\src\\test\\resources\\config.properties");
		property = new Properties();
		property.load(file);
		String browserName = property.getProperty("browser1");

		logger = LogManager.getLogger(this.getClass());

		if (property.getProperty("exeEnv").equalsIgnoreCase("remote")) {
			DesiredCapabilities decap = new DesiredCapabilities();

			// OS
			if (property.getProperty("os1").equalsIgnoreCase("windows")) {
				decap.setPlatform(Platform.WIN10);
			} else if (property.getProperty("os2").equalsIgnoreCase("linux")) {
				decap.setPlatform(Platform.LINUX);
			} else if (property.getProperty("os2").equalsIgnoreCase("mac")) {
				decap.setPlatform(Platform.MAC);
			} else {
				System.out.println("No matching OS");
				return;
			}

			// Browser
			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();

				// Set ChromeOptions
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--start-maximized");
				options.addArguments("--disable-notifications");
				options.addArguments("--incognito");
				options.setAcceptInsecureCerts(true);
				options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
				options.setExperimentalOption("useAutomationExtension", false);

				// Merge options with DesiredCapabilities
				decap.merge(options);

				driver = new RemoteWebDriver(new URL("http://192.168.2.119:4444/wd/hub"), decap);

			} else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();

				// Set FirefoxOptions
				FirefoxOptions options = new FirefoxOptions();
				options.addArguments("--start-maximized");
				options.addArguments("--disable-notifications");
				options.addArguments("--private");
				options.setAcceptInsecureCerts(true);

				// Merge options with DesiredCapabilities
				decap.merge(options);

				driver = new RemoteWebDriver(new URL("http://192.168.2.119:4444/wd/hub"), decap);
			}
			driver.get(property.getProperty("prodUrl"));
		}

		if (property.getProperty("exeEnv").equalsIgnoreCase("local")) {
			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();

				// Set ChromeOptions
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--start-maximized"); // Start Chrome in a maximized window
				options.addArguments("--disable-notifications"); // Disable browser notifications
				options.addArguments("--incognito"); // Opens browser in incognito mode
				options.setAcceptInsecureCerts(true); // Accept insecure certificates
				// Remove "Chrome is being controlled by automated test software" message
				options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
				options.setExperimentalOption("useAutomationExtension", false);
				// options.addArguments("--headless"); // Run Chrome in headless mode (if
				// needed)

				driver = new ChromeDriver(options); // Initialize WebDriver with ChromeOptions
			}

			else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();

				// Set FirefoxOptions
				FirefoxOptions options = new FirefoxOptions();
				options.addArguments("--start-maximized"); // Start Firefox in a maximized window
				options.addArguments("--disable-notifications"); // Disable browser notifications
				options.addArguments("--private"); // Opens browser in private mode
				options.setAcceptInsecureCerts(true); // Accept insecure certificates

				driver = new FirefoxDriver(options);
			}
			driver.get(property.getProperty("prodUrl"));
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterClass(groups = { "Regression", "Master", "Sanity", "Datadriven" })
	public void teardown() {
		driver.quit();
	}

	public String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}

	public String randomNumber() {
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return generatedNumber;
	}

	public String randomAlphaNumeric() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return (generatedString + "@" + generatedNumber);
	}

	public static String captureScreenshot(WebDriver driver) throws IOException {
		File screenshotsDir = new File(System.getProperty("user.dir") + File.separator + "screenshots");
		screenshotsDir.mkdirs(); // Create directory if it doesn't exist

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotName = "screenshot" + System.currentTimeMillis() + ".png";
		File destinationFile = new File(screenshotsDir, screenshotName);

		FileUtils.copyFile(screenshotFile, destinationFile);

		return destinationFile.getAbsolutePath();
	}
}
