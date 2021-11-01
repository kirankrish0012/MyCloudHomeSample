package com.mch.qa.pages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.mch.qa.base.TestBase;

public class FilesFoldersPage extends TestBase {
	
	
	//AutoFolderNameGenerator
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmm");
	LocalDateTime now = LocalDateTime.now();
	Random rand = new Random();
	int maxNumber = 1000;
	int randomNumber = rand.nextInt(maxNumber) + 1;
	public String FolderName = "KiranAutoFolder"+randomNumber;

	
	
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
	
	@FindBy(xpath="//form[@class='ModalInput__input-form']//input[@class='ModalInput__input  ModalInput__input--valid']")
	WebElement Search_Input_Field_Extened;
	
	@FindBy(xpath="	//div[@class='icon icon-search ButtonIcon__icon  ']//div[@class='icon__inner']//*[local-name()='svg']\n"
			+ "")
	WebElement Search_Icon;
	
	@FindBy(xpath="//*[contains(text(),'Move')]")
	WebElement Move_Folder;
	
	@FindBy(xpath="//*[contains(text(),'New folder')]")
	WebElement Move_Create_Folder;
	
	@FindBy(xpath="//*[contains(text(),'Move here')]")
	WebElement Move_Here_Button;
	
	@FindBy(xpath="//*[contains(text(),'50 selected')]")
	WebElement Count_50;
	
	@FindBy(xpath="//div[@class='TruncateFileName__namePart']")
	WebElement Rename_FolderName;
	
	@FindBy(xpath="	//div[@class='ListViewItem__item-menu-icon-container']//div[@class='ButtonIcon  ButtonIcon--capitalized ']//div[@class='icon icon-dot-horizontal ButtonIcon__icon  ']\n"
			+ "")
	WebElement Folder_Three_Dot_Menu;
	
	@FindBy(xpath="//*[@class='ContextMenuItem ContextMenuItem--notTouch ContextMenuItem--enable' and contains(text(),'Rename')]"
			+ "")
	WebElement Rename_Folder;
	
	@FindBy(xpath="//div[@class='ModalInput ModalInput--valid ']//form[@class='ModalInput__input-form']//input[@class='AutocapitalizeInput  ModalInput__input  ModalInput__input--valid']"
			+ "")
	WebElement Rename_InputField;
	
	@FindBy(xpath="//div[@class='Button Button--primary Button--medium']")
	WebElement Rename_button;
	
	@FindBy(xpath="//div[@class='icon icon-dot-horizontal ButtonIcon__icon  ']//div[@class='icon__inner']")
	WebElement Subfolder_3_dot_menu;
	
	@FindBy(xpath="	//*[@class='ContextMenuItem ContextMenuItem--notTouch ContextMenuItem--enable' and contains(text(),'New folder')]\n"
			+ "")
	WebElement clickOnSubFolderNewFolderOption;
	
	@FindBy(xpath="//div[@class='ModalInput ModalInput--valid ']//form[@class='ModalInput__input-form']//input[@class='ModalInput__input  ModalInput__input--valid']"
			+ "")
	WebElement renameFieldInSubFolderField;
	
	@FindBy(xpath="//*[contains(text(),'Settings')]")
	WebElement ClickOnSettings;
	
	
	
	
	//PageFactoryMeethod
	public FilesFoldersPage() {
           PageFactory.initElements(driver, this);
		}
			
	public void Right_click_for_Dmenu() {
		Actions actions = new Actions(driver);
		actions.contextClick(Space_Click).perform();
		
	}
	
	public void Newfolder_Creation_and_Validation_Test() {
		
		//Commiit 
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
	
	public void FolderSearch_Test() throws InterruptedException {
		
		Actions a = new Actions(driver);
		a.moveToElement(Search_Input_Field_Extened).click().build().perform();
		Thread.sleep(2000);
		Search_Input_Field_Extened.sendKeys("YouFoundMeFolder");
		Search_Input_Field_Extened.sendKeys(Keys.ENTER);
		WebElement Folder_Name = driver.findElement(By.xpath("//*[contains(text(),'YouFoundMeFolder')]"));
		String NameOfFolder = Folder_Name.getText();
		Assert.assertEquals(NameOfFolder, "YouFoundMeFolder", "Unable to locate the folder");
	}
	
	
	public void Move_Folder_Test() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.contextClick(Space_Click).perform();
		SelectAll_From_DMenu.click();
		Move_Folder.click();
		Move_Create_Folder.click();
		New_Folder_Input.clear();
		New_Folder_Input.sendKeys(FolderName);
		Create_Folder_Button.click();
		Thread.sleep(2000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Move_Here_Button);
		Thread.sleep(1000);
			
	}
	
	public void Rename_Folder_Test() {
		
	    
	    Folder_Three_Dot_Menu.click();
	    Rename_Folder.click();
	    Rename_InputField.click();
	    Rename_InputField.clear();
	    String RenamedFolder = "AutoRenamed"+randomNumber;
	    Rename_InputField.sendKeys(RenamedFolder);
	    Rename_button.click();
	    String Renamedfolder = driver.findElement(By.xpath("//*[contains(text(),'"+RenamedFolder+"')]")).getText();
	    Assert.assertEquals(RenamedFolder, Renamedfolder, "unable to locate the renamed Folder");
	    	
	}
	
	public void Create_Folder_and_Su_Folders_KAM_35904() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.contextClick(Space_Click).perform();
		New_Folder_From_DMenu.click();
		Div_New_Folder_Input.click();
		New_Folder_Input.clear();
		New_Folder_Input.sendKeys(FolderName);
		Create_Folder_Button.click();
		
		//FirstSubFolderCreation
		driver.findElement(By.xpath("//*[contains(text(),'"+FolderName+"')]")).click();
		Subfolder_3_dot_menu.click();
		Thread.sleep(1000);
		clickOnSubFolderNewFolderOption.click();
		renameFieldInSubFolderField.click();
		renameFieldInSubFolderField.clear();
		String First_Subfolder_Name = "FirstSubFolder"+randomNumber;
		renameFieldInSubFolderField.sendKeys(First_Subfolder_Name);
		Create_Folder_Button.click();
		
		//SecondSubFolderCreation
		driver.findElement(By.xpath("//*[contains(text(),'"+First_Subfolder_Name+"')]")).click();
		Subfolder_3_dot_menu.click();
		Thread.sleep(1000);
		clickOnSubFolderNewFolderOption.click();
		renameFieldInSubFolderField.click();
		renameFieldInSubFolderField.clear();
		renameFieldInSubFolderField.sendKeys("SecondSubFolder"+randomNumber);
		Create_Folder_Button.click();
		
			
	}
	
	public void clickOnSettingsOption() {
		
		ClickOnSettings.click();
		
	}
	
	
		

}
