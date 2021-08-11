package SeleniumTrainingPart1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();


		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement sel=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown= new Select(sel);
  
		//there are three ways to select element from dropdown menu
		//1.
	  	dropdown.selectByIndex(1);
	  		String s=dropdown.getFirstSelectedOption().getText();
		if(s.equals("INR")) {
			
			System.out.println("test is pass");
		}
	  		
		else {
			
			System.out.println("test is fail");
		}
		/*//2.
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//3.
		dropdown.selectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());*/
		
		





	}

}
