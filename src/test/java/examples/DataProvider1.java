package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

	public WebDriver driver;
	
	By login = By.className("ico-login");
	By email = By.id("Email");
	By pass = By.id("Password");
	
	
	@DataProvider(name = "logindata")
	public Object[][] logindata(){
		return new Object[][] {
			{"https://demowebshop.tricentis.com/","srini123@gmail.com","123456",},
			
		};
	}
	
	@Test(dataProvider = "logindata", groups = "smoke")
	public void login(String url,String username, String password) throws InterruptedException {
		driver = new EdgeDriver();

		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(login).click();
		Thread.sleep(3000);
		driver.findElement(email).sendKeys(username);
//		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(pass).sendKeys(password);
		Thread.sleep(3000);
		driver.quit();
	}
}
