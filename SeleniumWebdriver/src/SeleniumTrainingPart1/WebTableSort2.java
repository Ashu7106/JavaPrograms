package SeleniumTrainingPart1;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableSort2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		  List<WebElement> tableRows=  driver.findElements(By.xpath("//tr/td[1]"));
		  //print price o particular vegis from table by getting text and then price
		List<String> newtable=tableRows.stream().filter(s ->s.getText().contains("Beans")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
	
		newtable.forEach(s ->System.out.println(s));
	
		
		
		
	}
	public static String getPriceVeggie(WebElement s) {
		//will give get col in table 
		String price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}
	
}
