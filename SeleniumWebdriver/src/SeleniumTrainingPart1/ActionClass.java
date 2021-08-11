package SeleniumTrainingPart1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		Actions action =new Actions(driver);
		WebElement move=driver.findElement(By.cssSelector("#nav-link-accountList"));
		
		//move to specific element
		//action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		
		//composite actions
		
		//action.moveToElement(move).build().perform();
		
		
		//text in upper case action 
		
		// action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("facewash")
		 //.build().perform();
		 
		//select text double click action
		
		action.moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
		          .click().keyDown(Keys.SHIFT).sendKeys("facewash").doubleClick().build().perform();
		
		//right click action
		
		action.moveToElement(move)
		.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Create a Wish List')]"))).contextClick()
		.build().perform();
		
		
		
		
		
	}

}
