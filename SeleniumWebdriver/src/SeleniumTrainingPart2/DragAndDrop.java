package SeleniumTrainingPart2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		WebElement sourceElement= driver.findElement(By.id("draggable"));
		WebElement destiElement=driver.findElement(By.id("droppable"));
		Actions action= new Actions(driver);
		action.clickAndHold(sourceElement).moveToElement(destiElement).release().build().perform();
		

	}
}