package com.infix.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverWrapper {
	
	public static WebDriver driver;
	
	
	public void clickById(String locator){
		driver.findElement(By.id(locator)).click();
	}
	public void clickByXpath(String locator){
		driver.findElement(By.xpath(locator)).click();
	}
	public void clickByCss(String locator){
		driver.findElement(By.cssSelector(locator)).click();
	}
	public void clickByLink(String locator){
		driver.findElement(By.linkText(locator)).click();
	}
	
	public void typeByID(String locator, String value){
		driver.findElement(By.id(locator)).sendKeys(value);
	}
	public void typeByXath(String locator, String value){
		driver.findElement(By.xpath(locator)).sendKeys(value);
	}
	public void typeByCss(String locator, String value){
		driver.findElement(By.cssSelector(locator)).sendKeys(value);
	}
	public void windowClose(){
		driver.close();
	}
	
	public void openPage(String url){
		driver.get(url);
	}

}
