package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	By linkMobile = By.xpath("//*[contains(text(),'Mobiles')]");
	
	public HomePage(WebDriver d){
		this.driver = d;
	}
	
	public void goToMobilePage(){
		
	driver.findElement(linkMobile).click();
		
	}
}
