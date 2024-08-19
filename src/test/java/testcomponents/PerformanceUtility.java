package testcomponents;

import org.openqa.selenium.WebDriver;

public class PerformanceUtility extends BaseTest {
	public WebDriver driver;

	public PerformanceUtility(WebDriver driver) {
		this.driver = driver;
	}

	// Method to measure page load time
	public long measurePageLoadTime(WebDriver driver, String url) {
		long startTime = System.currentTimeMillis();
		driver.get(url);
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

}
