package testcomponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtility extends BaseTest {
	public WebDriver driver;
	public Actions actions;

	public ActionUtility(WebDriver driver) {
		this.driver = driver;
		this.actions = new Actions(driver);
	}

	// Move mouse to the center of the given element
	public void moveToElement(WebElement element) {
		actions.moveToElement(element).perform();
	}

	// Move the mouse by the given offset
	public void moveByOffset(int xOffset, int yOffset) {
		actions.moveByOffset(xOffset, yOffset).perform();
	}

	// Move to the center of the given element and then click it
	public void moveToElementAndClick(WebElement element) {
		moveToElement(element);
		element.click();
	}

	// Perform drag-and-drop
	public void dragAndDrop(WebElement source, WebElement destination) {
		actions.dragAndDrop(source, destination);
	}

	// Perform click and hold and move
	public void clickAndHoldNdragAndDrop(WebElement source, WebElement target) {
		actions.clickAndHold(source).moveToElement(target).release().build().perform();
	}

	// Perform double click
	public void doubleClick(WebElement element) {
		actions.doubleClick(element).perform();
	}

	// Perform right click
	public void rightClick(WebElement element) {
		actions.contextClick(element).perform();
	}

	// Click and hold the mouse button on the given element
	public void clickAndHold(WebElement element) {
		actions.clickAndHold(element).perform();
	}

	// Release the mouse button on the given element
	public void release(WebElement element) {
		actions.release(element).perform();
	}

}
