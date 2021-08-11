package SeleniumTrainingPart2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardevents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		//driver.findElement(By.id("u_0_2_PZ")).click();
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		Actions action= new Actions(driver);
		driver.findElement(By.name("firstname")).sendKeys("rahul");
		action.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		.sendKeys("roy").sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		.sendKeys("8446276304").sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		.sendKeys("abc123").sendKeys(Keys.ENTER).build().perform();
		
		
		
	}

}
