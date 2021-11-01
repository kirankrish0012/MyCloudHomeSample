package com.mch.qa.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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
//		filesPage = loginPage.Alernate_Login(prop.getProperty("username"), prop.getProperty("password"));
//		String FFurlink= driver.getCurrentUrl();
//		Assert.assertEquals(FFurlink, "https://home.mycloud.com/cloud/file","URL didnt Match");
//		filesPage.Newfolder_Creation_and_Validation_Test();
//	}
////	
//	@Test(priority=2)	
//	public void New_Folder_Creation_Verification_with_SearchOption() throws InterruptedException {
//		landingPage.ClickOnSignIn();
//		filesPage = loginPage.Alernate_Login(prop.getProperty("username"), prop.getProperty("password"));
//		filesPage.FolderSearch_Test();
//			
//	}
////	
//	@Test(priority=3)	
//	public void Move_Folder_Test() throws InterruptedException {
//		landingPage.ClickOnSignIn();
//		filesPage = loginPage.Alernate_Login(prop.getProperty("username"), prop.getProperty("password"));
//		Thread.sleep(2000);
//		filesPage.Move_Folder_Test();
//		WebElement Count = driver.findElement(By.xpath("//*[contains(text(),'50 selected')]"));
//		Count.getText();
//		Assert.assertEquals("50 selected", "50 selected", "Count didnt match");
//	}
////	
//	@Test(priority=4)	
//	public void Rename_Folder_Test() throws InterruptedException {
//		landingPage.ClickOnSignIn();
//		filesPage = loginPage.Alernate_Login(prop.getProperty("username"), prop.getProperty("password"));
//		Thread.sleep(2000);
//		filesPage.Rename_Folder_Test();
//		
//	}
	
	@Test(priority=5)	
	public void Create_Folder_and_Su_Folders_KAM_35904_Test() throws InterruptedException {
		landingPage.ClickOnSignIn();
		filesPage = loginPage.Alernate_Login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(2000);
		filesPage.Create_Folder_and_Su_Folders_KAM_35904();
		
		
		

//		
	}
	
	
	
	
//	@AfterMethod
//	public void TearDown() {
//		driver.quit();
//	}
}
