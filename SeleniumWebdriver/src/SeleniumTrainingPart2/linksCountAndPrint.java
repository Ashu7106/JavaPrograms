package SeleniumTrainingPart2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksCountAndPrint {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// 1. get the total count of links on the page
		// 2. get the text of each link on the page.

		driver.get("https:\\www.google.com");
		List<WebElement> linklist = driver.findElements(By.tagName("a"));// links are in a tag always

		System.out.println(linklist.size());

		for (WebElement linktext : linklist) {

			System.out.println(linktext.getText());

		}

		for (int i = 0; i < linklist.size(); i++) {

			String links = linklist.get(i).getText();

			System.out.println(links);

		}

	}

}
