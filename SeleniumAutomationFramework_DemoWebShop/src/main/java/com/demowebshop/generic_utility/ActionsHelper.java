package com.demowebshop.generic_utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsHelper {
	public Actions action;
	
	public ActionsHelper(WebDriver driver) {
		this.action=new Actions(driver);
	}
	//Click on A element
	public void mouseLeftClickOnElement(WebElement element) {
		action.click(element).perform();
	}
	public void mouseDoubleClickOnElement(WebElement element) {
		action.doubleClick(element).perform();
	}
	public void mouseRightClickOnElement(WebElement element) {
		action.contextClick(element).perform();
	}
	//Scrolling
	public void scrollToTheloactedElement(WebElement element) {
		action.scrollToElement(element).perform();
	}
	public void scrollToTheCoordinates(int x,int y) {
		action.scrollByAmount(x, y).perform();
	}
	//Mouse hover
	public void hoverTheMouseOverTheElement(WebElement element) {
		action.moveToElement(element).perform();
	}
	public void hoverTheMouseOverTheElementWithPrecision(WebElement element,int x,int y) {
		action.moveToElement(element, x, y).perform();
	}
	public void hoverTheMousePointerOnCoordinates(int x,int y) {
		action.moveToLocation(x, y).perform();
	}
	//Drag and Drop
	public void dragLoactedElementAndDropOnElement(WebElement source,WebElement target) {
		action.dragAndDrop(source, target).perform();
	}
	public void dragLoactedElementAndDropOncoordinate(WebElement source,int x,int y) {
		action.dragAndDropBy(source, x, y).perform();
	}
	//Click Hold And release
	public void clickAndHoldLoactedWebelementAndRelease(WebElement element,long pauseDurationInSec) {
		action.clickAndHold(element).pause(pauseDurationInSec).release().perform();
	}
	public void clickAndHoldLoactedWebelementAndReleaseOnElement(WebElement source,WebElement target,long pauseDurationInSec) {
		action.clickAndHold(source).pause(pauseDurationInSec).release(target).perform();
	}
	//Press enter
	public void pressEnter() {
		action.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	}
	//Press Navigation Arrow down
	public void pressNavigationArrowDown(int numOfPress) {
		for (int i = 0; i < numOfPress; i++) {
			action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		}
	}

}
