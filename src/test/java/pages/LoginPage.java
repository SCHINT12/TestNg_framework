package pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Common;
import excelutils.Excelutils;

public class LoginPage extends Common {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='Login-LoginScreen-LoginDV-username']/div/input")
	public static WebElement username_textbox;
	
	@FindBy(xpath="//*[@id='Login-LoginScreen-LoginDV-password']/div/input")
	public static WebElement password_textbox;
	
	@FindBy(xpath="//*[@id='Login-LoginScreen-LoginDV-submit']/div")
	public static WebElement login;
	
	
	
	
	public LoginPage(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void login() throws IOException, InterruptedException
	{
		String username=Excelutils.getenvironmentcredentials("username","EnvCreds");
		String password=Excelutils.getenvironmentcredentials("password","EnvCreds");
		
		enterText(driver, username_textbox,username ,"username");
		Thread.sleep(3000);
		enterText(driver, password_textbox, password ,"password");
		Thread.sleep(3000);
		click(driver, login, "login");
	}
	
}
