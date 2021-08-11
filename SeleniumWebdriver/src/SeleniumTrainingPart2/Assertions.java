package SeleniumTrainingPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?service=accountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3Dsign_in_no_continue%26pli%3D1&ec=GAlAwAE&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[1]")).click();
		String actualText=driver.findElement(By.cssSelector(".o6cuMc")).getText();
		
		System.out.println(actualText);
		String expectedText="Enter an email or phone number";
		
		Assert.assertEquals(actualText,expectedText);
			
		Assert.assertTrue(actualText.contains("enter email"));
		
		System.out.println("test case pass");
			
		
		
		
	}

}
