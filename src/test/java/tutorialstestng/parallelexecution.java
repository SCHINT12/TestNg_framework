package tutorialstestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class parallelexecution {
	WebDriver driver;
	@Test
	
	public void chrometest()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
@Test
	
	public void edgetest()
	{
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/newtours/");
}
	}


