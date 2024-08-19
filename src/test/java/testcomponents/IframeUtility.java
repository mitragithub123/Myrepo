package testcomponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IframeUtility {
	public WebDriver driver;

	public IframeUtility(WebDriver driver) {
		this.driver = driver;
	}

	// Switch to a frame by index
	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}

	// Switch to a frame by name or id
	public void switchToFrame(String frameNameOrId) {
		driver.switchTo().frame(frameNameOrId);
	}

	// Switch to a frame by web element
	public void switchToFrame(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	// Switch to default content (main page)
	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}
}
