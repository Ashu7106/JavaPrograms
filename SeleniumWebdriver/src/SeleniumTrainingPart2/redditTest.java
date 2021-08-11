package SeleniumTrainingPart2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redditTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe" );

		WebDriver driver3=new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		// other way of using timeout 
		// Timeouts time = driver3.manage().timeouts();
		 //time.pageLoadTimeout(15,TimeUnit.SECONDS);
		driver3.get("https://www.reddit.com/");
		
	    
	    
		 System.out.println(driver3.getTitle());
		//driver3.findElement(By.linkText("Sign Up")).click();
		
		 

	}

}
