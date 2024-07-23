package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Common;
import excelutils.Excelutils;

public class createAccountPage extends Common {

WebDriver driver;
	
	@FindBy(xpath="//*[@id='TabBar-AccountTab']/div[3]/div")
	public static WebElement account_expand_button;
	
	@FindBy(xpath="//*[@id='TabBar-AccountTab-AccountTab_NewAccount']/div/div[2]")
	public static WebElement NewAccount;
	
	@FindBy(xpath="//*[@id='NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-FirstName']/div/input")
	public static WebElement firstname_textbox;
	
	@FindBy(xpath="//*[@id='NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-LastName']/div/input")
	public static WebElement lastname_textbox;
	
	@FindBy(xpath="(//*[contains(@id,'Search')])[63]")
	public static WebElement searchbutton;
	
	
	
	
	
	

	public createAccountPage(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void createaccount(int rownumber) throws IOException, InterruptedException
	{
		
		String firstname=Excelutils.getdata("firstname","Testdata",rownumber);
		String lastname=Excelutils.getdata("lastname","Testdata",rownumber);
		Thread.sleep(6000);
		click(driver, account_expand_button, "account expand button");
		Thread.sleep(6000);
		click(driver, NewAccount, "NewAccount");
		Thread.sleep(4000);
		enterText(driver, firstname_textbox, Excelutils.getdata("firstname","Testdata",rownumber),"firstname");
		enterText(driver, lastname_textbox,Excelutils.getdata("lastname","Testdata",rownumber) ,"lastname");
		click(driver, searchbutton, "searchbutton");
		


		
		
	}
	
}

