package SeleniumTrainingPart2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		  driver.get("http://google.com");
		  System.out.println(driver.getTitle());
		  //driver.navigate().to("http://yahoo.com");
		  //driver.navigate().back();
		  //System.out.println(driver.navigate().toString().indexOf("y"));
		  //System.out.println(driver.getCurrentUrl());
		//  System.out.println(driver.getPageSource());
		  //validation point
		  String title=driver.getTitle();
		     
		       if(title.equals("Google")) {
		    	   
		    	 System.out.println("correct tilte");  
		       }   
		    	 else {
		    		 
		    	System.out.println("wrong title");	 
		    	 }
		    	   
		       
		       driver.quit(); //to quit browser
	}

}
