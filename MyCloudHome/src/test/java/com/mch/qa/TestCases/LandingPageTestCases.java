package com.mch.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mch.qa.base.TestBase;
import com.mch.qa.pages.LandingPage;

public class LandingPageTestCases extends TestBase{
	
	LandingPage landingPage;
	
	public LandingPageTestCases() {
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		landingPage = new LandingPage();
		
	}
	
	
	
	@Test(priority=1)
	public void TitleValidationTest() {
		String TitileOfPage = landingPage.ValidateLoginPageTitle();
		Assert.assertEquals(TitileOfPage, "My Cloud Home","Title Didn't match");
		
	}
	
	@Test(priority=3)
	public void logolinkDisplayed() {
		boolean Logo = landingPage.ValidateLogoDisplayed();
		Assert.assertTrue(Logo, "Logo is Displayed");
		
	}
	
	@Test(priority=2)
	public void AppLinkIsDisplayed() {
		boolean AppsLinkDisplay = landingPage.ValidateAppsLinkIsDisplayed();
		Assert.assertTrue(AppsLinkDisplay, "Apps Link");
		
	}
	
	@Test(priority=4)
	public void WhatsnewLinkIsDisplayed() {
		boolean AppsLinkDisplay = landingPage.ValidateWhatsNewLinkIsDisplayed();
		Assert.assertTrue(AppsLinkDisplay, "Whats new link not dsiplayed");
	}
	
	@Test(priority=5)
	public void CreateAccountLinkIsDisplayed() {
		boolean CreateLinkDisplay = landingPage.ValidateCreateAccounIsDisplayed();
		Assert.assertTrue(CreateLinkDisplay, "Create Account link not dsiplayed");
	}
	
	@Test(priority=6)
	public void SignInLinkIsDisplayed() {
		boolean SignInLinkDisplay = landingPage.ValidateSignInIsDisplayed();
		Assert.assertTrue(SignInLinkDisplay, "Sign In link not dsiplayed");
	}
	
	@Test(priority=6)
	public void InstaLinkIsDisplayed() {
		boolean InstaLinkDisplay = landingPage.ValidateInstaLinkIsDisplayed();
		Assert.assertTrue(InstaLinkDisplay, "Insta link not dsiplayed");
	}
	
	@Test(priority=6)
	public void FBLinkIsDisplayed() {
		boolean FBLinkDisplay = landingPage.ValidateFBLinkIsDisplayed();
		Assert.assertTrue(FBLinkDisplay, "FB link not dsiplayed");
	}
	
	@Test(priority=6)
	public void LearnMoreLinkIsDisplayed() {
		boolean LearnMoreLinkDisplay = landingPage.ValidateLearnMoreIsDisplayed();
		Assert.assertTrue(LearnMoreLinkDisplay, "FB link not dsiplayed");
	}
	
	@Test(priority=6)
	public void PrivacyLinkIsDisplayed() {
		boolean PrivacyLinkDisplay = landingPage.ValidatePrivacyStatementIsDisplayed();
		Assert.assertTrue(PrivacyLinkDisplay, "FB link not dsiplayed");
	}
	
	@Test(priority=6)
	public void TermsOfLinkIsDisplayed() {
		boolean TermsLinkDisplay = landingPage.ValidateTermsofUseIsDisplayed();
		Assert.assertTrue(TermsLinkDisplay, "FB link not dsiplayed");
	}
	
	@Test(priority=6)
	public void SupportLinkIsDisplayed() {
		boolean SuportLinkDisplay = landingPage.ValidateSupportIsDisplayed();
		Assert.assertTrue(SuportLinkDisplay, "FB link not dsiplayed");
	}
	
	
	
	//URL Validations
	@Test(priority=7)
	public void AppLinksLinkURLValidation() {
		 String AppUrl = landingPage.AppsLinkURrL();
		Assert.assertEquals(AppUrl, "https://staging-kamino.dev.wdckeystone.com/apps","URL didnt Match");
		
	}
	
	@Test(priority=8)
	public void WhatsNewLinkURLValidation() {
		 String WhatsNewUrl = landingPage.WhatsNewLinkUrl();
		Assert.assertEquals(WhatsNewUrl, "https://staging-kamino.dev.wdckeystone.com/whats-new","URL didnt Match");
		
	}
	
	@Test(priority=9)
	public void HelpLinkURLValidation() {
		 String HelpUrl = landingPage.HelpLinkUrl();
		Assert.assertEquals(HelpUrl, "https://help.mycloud.com/#/mch","URL didnt Match");
		
	}
	
//	@Test(priority=4)
//	public void EnglishLinkURLValidation() {
//		 String EnglishUrl = landingPage.
//		Assert.assertEquals(EnglishUrl, "https://staging-kamino.dev.wdckeystone.com/apps","URL didnt Match");
//		
//	}
	
	@Test(priority=10)
	public void LearnMoreLinksURLValidation() {
		 String LearnMoreUrl = landingPage.LearnMoreLinkUrl();
		Assert.assertEquals(LearnMoreUrl, "https://www.mycloud.com/#/","URL didnt Match");
		
	}
	
	@Test(priority=11)
	public void PrivacyLinksURLValidation() {
		 String PrivacyUrl = landingPage.PrivacyLinkUrl();
		Assert.assertEquals(PrivacyUrl, "https://www.westerndigital.com/legal/privacy-statement#product_policy","URL didnt Match");
		
	}
	
	@Test(priority=12)
	public void TermLinksURLValidation() {
		 String TermUrl = landingPage.TermLinkUrl();
		Assert.assertEquals(TermUrl, "https://www.westerndigital.com/legal/terms-of-use","URL didnt Match");
		
	}
	
	@Test(priority=13)
	public void SupportLinksURLValidation() {
		 String SupportUrl = landingPage.SuportUrl();
		Assert.assertEquals(SupportUrl, "https://support-en.wd.com/","URL didnt Match");
		
	}
	
	@Test(priority=14)
	public void FBLinksURLValidation() {
		 String FBUrl = landingPage.FBLinkUrl();
		Assert.assertEquals(FBUrl, "https://www.facebook.com/WD","URL didnt Match");
		
	}
	
	@Test(priority=15)
	public void InstaLinksURLValidation() {
		 String InstaUrl = landingPage.InstaLinkUrl();
		Assert.assertEquals(InstaUrl, "https://www.instagram.com/wdcreators/","URL didnt Match");
		
	}
	
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	

}
