package com.mch.qa.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
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
		
		String welcome = driver.findElement(By.xpath("//*[contains(text(),'Welcome')]")).getText();
		String Welcome ="Welcome";
		String PageUrl = driver.getCurrentUrl();
		String ActualUrl = "https://staging-kamino.dev.wdckeystone.com/sessions/new";

		landingPage.clickOnAcceptCookies();
		landingPage.ClickOnSignIn();
		Thread.sleep(3000);
		loginPage.Alernate_Login(prop.getProperty("username"), prop.getProperty("password"));
		
		 		
//		if (welcome.equals(Welcome)) {
//			
//			
//			filesPage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
//		
//		}else if(PageUrl.equals(ActualUrl)){
//			
//			filesPage = loginPage.Alernate_Login(prop.getProperty("username"), prop.getProperty("password"));
//			
//		}else {
//			
//			//Assert.assertEquals(true, false, "The login page is not neither Auth0 or Normal");
//		}
//			

	}
	
//	@AfterMethod
//	public void TearDown() {
//		driver.quit();
//	}

}
