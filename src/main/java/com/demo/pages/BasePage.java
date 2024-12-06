package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BasePage {
  public  WebDriver driver;
	
 	@BeforeSuite
	public void openBrowser() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}
	
 	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}
	
}
