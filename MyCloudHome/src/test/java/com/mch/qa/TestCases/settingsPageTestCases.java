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
import com.mch.qa.pages.SettingsPage;

public class settingsPageTestCases extends TestBase {
	
	LoginPage loginPage;
	LandingPage landingPage;
	FilesFoldersPage filesPage;
	SettingsPage settingPage;
	
	public settingsPageTestCases() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	    landingPage = new LandingPage();
	    settingPage = new SettingsPage();
	}
	
	@Test(priority=1)	
	public void settingsPageIsDisplayed() throws InterruptedException {
		landingPage.ClickOnSignIn();
		filesPage = loginPage.Alernate_Login(prop.getProperty("username"), prop.getProperty("password"));
		filesPage.clickOnSettingsOption();
		String settingsPage = driver.getCurrentUrl();
		Assert.assertEquals(settingsPage, "https://home.mycloud.com/ettings/account", "URL didnt matched");
		
	}
	
	@Test(priority=2)	
	public void userFirstNameAndSecondNameChange() throws InterruptedException {
		landingPage.ClickOnSignIn();
		filesPage = loginPage.Alernate_Login(prop.getProperty("username"), prop.getProperty("password"));
		filesPage.clickOnSettingsOption();
		settingPage.changeOfFirstndLastName();
		
	}
	
	@Test(priority=3)	
	public void signOutFromAppAction() throws InterruptedException {
		landingPage.ClickOnSignIn();
		filesPage = loginPage.Alernate_Login(prop.getProperty("username"), prop.getProperty("password"));
		filesPage.clickOnSettingsOption();
		settingPage.signOutAction();
		String SignInText = driver.findElement(By.xpath("//*[contains(text(),'Sign in')]")).getText();
		Assert.assertEquals(SignInText, "Sign in", "Sign in text is not displayed");
		
	}
	
	@Test(priority=4)	
	public void myCloudDevicenameChanging() throws InterruptedException {
		landingPage.ClickOnSignIn();
		filesPage = loginPage.Alernate_Login(prop.getProperty("username"), prop.getProperty("password"));
		filesPage.clickOnSettingsOption();
		settingPage.myCloudDeviceNameChange();
		
	}
	
	@Test(priority=5)	
	public void analyticalsDisabledAndEnable() throws InterruptedException {
		landingPage.ClickOnSignIn();
		filesPage = loginPage.Alernate_Login(prop.getProperty("username"), prop.getProperty("password"));
		filesPage.clickOnSettingsOption();
		settingPage.analyticalPipEnableAndDisable();		
	}
	
	@Test(priority=6)	
	public void changeEmailTest() throws InterruptedException {
		landingPage.ClickOnSignIn();
		filesPage = loginPage.Alernate_Login(prop.getProperty("username"), prop.getProperty("password"));
		filesPage.clickOnSettingsOption();
		settingPage.changeEmailTest();
		String emailChanged = driver.findElement(By.xpath("//*[contains(text(),'Email changed')]")).getText();
		Assert.assertEquals(emailChanged, "Email changed", "Email changed message is not displayed");
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		String SignInText = driver.findElement(By.xpath("//*[contains(text(),'Sign in')]")).getText();
		Assert.assertEquals(SignInText, "ign in", "Sign in text is not displayed");
		
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	

}
