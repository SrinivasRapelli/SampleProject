package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By loginLink = By.className("ico-login");
	By email = By.id("Email");
	By pass = By.id("Password");
	

	public void clickOnLoginLink() {
		driver.findElement(loginLink).click();
	}
	
	public void enteremail() {
		driver.findElement(email).sendKeys("bjskcjs");
	}
	
	public void enterpassword() {
		driver.findElement(pass).sendKeys("bjskcjs");
	}
	
}
