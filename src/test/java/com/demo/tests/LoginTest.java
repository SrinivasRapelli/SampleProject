package com.demo.tests;

import org.testng.annotations.Test;

import com.demo.pages.BasePage;
import com.demo.pages.LoginPage;

public class LoginTest extends BasePage{

	LoginPage loginPage;
	
	@Test
	public void loginToTheDemoWebsite() throws InterruptedException {
		loginPage = new LoginPage(driver);
		loginPage.clickOnLoginLink();
		loginPage.enteremail();
		loginPage.enterpassword();
		Thread.sleep(5000);
		
	}
}
