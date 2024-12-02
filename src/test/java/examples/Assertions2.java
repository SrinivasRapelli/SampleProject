package examples;

import org.testng.annotations.Test;

import org.testng.Assert;

public class Assertions2 {

	
	//@Test
	public void method1() {
		int a = 10;
		int b = 10;
		
		Assert.assertEquals(a, b,"a and b are not equal");
		
	}
	
	//@Test
	public void method2() {
		int a = 10;
		int b = 20;
		
		Assert.assertNotEquals(a, b,"a and b are equal");
		
	}
	
	
	//@Test	
	public void method3() {
		boolean condition = (2<5);
		Assert.assertFalse(condition,"condition is  true");
		
		
	}
	
	@Test	
	public void method4() {
		String a =null;
		Assert.assertNotNull(a,"value is not null");
		
		
	}
	
	
}
