package SeleniumTrainingPart2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.reddit.com/");
		driver1.findElement(By.linkText("Sign Up")).click();
		driver1.findElement(By.xpath("//*[@id='regEmail']")).sendKeys("ashishyadgire@gmail.com");
		driver1.findElement(By.linkText("Continue")).click();
		driver1.quit(); 
		
		
	}

}
