package SeleniumTrainingPart1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripAuto {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("(//div[@class='p-relative']/div/input)[1]")).sendKeys("mum");
		List<WebElement> list = driver
				.findElements(By.cssSelector(".ls-reset.br-4.w-100p.px-2.dropdown__item.c-neutral-900"));

		for (WebElement ele : list) {

			if (ele.getText().equalsIgnoreCase("Mumbai")) {

				ele.click();
				break;
			}

		}
		/*
		 * driver.get("https://www.cleartrip.com/");
		 * driver.findElement(By.xpath("(//div[@class='p-relative']/div/input)[2]")).
		 * sendKeys("ban"); List<WebElement> list2=driver.findElements(By.cssSelector(
		 * ".ls-reset.br-4.w-100p.px-2.dropdown__item.c-neutral-900"));
		 * 
		 * 
		 * 
		 * for(WebElement ele2:list2) {
		 * 
		 * if(ele2.getText().equalsIgnoreCase("Bangalore")) {
		 * 
		 * ele2.click(); break; }
		 * 
		 * }
		 */

	}

}
