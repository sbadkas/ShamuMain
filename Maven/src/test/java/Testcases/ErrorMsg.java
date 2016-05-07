package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMsg {
	@Test
	public void TestError(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='next']")).click();
		
		By ErrorMessage = By.xpath("//*[@id='errormsg_0_Email']");
		String expected = "Please enter your email.";
		WebDriverWait wait = new WebDriverWait(driver,10);
		if(wait.until(ExpectedConditions.visibilityOfElementLocated(ErrorMessage)) != null)
		{
			String actual = driver.findElement(ErrorMessage).getText();
			Assert.assertEquals(actual, expected, "Test Has failed");
		}
		
		
				
	}
	
	

}
