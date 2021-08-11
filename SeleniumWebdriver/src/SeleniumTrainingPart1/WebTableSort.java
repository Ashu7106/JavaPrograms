package SeleniumTrainingPart1;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSort {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr/th[1]")).click();//click to sort rows 
		
		List<WebElement> tableRows=driver.findElements(By.xpath("//tr/td[1]"));//find rows elements
		//sort text from webpage table rows
		List <String> orginalRows =tableRows.stream().map(s -> s.getText()).collect(Collectors.toList());
	    orginalRows.stream().forEach(s -> System.out.println(s));
		///sort new list of rows
		List<String> newSortedRows=orginalRows.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(orginalRows.equals(newSortedRows));
		
		
		
		
		
	}

}
