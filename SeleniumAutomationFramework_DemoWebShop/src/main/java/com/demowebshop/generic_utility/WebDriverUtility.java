package com.demowebshop.generic_utility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	//Open Web page
	 public void openWebPage(WebDriver driver,String Url) {
		 driver.get(Url);
	 }
	 //maximize
	 public void maximizeBrowserWindow(WebDriver driver) {
		 driver.manage().window().maximize();
	 }
	 //Implicit wait
	 public void addGlobalWaitForTheWebPage(WebDriver driver,long seconds) {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	 }
	 //fetch title
	 public String fetchTitleOfCurrentWebpage(WebDriver driver) {
		return driver.getTitle();
	}
	 //fetch url
	 public String fetchUrlOfCurrentWebpage(WebDriver driver) {
		return driver.getCurrentUrl();
	}
	 //close browser
	 public void closeCurrentBrowserWindow(WebDriver driver) {
		driver.close();
	}
	 //quit browser
	 public void quitBrowser(WebDriver driver) {
		 driver.quit();
	}
	//Manage
	 public void minimizeBrowserWindow(WebDriver driver) {
		 driver.manage().window().minimize();
	}
	 public void fullscreenBrowserWindow(WebDriver driver) {
		 driver.manage().window().fullscreen();
	}
	 public Dimension fetchDimensionOfBrowserWindow(WebDriver driver) {
		return driver.manage().window().getSize();
	}
	 public void changeDimensionOfBrowserWindow(WebDriver driver,int width,int height) {
		 driver.manage().window().setSize(new Dimension(width, height));
	}
	 public Point fetchCoordinatesOfBrowserWindow(WebDriver driver) {
			return driver.manage().window().getPosition();
	}
	 public void changeCoordinatesOfBrowserWindow(WebDriver driver,int x,int y) {
		 driver.manage().window().setPosition(new Point(x, y));
	}
	//Navigation
	 public void navigateToWebpage(WebDriver driver,String url) {
		 driver.navigate().to(url);
	}
	 public void navigateForwardToWebpage(WebDriver driver) {
		 driver.navigate().forward();
	}
	 public void navigateBackwardToWebpage(WebDriver driver) {
		 driver.navigate().back();
	}
	 public void refreshWebpage(WebDriver driver) {
		 driver.navigate().refresh();
	}
	 //Switching the control to child window or tab
	 public void switchingControlToChildWindowOrTab(WebDriver driver,String Url) {
		 Set<String> allIds = driver.getWindowHandles();
		 for (String childId : allIds) {
			driver.switchTo().window(childId);
			if (driver.getCurrentUrl().contains(Url)) {
				break;
			}
		}
	}
	 public void switchingControlToChildWindowOrTab(String title,WebDriver driver) {
		 Set<String> allIds = driver.getWindowHandles();
		 for (String childId : allIds) {
			driver.switchTo().window(childId);
			if (driver.getTitle().contains(title)) {
				break;
			}
		}
		
	 }
	 public void launchingAndSwitchingControlToWindow(WebDriver driver) {
		 driver.switchTo().newWindow(WindowType.WINDOW);
	}
	 public void launchingAndSwitchingControlToTab(WebDriver driver) {
		 driver.switchTo().newWindow(WindowType.TAB);
	}
	 //Handle Javascript popup
	 public void acceptJavascriptPopup(WebDriver driver) {
		 driver.switchTo().alert().accept();
	}
	 public void dismissJavascriptPopup(WebDriver driver) {
		 driver.switchTo().alert().dismiss();
	}
	 public void enterTextAndAcceptJavascriptPopup(WebDriver driver,String inputText) {
		 Alert alert = driver.switchTo().alert();
		 alert.sendKeys(inputText);
		 alert.accept();
	}
	 public void enterTextAndDismissJavascriptPopup(WebDriver driver,String inputText) {
		 Alert alert = driver.switchTo().alert();
		 alert.sendKeys(inputText);
		 alert.dismiss();
	}
	 public String fetchMessageFromJavascriptPopup(WebDriver driver) {
		 return driver.switchTo().alert().getText();
	}
	 //Frames
	 public void switchControlToFrame(WebDriver driver,int frameIndex) {
		 driver.switchTo().frame(frameIndex);
	}
	 public void switchControlToFrame(WebDriver driver,String nameOrId) {
		 driver.switchTo().frame(nameOrId);
	}
	 public void switchControlToFrame(WebDriver driver,WebElement frameElement) {
		 driver.switchTo().frame(frameElement);
	}
	 public void switchControlToParentFrame(WebDriver driver) {
		 driver.switchTo().parentFrame();
	}
	 public void switchControlToMainPage(WebDriver driver) {
		 driver.switchTo().defaultContent();
	}
	 //Explicit wait
	 public void waitTillTheElementIsVisible(WebDriver driver,long seconds,WebElement element) {
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
		 wait.until(ExpectedConditions.visibilityOf(element));
		 }
	 public void waitTillTheElementIsClickable(WebDriver driver,long seconds,WebElement element) {
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
		 wait.until(ExpectedConditions.elementToBeClickable(element));
		 }

}
