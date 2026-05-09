package com.demowebshop.generic_utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptExecutorUtility {
	public JavascriptExecutor js;
	public JavascriptExecutorUtility(WebDriver driver) {
		this.js=(JavascriptExecutor) driver;
	}
	//scrolling
	public void scrollTillTheCoordinatesFromOrigin(int x,int y) {
		js.executeScript("window.scrollTo("+x+","+y+")");
	}
	public void scrollTillTheCoordinatesFromCurrentPosition(int x,int y) {
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	public void scrollTillTheElementIsVisible(boolean upOrDown) {
		js.executeScript("arguments[0].scrollInto("+upOrDown+")");
	}
	//clicking
	public void leftClickOnElement(WebElement element) {
		js.executeScript("arguments[0].click()",element);
	}
	//Typing
	public void enterTextOnElement(WebElement element,String text) {
		js.executeScript("arguments[0].value="+text+"",element);
	}
	

}
