package com.madruga.jbehaveweb.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	//private static SharedDriver driver;
	private static WebDriver driver;
		
	public PageBase() {
		if (driver == null) {
			//driver = new SharedDriver();
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(getDriver(), this);
	}
	
	public PageBase(WebDriver driver) {
		if (driver != null) {
			PageBase.driver = driver;
		}
		PageBase.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(getDriver(), this);
		
	}
	
	public static WebDriver getDriver() {
		return PageBase.driver;
	}
	
	public void close() {
		PageBase.driver.close();
	}
	
	public void setField(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	
	public String getField(WebElement element) {
		return element.getAttribute("value");
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
}
