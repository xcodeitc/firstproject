package com.citis.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
	// this is a test
	public static  WebDriver driver;
	public  static Properties prop;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("\\D:\\tecfoisbatch001-master\\src\\main\\java\\com\\citis\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


      public static void initialization1() {
    	  String browsername = prop.getProperty("browser");
    	  
    	  
    	
    		  System.setProperty("webdriver.chrome.driver","\\D:\\tecfoisbatch001-master\\Driver\\chromedriver.exe");
    		driver = new ChromeDriver();
    	 
	

    	  driver.manage().window().maximize();
    	  driver.manage().deleteAllCookies();
    	  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	  
    	  
    	  driver.get(prop.getProperty("url"));
}
}



