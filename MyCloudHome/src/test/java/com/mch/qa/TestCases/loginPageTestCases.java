package com.mch.qa.TestCases;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mch.qa.base.TestBase;
import com.mch.qa.pages.FilesFoldersPage;
import com.mch.qa.pages.LandingPage;
import com.mch.qa.pages.LoginPage;

public class loginPageTestCases extends TestBase{
	
	LoginPage loginPage;
	LandingPage landingPage;
	FilesFoldersPage filesPage;
	
	public loginPageTestCases() {
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		loginPage = new LoginPage();
	    landingPage = new LandingPage();
	}
	
	@Test(priority=1)	
	public void LoginTest() throws InterruptedException {
		landingPage.ClickOnSignIn();
		filesPage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		
		

	}
	
//	@AfterMethod
//	public void TearDown() {
//		driver.quit();
//	}

}
