package SeleniumTrainingPart1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.xpath("//*[@id='travel_date']")).click();
		while(!driver.findElement(By.className("datepicker-switch")).getText().contains("August 2021")) {
			

		driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class=next]")).click();
		
		}
		
		
		 List<WebElement> li= driver.findElements(By.cssSelector(".day"));
		 
		 
		      int count=  driver.findElements(By.cssSelector(".day")).size();
		      System.out.println(count);
		      
		      for(int i=0;i<count;i++) {
		    	  
		    	  
		 String clickday=driver.findElements(By.cssSelector(".day")).get(i).getText();
		    	 
		    	if(clickday.equalsIgnoreCase("24")) {
		    		 
		    		 
		    		driver.findElements(By.cssSelector(".day")).get(i).click();
		    		break;
		    		 
		    	 }
		    	  
		      }
		 
		
		
		
		
	}

}
