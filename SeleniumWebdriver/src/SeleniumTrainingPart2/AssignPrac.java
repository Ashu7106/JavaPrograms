package SeleniumTrainingPart2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignPrac {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String option2 = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		Select drop = new Select(driver.findElement(By.id("dropdown-class-example")));
		drop.selectByVisibleText(option2);
		driver.findElement(By.name("enter-name")).sendKeys(option2);
		driver.findElement(By.id("alertbtn")).click();
		String s = driver.switchTo().alert().getText();
		System.out.println(s);
		driver.switchTo().alert().accept();

	}

}
