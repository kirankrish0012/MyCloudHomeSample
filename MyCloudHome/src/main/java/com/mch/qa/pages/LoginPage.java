package com.mch.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mch.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(id="username")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(xpath="//a[contains(text(),'Forgot password?')]")
	WebElement Forgot_password;
	
	@FindBy(xpath="//parent::div[@class='c6d7d2ace']//button[@class='cd1df0865 c0b512bff c6cad41d5 c132a5a03 c571d5ab7']")
	WebElement Continue_login;
	
	@FindBy(xpath="//a[contains(text(),'Sign up')]")
	WebElement Sign_Up_login;
	
	@FindBy(xpath="//a[contains(text(),'Privacy Statement')]")
	WebElement Privacy_Statement_login;
	
	@FindBy(xpath="//a[contains(text(),'Terms & Conditions')]")
	WebElement Terms_Conditions_login;
	
	@FindBy(xpath="//a[contains(text(),'Contact')]")
	WebElement Contact_us_login;


//PageFactoryMeethod
	public LoginPage() {

		PageFactory.initElements(driver, this);

	}
	
//TextValidationMethods
	public boolean contentValidation() {
		return driver.getPageSource().contains("Welcome ");
		
	}
//LinkValidationMethods
//visiableTextValidation
	
//LoginValidation
	public FilesFoldersPage Login(String Usrname, String Pswd) throws InterruptedException {
		Username.sendKeys(Usrname);
		Password.sendKeys(Pswd);
		Continue_login.click();
		Thread.sleep(5000);
		return new FilesFoldersPage(); 
		
	}
	
	

//CaptureLoginPage

}

