package SeleniumTrainingPart2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver();

		//System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		//WebDriver driver1=new FirefoxDriver();

		// Facebook Create Account Page 

		driver.get("http://www.facebook.com");
		driver.findElement(By.linkText("English (UK)")).click();
		//("//input[contains(@name,'procee')]"))
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();

		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e){

		}

		driver.findElement(By.name("firstname")).sendKeys("sunny");
		driver.findElement(By.name("lastname")).sendKeys("leone");
		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("hello1234");

		// Birth date Drop down 

		Select s=new Select(driver.findElement(By.id("day")));
		s.selectByVisibleText("15");

		Select s1=new Select(driver.findElement(By.id("month")));

		s1.selectByVisibleText("Mar");

		Select s2=new Select(driver.findElement(By.id("year")));

		s2.selectByVisibleText("2000");

		//Gender radio button


		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//*[@name='websubmit']")).click();
	}

}
