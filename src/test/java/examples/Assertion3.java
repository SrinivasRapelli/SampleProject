package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Assertion3 {
	public WebDriver driver;
	
	//@Test
	public void method1() throws InterruptedException {
		driver = new EdgeDriver();

		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"RememberMe\"]"));
		//ele.click();
		Thread.sleep(3000);
		//Assert.assertTrue(ele.isEnabled(),"Not Selected");
		
		Assert.assertNotNull(ele,"the element is not found");
		
		driver.quit();
		
	}
	
	//@Test
	public void method2() {
		driver = new EdgeDriver();

		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		String actual = driver.getTitle();
		String expected = "Demo Web Shop  fbfhbtg";
		
		Assert.assertNotEquals(actual, expected,"Title is mismatched");
		
		driver.quit();
		
	}
	
	
	
	
	
	
	@Test
	 public void testSoftAssertions() {
	        SoftAssert softAssert = new SoftAssert();
	        
	        System.out.println("Starting Test");

	        //softAssert.assertEquals(2 + 2, 3, "First assertion passed");
	       
	        
	        softAssert.assertTrue((2>7), "Second assertion failed");
            System.out.println("==============");
//	        softAssert.assertEquals("Hello", "Hello", "Third assertion passed");
//	        
//	        softAssert.assertAll();
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
