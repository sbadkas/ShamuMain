package Testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestConfig {

	
	Properties p;
	FileInputStream f; 
	
	@Test
	public void testConfigFile() throws IOException{
		f = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");
		p = new Properties();
		p.load(f);
		
		System.out.println(p.getProperty("name"));
	}
}
