package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Assertions1 {
	
	public WebDriver driver;
	
	
	//@Test
	public void login() {
		driver = new EdgeDriver();

		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		
		String actual = driver.getTitle();
		String expected = "Demo Web Shop";
		Assert.assertEquals(actual, expected,"Yes..");
		

	}
	
	
	@Test
	 public void testTrueCondition() {
	        boolean condition = (5 < 2);
	        Assert.assertTrue(condition, "The condition is not true!");
	    }
	
	
	  @Test
	    public void testFalseCondition() {
	        boolean condition = (2 > 5);
	        Assert.assertFalse(condition, "The condition is not false!");
	    }
	
	
	
	
	
	
	
	
	
}
