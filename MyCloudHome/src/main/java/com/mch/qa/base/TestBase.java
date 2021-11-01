package com.mch.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	
	

	// constructor
	public  TestBase() {

		// We need to create an object to read the data from config file
		prop = new Properties();
		FileInputStream fip;
		
		try {
			fip = new FileInputStream("/Users/kirann/git/MyCloudHomeSample/MyCloudHome/src/main/java/com/mch/qa/config/config.properties");
			prop.load(fip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
	}
	}
	

	// intialising all the webdriver,cookies,
	public static void initialization() {

		String BrowserName = prop.getProperty("browser");

		if (BrowserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "/Users/kirann/Downloads/MYCLOUDHIOME/chromedriver");
			driver = new ChromeDriver();
			wait = new WebDriverWait(driver,30);

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}

}
