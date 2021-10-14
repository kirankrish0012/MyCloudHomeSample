package com.mch.qa.pages;

import java.util.ArrayList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mch.qa.base.TestBase;

public class LandingPage extends TestBase {

	// page factory OR Object Repository

	@FindBy(xpath = "//a[contains(text(),'Help')]")
	WebElement Help_link;

	@FindBy(xpath = "//*[contains(text(),'English')]")
	WebElement English_Link;

	@FindBy(xpath = "//*[contains(text(),'Create account')]")
	WebElement Create_Account;

	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	WebElement Sign_in;

	@FindBy(xpath = "//*[contains(text(),'Apps')]")
	WebElement Apps_Link;

	@FindBy(xpath = "//*[contains(text(),'What’s new')]")
	WebElement Whats_New_Link;

	@FindBy(xpath = "//parent::div[@class='icon__inner']//parent::div[@class='icon icon-logo-mch-long ButtonIcon__icon  ']//*[local-name()='svg' ]")
	WebElement MyCloudHome_icon;

	@FindBy(xpath = "//a[@class='Footer__learn-more Button Button--secondary Button--medium']")
	WebElement Learn_more_About_MCH;

	@FindBy(xpath = "//div[@class='icon__inner']//parent::div[@class='icon icon-soc-facebook ButtonIcon__icon  ']")
	WebElement Fb_Icon;

	@FindBy(xpath = "//div[@class='icon__inner']//parent::div[@class='icon icon-soc-instagram ButtonIcon__icon  ']")
	WebElement Insta_Icon;

	@FindBy(xpath = "//*[contains(text(),'Privacy Statement')]")
	WebElement Privacy_Statement;

	@FindBy(xpath = "//*[contains(text(),'Terms of Use')]")
	WebElement Terms_Of_use;

	@FindBy(xpath = "//*[contains(text(),'Support')]")
	WebElement Support;

	// PageFactoryMeethod
	public LandingPage() {

		PageFactory.initElements(driver, this);

	}

	// Actionsmethods
	//loginpage title validation
	public String ValidateLoginPageTitle() {
		return driver.getTitle();

	}
	
    //HelpLinkValidation
	public boolean ValidateHelpLinkIsDisplayed() {
		return Help_link.isDisplayed();
	}

	//AppslinkValidation
	public boolean ValidateAppsLinkIsDisplayed() {
		return Apps_Link.isDisplayed();
	}
	
	
	//RedirectLinkValidation
	public String AppsLinkURrL() {
		 Apps_Link.click();
		 String Url= driver.getCurrentUrl();
		 return Url;
		 
	}
	
	public String WhatsNewLinkUrl() {
		Whats_New_Link.click();
		 String whatsNewUrl= driver.getCurrentUrl();
		 return whatsNewUrl;
		 
	}
	
	public String HelpLinkUrl() {
		Help_link.click();
		 ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
	     driver.switchTo().window(wid.get(1));
		 String HelpLink= driver.getCurrentUrl();
		 return HelpLink;
		 
	}
	
//	public String EnglishLinkUrl() {
//		English_Link.click();
//		 String EngLink= driver.getCurrentUrl();
//		 return EngLink;
//		 
//	}
	
	public String LearnMoreLinkUrl() {
		Learn_more_About_MCH.click();
		 ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
	     driver.switchTo().window(wid.get(1));
		 String LearnLink= driver.getCurrentUrl();
		 return LearnLink;
		 
	}
	
	public String PrivacyLinkUrl() {
		Privacy_Statement.click();
		ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
	     driver.switchTo().window(wid.get(1));
		 String PrivacyLink= driver.getCurrentUrl();
		 return PrivacyLink;
		 
	}
	
	
	public String TermLinkUrl() {
		Terms_Of_use.click();
		ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
	     driver.switchTo().window(wid.get(1));
		 String Termlink= driver.getCurrentUrl();
		 return Termlink;
		 
	}
	
	public String SuportUrl() {
		Support.click();
		ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
	     driver.switchTo().window(wid.get(1));
		 String SupportLink= driver.getCurrentUrl();
		 return SupportLink;
		 
	}
	
	public String FBLinkUrl() {
		Fb_Icon.click();
		ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
	     driver.switchTo().window(wid.get(1));
		 String FBLink= driver.getCurrentUrl();
		 return FBLink;
		 
	}
	
	public String InstaLinkUrl() {
		Insta_Icon.click();
		ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
	     driver.switchTo().window(wid.get(1));
		 String Instalink= driver.getCurrentUrl();
		 return Instalink;
		 
	}
	
	
	
    //Whatsnewlinkvalidation
	public boolean ValidateWhatsNewLinkIsDisplayed() {
		return Whats_New_Link.isDisplayed();
	}

	//EnglishLinkValidation
	public boolean ValidateEnglishLinkIsDisplayed() {
		return English_Link.isDisplayed();
	}

	
	public boolean ValidateCreateAccounIsDisplayed() {
		return Create_Account.isDisplayed();
	}
	
	public boolean ValidateSignInIsDisplayed() {
		return Sign_in.isDisplayed();
	}
	
	public void ClickOnSignIn() {
		Sign_in.click();
	}
	
	public boolean ValidateInstaLinkIsDisplayed() {
		return Insta_Icon.isDisplayed();
	}
	
	public boolean ValidateFBLinkIsDisplayed() {
		return Fb_Icon.isDisplayed();
	}
	
	public boolean ValidateLearnMoreIsDisplayed() {
		return Learn_more_About_MCH.isDisplayed();
	}

	public boolean ValidatePrivacyStatementIsDisplayed() {
		return Privacy_Statement.isDisplayed();
	}
	
	public boolean ValidateTermsofUseIsDisplayed() {
		return Terms_Of_use.isDisplayed();
	}

	public boolean ValidateSupportIsDisplayed() {
		return Support.isDisplayed();
	}
	
	public boolean ValidateLogoDisplayed() {
		return MyCloudHome_icon.isDisplayed();
	}


}