package com.infix.base;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGBase extends WebDriverWrapper {
	@BeforeMethod
	public void setup(){
		driver = new FirefoxDriver();
		openPage("http://www.docpatient.info/");
		
	}
	
	@AfterMethod
	public void tearDowan(){
		windowClose();
	}

}
