package SeleniumTrainingPart2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class globalParameter {

	public static void main(String[] args) throws IOException {
		
		
		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream("E:\\java training\\SeleniumWebdriver\\src\\TestNg\\data.properties");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
		
		FileOutputStream fos=new FileOutputStream("E:\\java training\\SeleniumWebdriver\\src\\TestNg\\data.properties");
		
		prop.store(fos, null);
		
		prop.setProperty("browser", "firefox");
		
		System.out.println(prop.getProperty("browser"));

	}

}
