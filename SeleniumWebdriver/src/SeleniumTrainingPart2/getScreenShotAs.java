package SeleniumTrainingPart2;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class getScreenShotAs {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		

		// File TakeSS=SS.getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(TakeSS, new File("D:\\pc data\\"+filename+".png"));

		driver.get("http:\\www.google.com");
		takeScreenShot(driver,"google");
	}

	    public static void takeScreenShot( WebDriver driver,String filename) throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D:\\pc data\\" + filename + ".png"));

	}

}
