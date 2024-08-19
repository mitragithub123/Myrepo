package testcomponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtility {
	private WebDriverWait wait;

	public WaitUtility(WebDriver driver, Duration timeout) {
		this.wait = new WebDriverWait(driver, timeout);
	}

	public WaitUtility(WebDriver driver) {
		this(driver, Duration.ofSeconds(10)); // Default timeout of 10 seconds
	}

	// Wait for element to be click-able
	public void waitForElementToBeClickable(WebElement element) {
		if (wait != null) {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
	}

	// Wait for element to be visible
	public void waitForElementVisibility(WebElement element) {
		if (wait != null) {
			wait.until(ExpectedConditions.visibilityOf(element));
		}
	}

	// Wait for element to be invisible
	public void waitForElementInvisibility(WebElement element) {
		if (wait != null) {
			wait.until(ExpectedConditions.invisibilityOf(element));
		}
	}

	// Wait for text to be present in the element
	public void waitForTextToBePresentInElement(WebElement element, String text) {
		if (wait != null) {
			wait.until(ExpectedConditions.textToBePresentInElement(element, text));
		}
	}

	// Wait for element to be present in the DOM
	public void waitForElementPresence(WebElement element) {
		if (wait != null) {
			wait.until(ExpectedConditions.visibilityOf(element));
		}
	}

	// Wait for alert to be present
	public void waitForAlert() {
		if (wait != null) {
			wait.until(ExpectedConditions.alertIsPresent());
		}
	}
}
