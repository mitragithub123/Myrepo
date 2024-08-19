package testcomponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	public static Logger logger;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentSparkReporter sparkReporter;

	static {
		logger = Logger.getLogger(BaseTest.class);
	}

	public static WebDriver initializeDriver() throws IOException, InterruptedException {
		Properties property = new Properties();
		FileInputStream fis = new FileInputStream("src/test/java/resources/GlobalData.properties");
		property.load(fis);
		String browserName = property.getProperty("browser");
		String url = property.getProperty("url");

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");// Start Chrome in a maximized window
			options.addArguments("--disable-notifications");// Disable browser notifications
			options.addArguments("--incognito");// Opens browser in incognito mode
			options.setAcceptInsecureCerts(true);// Accept insecure certificates
			// Remove "Chrome is being controlled by automated test software" message
			options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
			options.setExperimentalOption("useAutomationExtension", false);
			//options.addArguments("--headless");// Run Chrome in headless mode

			driver = new ChromeDriver(options);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		return driver;
	}

	@BeforeTest
	public static void startExtentReport() {
		sparkReporter = new ExtentSparkReporter("Reports/extentSparkreport.html");
		sparkReporter.config().setDocumentTitle("Base leaf automation report");
		sparkReporter.config().setReportName("Automation test execution report");
		sparkReporter.config().setTheme(Theme.STANDARD);
		sparkReporter.config().setTimeStampFormat("dd-MMM-yyyy HH:mm:ss");
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Tester", "Mitra Bhanu");
	}

	@AfterTest
	public static void endExtentReport() {
		extent.flush();
	}

	public static String captureScreenshot(WebDriver driver) throws IOException {
		File screenshotsDir = new File("./Reports/screenshots");
		screenshotsDir.mkdirs(); // Create directory if it doesn't exist

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotName = "screenshot" + System.currentTimeMillis() + ".png";
		File destinationFile = new File(screenshotsDir, screenshotName);

		FileUtils.copyFile(screenshotFile, destinationFile);

		return destinationFile.getAbsolutePath();
	}
}
