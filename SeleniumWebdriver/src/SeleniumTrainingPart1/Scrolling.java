package SeleniumTrainingPart1;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// to handle scrolling in java script related in browser there is class
		// javaScript executor

		// we have cast driver with these to know driver about these class object
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// this method will execute java script scroll in browser window we used window.
		js.executeScript("window.scrollBy(0,600)");

		pause(3000);

		// to scroll inside browser window table we used document.querryselector(is like
		// css selector)
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=500");

		List<WebElement> table = driver.findElements(By.cssSelector(".tableFixHead  td:nth-child(4)"));
		int sum = 0;
		for (int i = 0; i < table.size(); i++) {

			sum = sum + Integer
					.parseInt(driver.findElements(By.cssSelector(".tableFixHead  td:nth-child(4)")).get(i).getText());

		}
		System.out.println(sum);

		int Total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());

		Assert.assertEquals(sum, Total);

	}

	// This is static method is for pause during script execution
	public static void pause(Integer milliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
