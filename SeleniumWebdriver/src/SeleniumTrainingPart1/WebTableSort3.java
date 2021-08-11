package SeleniumTrainingPart1;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSort3 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.xpath("//tr/th[1]")).click();//click to sort rows 
		//List<WebElement> tableRows=driver.findElements(By.xpath("//tr/td[1]"));//find rows elements
		//sort text from webpage table rows
		//List <String> orginalRows =tableRows.stream().map(s -> s.getText()).collect(Collectors.toList());
	  //  orginalRows.stream().forEach(s -> System.out.println(s));
		///sort new list of rows
		//List<String> newSortedRows=orginalRows.stream().sorted().collect(Collectors.toList());
		
		//Assert.assertTrue(orginalRows.equals(newSortedRows));
			
		
		
		List<String> newrows;
	do {	//here will loop till desired elemnt not found that is rice 
		
	
		List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
		newrows=rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
		newrows.forEach(s->System.out.println(s));
		
		if(newrows.size()<1) {//if size 1 that means our element found at page 
			
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			
		}
	}while(newrows.size()<1);// if this conditon is true means  size of row is 1 the while will stop

	}

	private static String getPriceVeggie(WebElement s) {
		String price=s.findElement(By.xpath("following-sibling::td[2]")).getText();
		
		return price;
	}

}
