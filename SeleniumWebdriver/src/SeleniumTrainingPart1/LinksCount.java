package SeleniumTrainingPart1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// for all <a> tag links present on page
		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footer = driver.findElement(By.id("gf-BIG")); // limiting scope of webdriver
		System.out.println(footer.findElements(By.tagName("a")).size());

		WebElement getlink = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
		int li = getlink.findElements(By.tagName("a")).size();
		System.out.println(li);

		for (int i = 1; i < getlink.findElements(By.tagName("a")).size(); i++) {
			String clickCntrL = Keys.chord(Keys.CONTROL, Keys.ENTER);
			getlink.findElements(By.tagName("a")).get(i).sendKeys(clickCntrL);
		}

		Set<String> setOfLinks = driver.getWindowHandles();

		Iterator<String> it = setOfLinks.iterator();

		while (it.hasNext()) {

			String title = driver.switchTo().window(it.next()).getTitle();
			System.out.println(title);
		}

	}

}
