package com.infix.test;

import org.testng.annotations.Test;

import com.infix.base.TestNGBase;
import com.infix.locator.HomePageLocator;
import com.infix.value.HomePageValue;

public class LoginTest extends TestNGBase {

	HomePageLocator loc = new HomePageLocator();
	HomePageValue val = new HomePageValue();
	@Test
	public void loginTest(){
		clickByLink(loc.patientPortalLink);
		typeByID(loc.nameBoxID,val.firstName);
		typeByID(loc.passwordBoxId, val.password);
		
	}
	@Test
	public void test2(){
		
	}
}
