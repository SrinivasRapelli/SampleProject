package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions1 {

	public WebDriver driver;
	
	@Test
	public  void example() {
		driver = new EdgeDriver();

		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		
		String actual = driver.getTitle();
		String expected = "Demo Web Shop dvdfvdefv";
		
		SoftAssert s = new SoftAssert();
		
		s.assertEquals(actual, expected,  "xcvdfv");
		
		System.out.println("Softassertion ended");
		driver.quit();		
		
	}
	
}
