package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UsingParameter {

    WebDriver driver;

    @Test
    @Parameters({"browser", "url", "username", "password"})
    public void loginTest(@Optional("chrome") String browser,
            @Optional("https://demowebshop.tricentis.com/login") String url,
            @Optional("defaultUser") String username,
            @Optional("defaultPass") String password
        	) {
    	
    	// Set up the browser driver
        if (browser.equalsIgnoreCase("chrome")) {
        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\clickBooking\\drivers\\chromedriver.exe");
    		driver = new ChromeDriver();
        
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + browser);
        }

       
            driver.get(url);

            WebElement usernameField = driver.findElement(By.id("Email"));
            WebElement passwordField = driver.findElement(By.id("Password"));

            usernameField.sendKeys(username);
            passwordField.sendKeys(password);
            
       
        
    }
}
