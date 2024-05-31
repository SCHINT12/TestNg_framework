package tests;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;
import excelutils.Excelutils;
import pages.facebook.homepage;
import pages.facebook.signup_page;


public class facebook_createaccounttest extends BaseTest {
	WebDriver driver;
	Excelutils excelutil=new Excelutils();
	
	@Parameters("tc")
	@Test
	
	public void test(String tc) throws InterruptedException, AWTException, IOException
	{

		int rownumber=excelutil.getrownumber(tc,"Testdata");
		System.out.println("Rownumber is :"+rownumber);
		if(excelutil.getexecutionstatus("Y",rownumber))
		{
		test=report.startTest("facebook create account test","Test to verify user is able to create facebook account");
		driver=launchBrowser();
		Thread.sleep(5000);
		homepage home=new homepage(driver);
		home.clickcreateaccount();
		Thread.sleep(7000);
		signup_page signup=new signup_page(driver);
		signup.signup_account(rownumber);
		report.endTest(test);
		report.flush();
		}
		else
		{
			System.out.println("Failed");
		}
}
}
