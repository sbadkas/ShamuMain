package Common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Login {
	static WebDriver driver = new FirefoxDriver();
		
	
	public static WebDriver openBrowser() throws IOException{
		
		Properties p = new Properties();
		FileInputStream path = new FileInputStream(System.getProperty("user.dir")+ "/src/main/resources/config.properties");
		p.load(path);
		//System.out.println(p.getProperty("name"));
		
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		
		return driver;
		
		
	}
	
	
		public static void quit(){
			driver.close();
			driver.quit();
			
		}
}
