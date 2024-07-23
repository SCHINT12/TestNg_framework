package tutorialstestng;

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

public class testtttttttt extends BaseTest  {
	LoginPage obj_LoginPage;
	Common comn=new Common();
	Excelutils excelutil=new Excelutils();
	WebDriver driver;
	//public static ExtentReports report;
	//public static ExtentTest test;
	
	@Parameters({"testcasenumber"})
	@Test
	public void test(String tc) throws IOException, InterruptedException
	{
		int rownumber=excelutil.getrownumber(tc,"Testdata");
		System.out.println(rownumber);
		if(excelutil.getexecutionstatus("Y",rownumber))
		{
			test=report.startTest("TC","TC1");
			//test=report.startTest("TC6", "Execution for TC6");
	         //test= generaTest(report,"MyFirstTest", "Sample description");
			driver=launchBrowser();
			obj_LoginPage=new LoginPage(driver);
			obj_LoginPage.login();
		}
		else
		{
			System.out.println("fail");
		}
		report.endTest(test);
		report.flush();
	}
}
