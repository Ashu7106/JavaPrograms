package SeleniumTrainingPart1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Applied implicit wait i.e global wait
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");	
		String[] listOfItems = { "Brocolli", "Cauliflower", "Cucumber" };
		
		addItems(driver, listOfItems);

	}

	public static void addItems(WebDriver driver,String[] listOfItems) {
		
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));// product names add to cart

		for (int i = 0; i < product.size(); i++) {

			String[] item = product.get(i).getText().split("-"); // this will return text on webElement but we want only
			// particular text
			String format = item[0];
			String formattext = format.trim(); // trim name of product

			List<String> converted = Arrays.asList(listOfItems);// array to list for multiple product added to cart
			     
			if (converted.contains(formattext)) {
				int j = 0;
				j++; // loop only 3 times for desired product to be clicked

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click(); // found product
				// text from
				// that
				if (j == listOfItems.length) { // halt loop after desired product to be added to cart      // add to cart button
					// clicked

					break;
				}
			}

		}
	}
}
