package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	@Test
	@Parameters("Browser")
	public void testCrossBrowser(String bName){
		
		WebDriver driver;
		
		if(bName.equalsIgnoreCase("firefox")){
			System.out.println("It is Firefox");
		}
		if(bName.equalsIgnoreCase("chrome")){
			System.out.println("It is chrome");
	}

}}
