package SeleniumTrainingPart1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		SoftAssert s= new SoftAssert();
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		for(WebElement li:links) {
			
			
		String url=li.getAttribute("href");
		
		HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
			
		    conn.setRequestMethod("HEAD");
			conn.connect();
			int httpcode=conn.getResponseCode();
			s.assertTrue(httpcode<400,"the link with name" +li.getText()+" is a broken link with code" +httpcode);
			
		}
		s.assertAll();
	 
			 
		 
		
	}

	
	
	/* List<WebElement> links =driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	 SoftAssert s=new SoftAssert();
	 
	 for(WebElement li:links) {
		 
		String url=li.getAttribute("href");
		
		HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("head");
		conn.connect();
		int httpCode=conn.getResponseCode();
		s.assertTrue(httpCode<400,"the link "+li.getText()+"is a broken link with http error code"+httpCode);
	 }*/
}
