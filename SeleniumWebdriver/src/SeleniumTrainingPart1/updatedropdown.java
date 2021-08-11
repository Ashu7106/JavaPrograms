package SeleniumTrainingPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class updatedropdown {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("divpaxinfo")).click();


		WebElement adult= driver.findElement(By.id("hrefIncAdt"));

		//for loop for click on element multiple time
		for(int i=0;i<2;i++) {

			clickon(driver, adult, 3);
		}
		// while loop for click on element multiple time
		WebElement child=driver.findElement(By.id("hrefIncChd"));
		
		int i=1;
		while(i<2) {

			clickon(driver, child, 2);	
			i++;
		
		}


		WebElement done=driver.findElement(By.id("btnclosepaxoption"));
	
	
		clickon(driver, done, 5);
		
	}

	public static void clickon(WebDriver driver,WebElement Element,int Timeouts) {

		new WebDriverWait(driver,3).
		until(ExpectedConditions.elementToBeClickable(Element));
		Element.click();
	}

}
