package com.mch.qa.pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.mch.qa.base.TestBase;

public class SettingsPage extends TestBase{
	
	Random rand = new Random();
	int maxNumber = 1000;
	int randomNumber = rand.nextInt(maxNumber) + 1;
	public String FirstName = "KiranDevice"+randomNumber;
	public String LastName = "Kumar"+randomNumber;
	
	@FindBy(id="first-name")
	WebElement firstName_input;
	
	@FindBy(id="last-name")
	WebElement lastName_input;
	
	@FindBy(xpath="//*[contains(text(),'Email')]")
	WebElement Email;
	
	@FindBy(xpath="//*[contains(text(),'Sign out')]")
	WebElement signOutButton;
	
	@FindBy(xpath="//*[@class='Button Button--primary Button--medium' and contains(text(),'Sign out')]")
	WebElement signOututtoninDialougeBox;
	
	@FindBy(xpath="//li[@class='with-forward-arrow is-active']//span[@class='pull-left']")
	WebElement myCloudNameSidebarOption;
	
	@FindBy(id="device-name")
	WebElement MyCloudDeviceName;
	
	@FindBy(xpath="//*[contains(text(),'Storage Type')]")
	WebElement StorageType;
	
	@FindBy(xpath="//*[contains(text(),'Analytics')]")
	WebElement analyticsOption;
	
	@FindBy(xpath="//*[contains(text(),'Agree to share')]")
	WebElement analyticalsEnaleDisable;
	
	@FindBy(xpath="//*[contains(text(),'Turn off')]")
	WebElement turnOffPopUpforAnalayticals;
	
	@FindBy(xpath="//div[@class='icon icon-back']//div[@class='icon__inner']")
	WebElement analyticalsBackButton;
	
	@FindBy(xpath="//div[@class='icon icon-circle Checkbox__icon']")
	WebElement analyticalsCircleIcon;
	
	@FindBy(xpath="//*[contains(text(),'Change email')]")
	WebElement changeEmail;
	
	@FindBy(xpath="//*[@id=\"emailNew\"]")
	WebElement newEmail;
	
	@FindBy(xpath="//*[@id=\"emailConfirmation\"]")
	WebElement confirmEmail;
	
	@FindBy(xpath="	//*[@class='ButtonLoading ButtonLoading--notLoading ButtonLoading--primary Button Button--primary' and contains(text(),'Change email')]\n"
			+ "")
	WebElement changeEmailButton;
	
	@FindBy(xpath="//*[contains(text(),'Sign in')]")
	WebElement emailChangeSignIn;
	
	
	
	
	
	
	
	public SettingsPage() {

		PageFactory.initElements(driver, this);

	}
	
	public void changeOfFirstndLastName() {
		firstName_input.click();
		firstName_input.clear();
		firstName_input.sendKeys(FirstName);
		Email.click();
		lastName_input.click();
		lastName_input.clear();
		lastName_input.sendKeys(LastName);
		Email.click();
	}
	
	public void signOutAction() {
		signOutButton.click();
		signOututtoninDialougeBox.click();
	}
	
	public void myCloudDeviceNameChange() {
		driver.get("https://home.mycloud.com/settings/current_device");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Storage Type')]")));
		MyCloudDeviceName.click();
		MyCloudDeviceName.clear();
		MyCloudDeviceName.sendKeys("KiransMyCloudHome"+randomNumber);
		StorageType.click();
	}
	
	public void analyticalPipEnableAndDisable() {
		driver.get("https://home.mycloud.com/settings/current_device");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Storage Type')]")));
		
		String On = driver.findElement(By.xpath("//a[@class='SettingsListItem SettingsListItem--clickable']//span[@class='SettingsListItem__value SettingsListItem__label']")).getText();
		String off = driver.findElement(By.xpath("//a[@class='SettingsListItem SettingsListItem--clickable']//span[@class='SettingsListItem__value SettingsListItem__label']")).getText();
		
		if(On.equals("On")) {
			analyticsOption.click();
			analyticalsEnaleDisable.click();
			turnOffPopUpforAnalayticals.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='icon icon-circle Checkbox__icon']")));
			analyticalsBackButton.click();
		}else {
			analyticsOption.click();
			analyticalsCircleIcon.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='icon icon-check Checkbox__icon']")));
			analyticalsBackButton.click();
			
		}

	}
	
	public void changeEmailTest() {
		changeEmail.click();
		newEmail.sendKeys("Sandiskqawdc+auto151@gmail.com");
		confirmEmail.sendKeys("Sandiskqawdc+auto151@gmail.com");
		changeEmailButton.click();
		
	}
	

}
