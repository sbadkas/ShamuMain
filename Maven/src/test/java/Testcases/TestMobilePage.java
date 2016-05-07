package Testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Login;
import Pages.HomePage;

public class TestMobilePage {

	WebDriver driver;
		
	@Test
	public void mobileTest() throws IOException{
		driver = Login.openBrowser();
		HomePage page = new HomePage(driver);
		page.goToMobilePage();
		
		
	}
}
