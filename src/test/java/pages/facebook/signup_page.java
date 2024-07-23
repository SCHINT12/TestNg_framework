package pages.facebook;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Common;
import excelutils.Excelutils;


public class signup_page extends Common {
	
	WebDriver driver;
	Excelutils excelutils=new Excelutils();
	
	@FindBy(name="firstname")
	public static WebElement firstname ;
	
	@FindBy(name="lastname")
	public static WebElement lastname ;
	
	@FindBy(name="reg_email__")
	public static WebElement email ;
	
	@FindBy(name="reg_passwd__")
	public static WebElement password ;
	
	@FindBy(name="birthday_day")
	public static WebElement birthdate ;
	
	@FindBy(name="birthday_month")
	public static WebElement birthmonth ;
	
	@FindBy(name="birthday_year")
	public static WebElement birthyear ;
	
	@FindBy(xpath="//input[@value='2']")
	public static WebElement gender ;
	
	@FindBy(xpath="//*[contains(text(),'and easy.')]")
	public static WebElement text ;
	
	
	
	
	public signup_page(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void signup_account(int rowno) throws IOException
	{
		enterText(driver,firstname, Excelutils.getcelldata(rowno,"firstname","Testdata"),"First Name");
		enterText(driver,lastname, Excelutils.getcelldata(rowno, "lastname", "Testdata"),"Last Name");
//		entertext(email, excelutils.getcelldata(rowno, 5, "data"), driver, "Email");
//		entertext(password, excelutils.getcelldata(rowno, 1, "data"), driver, "Password");
//		selectbyinvisibletext(driver, birthdate, excelutils.getcelldata(rowno, 9, "data"), "Birth Date");
//		selectbyinvisibletext(driver, birthmonth, excelutils.getcelldata(rowno, 10, "data"), "Birth Month");
//		selectbyinvisibletext(driver, birthyear, excelutils.getcelldata(rowno, 11, "data"), "Birth Year");
//		click(gender, driver, "Male");
	}
	
//	public void validateUIText(int rowno) throws IOException
//	{
//		validateuitext(text, Excelutils.getcelldata(rowno, 12, "data"));
//	}
	
	
}
