package SeleniumTrainingPart1;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentwaitt {

	public static void main(String[] args) {

		/*
		 * An implementation of the Wait interface that may have its timeout and polling
		 * interval configured on the fly. Each FluentWait instance defines the maximum
		 * amount of time to wait for a condition, as well as the frequency with which
		 * to check the condition. Furthermore, the user may configure the wait to
		 * ignore specific types of exceptions whilst waiting, such as
		 * NoSuchElementExceptions when searching for an element on the page.
		 * 
		 * Sample usage:
		 * 
		 * // Waiting 30 seconds for an element to be present on the page, checking //
		 * for its presence once every 5 seconds.
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("foo"));
			}
		});

	}

}
