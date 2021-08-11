package SeleniumTrainingPart2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver Driver3=new ChromeDriver();
		Driver3.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		Driver3.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Java");
		Driver3.switchTo().alert().dismiss();
		Driver3.findElement(By.cssSelector("//*[@id='get-input']/button")).click();
				

	}

}
