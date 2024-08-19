package testcomponents;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorComponents extends BaseTest {
	public JavascriptExecutor js;

	public JavaScriptExecutorComponents(WebDriver driver) {
		super();
		this.js = (JavascriptExecutor) driver;
	}

	// Draw border around the element
	public void drawBorderByJs(WebElement element, WebDriver driver) {

		js.executeScript("arguments[0].style.border='2px solid red'", element);
	}

	// To get the title of the web page
	public String getTitleByJs(WebDriver driver) {

		String title = js.executeScript("return document.title").toString();
		return title;
	}

	// Get page URL using JavaScript
	public String getPageUrl() {
		return (String) js.executeScript("return window.location.href;");
	}

	// To generate an alert
	public void generateAlertByJs(WebDriver driver, String message) {

		js.executeScript("alert('This is an alert!');");
	}

	// Refresh browser
	public void refreshBrowserByJs(WebDriver driver) {

		js.executeScript("history.go(0)");
	}

	// Browser back
	public void browserBackByJs(WebDriver driver) {

		js.executeScript("window.history.back()");

	}

	// Browser forward
	public void browserForwardByJs(WebDriver driver) {

		js.executeScript("window.history.forward()");

	}

	// Scroll to the end of the page
	public void scrollToBottom(WebDriver driver) {

		js.executeScript("arguments[0].scrollIntoView(true);");
	}

	// Scroll to the top of the page
	public void scrollToTop(WebDriver driver) {

		js.executeScript("window.scrollTo(0, 0);");
	}

	// Scroll to a specific section of the page
	public void scrollToSection(WebElement element, WebDriver driver) {

		js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", element);
	}

	// Flashing an element
	public void changeElementColor(WebDriver driver, WebElement element, String color) {

		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void flashElement(WebDriver driver, WebElement element) {
		String bgColor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 500; i++) {
			changeElementColor(driver, element, "red");
			changeElementColor(driver, element, bgColor);
		}
	}

}
