package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Common extends BaseTest {

	public WebDriver driver;


	public Common()
	{
		this.driver=driver;
	}

	By Next_btn = By.xpath("//div[@id='SubmissionWizard-Next']");


	public boolean click(WebDriver driver,WebElement ele,String elementName)
	{
		boolean flag=false;
		if(ele.isDisplayed())
		{
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("arguments[0].style.border='2px solid red'", ele);
			js.executeScript("arguments[0].style.background='yellow'", ele);
			ele.click();
			flag=true;
			reportpass(test, "user should click the <B>"+elementName+"</B>", "</B>user is able to click the <B>"+elementName+"</B>",driver);
		}
		else
		{
			reportfail(test, "user should click the <B>"+elementName+"</B>", "</B>user is not able to click the <B>"+elementName+"</B>", driver);
		}
		return flag;
	}
	public boolean enterText(WebDriver driver,WebElement ele,String str,String elementName)
	{
		boolean flag=false;
		if(ele.isDisplayed())
		{
			JavascriptExecutor js =(JavascriptExecutor)driver;

			js.executeScript("arguments[0].style.border='2px solid red'", ele);
			js.executeScript("arguments[0].style.background='yellow'", ele);

			ele.sendKeys(str);
			
			flag=true;
		}
		reportpass(test, "user should enter the <B>"+elementName+"</B> as <B>" +str, "</B>user is able to enter the <B>"+elementName+"</B> as <B>" +str,driver);
		return flag;
	}
	public boolean selectDropdown(String str,List<WebElement> ele)
	{
		boolean flag=false;
		for(WebElement ele1:ele)
		{
			if(ele1.getText().equals(str))
			{
				ele1.click();
				flag = true;
			}
		}
		return flag;
	}
}
