package SeleniumTrainingPart1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);

		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");

		driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#results")));
		String getText = driver.findElement(By.cssSelector("div#results")).getText();
		System.out.println(getText);
		

	}

}
