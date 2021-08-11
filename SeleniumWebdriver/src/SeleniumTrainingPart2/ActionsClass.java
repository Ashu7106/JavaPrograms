package SeleniumTrainingPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();// delete all cookies before launching browser
		//Actions class is use for move to mouse hover to webelment on page
		driver.get("http://google.com");
		Actions action =new Actions(driver);

		action.moveToElement(driver.findElement(By.id("abc"))).build().perform();//build and perform will move hover webelment





	}

}
