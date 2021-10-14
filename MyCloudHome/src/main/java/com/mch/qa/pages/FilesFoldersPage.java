package com.mch.qa.pages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.mch.qa.base.TestBase;

public class FilesFoldersPage extends TestBase {
	
	
	//AutoFolderNameGenerator
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmmss");
	LocalDateTime now = LocalDateTime.now();
	public String FolderName = "KiranAutoFolder"+dtf.format(now);

	
	
	//RightClickMenuOptions
	@FindBy(xpath="//div[@class='ListViewGroupHeader']")
	WebElement Space_Click;
	
	@FindBy(xpath="//*[contains(text(),'New folder')]")
	WebElement New_Folder_From_DMenu;
	
	@FindBy(xpath="//label[contains(text(),'Add files')]")
	WebElement Add_Files_From_DMenu;
	
	@FindBy(xpath="//*[contains(text(),'Select all')]")
	WebElement SelectAll_From_DMenu;
	
	@FindBy(xpath="//input[@value='New folder']")
	WebElement New_Folder_Input;
	
	@FindBy(xpath="//div[@class='BaseModalSmall PromptModal']")
	WebElement Div_New_Folder_Input;
	
	@FindBy(xpath="//div[@class='Button Button--primary Button--medium']")
	WebElement Create_Folder_Button;
	
	
	//SearchElements
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement Search_Input_Field;
	
	@FindBy(xpath="//input[@placeholder='Search by name, location or object']")
	WebElement Search_Input_Field_Extened;
	
	
	

	
	//PageFactoryMeethod
	public FilesFoldersPage() {
           PageFactory.initElements(driver, this);
		}
			
	public void Right_click_for_Dmenu() {
		Actions actions = new Actions(driver);
		actions.contextClick(Space_Click).perform();
		
	}
	
	public void Newfolder_Creation_and_Validation_method() {
		Actions actions = new Actions(driver);
		actions.contextClick(Space_Click).perform();
		New_Folder_From_DMenu.click();
		Div_New_Folder_Input.click();
		New_Folder_Input.clear();
		New_Folder_Input.sendKeys(FolderName);
		Create_Folder_Button.click();
		WebElement Folder_Name = driver.findElement(By.xpath("//*[contains(text(),'"+FolderName+"')]"));
		String NameOfFolder = Folder_Name.getText();
		Assert.assertEquals(NameOfFolder, FolderName, "Unable to locate the folder");
			
	}
	
	public void FolderSearch_Method() throws InterruptedException {
		
		Search_Input_Field.click();
		Search_Input_Field.sendKeys(FolderName);
//		Search_Input_Field_Extened.sendKeys(Keys.ENTER);
		WebElement Folder_Name = driver.findElement(By.xpath("//*[contains(text(),'"+FolderName+"')]"));
		String NameOfFolder = Folder_Name.getText();
		Assert.assertEquals(NameOfFolder, FolderName, "Unable to locate the folder");
		
	}
		

}
