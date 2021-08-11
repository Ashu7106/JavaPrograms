package SeleniumTrainingPart2;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssign {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.id("product"));// for scope to table only
		List<WebElement> rows = table.findElements(By.tagName("tr"));// from table to scope rows
		System.out.println(rows.size());// for no. of rows in table

		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());//for no. of columns in table
		List<WebElement> col = table.findElements(By.tagName("tr")).get(3).findElements(By.tagName("td")); //Scope to 2nd row column
	    for(WebElement c:col) {
	    	
	    	      System.out.println(Arrays.asList(c.getText()));
	    	
	    }
		
		/*System.out.println(col.get(0).getText());//for each column text display
		System.out.println(col.get(1).getText());
		System.out.println(col.get(2).getText());*/

	}
}