package com.mch.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mch.qa.base.TestBase;

public class SignupPage extends TestBase {
	
	
	@FindBy(xpath="//input[@id='email']")
	WebElement Email_signup;

	@FindBy(xpath="//input[@id='password']")
	WebElement Password_signup;
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	WebElement Continue_signup;
	
	@FindBy(xpath="//a[contains(text(),'Privacy Statement')]")
	WebElement Privacy_Statement_Signup;
	
	@FindBy(xpath="//a[contains(text(),'Terms & Conditions')]")
	WebElement Terms_Conditions_Signup;
	
	@FindBy(xpath="//a[contains(text(),'Contact')]")
	WebElement Contact;
	
	@FindBy(xpath="//a[contains(text(),'Log in')]")
	WebElement Signup_Login;
	
}
