package SeleniumTrainingPart1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificate {

	public static void main(String[] args) {
		
		 //for handling ssl certificate to procced anyway
		DesiredCapabilities dc=DesiredCapabilities.chrome(); //is class to provide customize option for chrome
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);		//method to provide chrome
		ChromeOptions c=new ChromeOptions();// provide option of class DC 
		c.merge(dc); //will merge DC 
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c); //now chrome has option to handle ssl related things
		
		
		
		
	}

}
