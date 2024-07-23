package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import base.BaseTest;
import base.Common;
import excelutils.Excelutils;
import pages.LoginPage;
import pages.createAccountPage;

public class createaccounttest extends BaseTest  {
	LoginPage obj_LoginPage;
	createAccountPage obj_createAccountPage;
	Common comn=new Common();
	Excelutils excelutil=new Excelutils();
	WebDriver driver;
	//public static ExtentReports report;
	//public static ExtentTest test;
	
	@Test
	public void test(String tc) throws IOException, InterruptedException
	{
		int rownumber=excelutil.getrownumber(tc,"Testdata");
		System.out.println(rownumber);
		if(excelutil.getexecutionstatus("Y",rownumber))
		{
			test=report.startTest("Logintest","Test to verify user is able to login into the PC Application");
			driver=launchBrowser();
			obj_LoginPage=new LoginPage(driver);
			obj_LoginPage.login();
			Thread.sleep(3000);
			obj_createAccountPage=new createAccountPage(driver);
			obj_createAccountPage.createaccount(rownumber);
		}
		else
		{
			System.out.println("fail");
		}
		report.endTest(test);
		report.flush();
	}
}
