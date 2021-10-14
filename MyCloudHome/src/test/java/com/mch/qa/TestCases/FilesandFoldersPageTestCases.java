package com.mch.qa.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mch.qa.base.TestBase;
import com.mch.qa.pages.FilesFoldersPage;
import com.mch.qa.pages.LandingPage;
import com.mch.qa.pages.LoginPage;

public class FilesandFoldersPageTestCases extends TestBase{
	LoginPage loginPage;
	LandingPage landingPage;
	FilesFoldersPage filesPage;
	
	public FilesandFoldersPageTestCases() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	    landingPage = new LandingPage();
	}
	
//	@Test(priority=1)	
//	public void New_Folder_Creation_and_Validation() throws InterruptedException {
//		landingPage.ClickOnSignIn();
//		filesPage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
//		String FFurlink= driver.getCurrentUrl();
//		Assert.assertEquals(FFurlink, "https://staging-kamino.dev.wdckeystone.com/cloud/file","URL didnt Match");
//		filesPage.Newfolder_Creation_and_Validation_method();
//	}
	
	@Test(priority=1)	
	public void New_Folder_Creation_Verification_with_SearchOption() throws InterruptedException {
		landingPage.ClickOnSignIn();
		filesPage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		filesPage.FolderSearch_Method();
	}
	
	
	
//	@AfterMethod
//	public void TearDown() {
//		driver.quit();
//	}
}
