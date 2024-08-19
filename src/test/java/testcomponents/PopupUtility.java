package testcomponents;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PopupUtility {
	public WebDriver driver;

	public PopupUtility(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Accept alert
	public void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			// No alert present, do nothing
		}
	}

	// Dismiss alert
	public void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			// No alert present, do nothing
		}
	}

	// Get alert text
	public String getAlertText() {
		try {
			Alert alert = driver.switchTo().alert();
			return alert.getText();
		} catch (NoAlertPresentException e) {
			return null;
		}
	}

	// Set text in the alert (if it's a prompt)
	public void setAlertText(String text) {
		try {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			// No alert present, do nothing
		}
	}
}
