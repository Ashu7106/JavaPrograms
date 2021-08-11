package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium {
	
	@BeforeMethod
	public void openBrowser() {
		
		System.out.println("open browser");
		
	}
	
	
	@BeforeMethod
	
	public void typeurl() {
		
		
		System.out.println("type url");
	}
	
	
	@Test
	
	public void homePage() {
		
		
		System.out.println("home page");
		
	}
	
	
@Test
	
	public void regPage() {
		
		
		System.out.println("regPage");
		
	}
	

}
