package tutorialstestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng_parameters {
	
	@Parameters({"username","password"})
	@Test
	public void test(String username,String password)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8180/pc/PolicyCenter.do");
		driver.findElement(By.xpath("//*[@id='Login-LoginScreen-LoginDV-username']/div/input")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='Login-LoginScreen-LoginDV-password']/div/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='Login-LoginScreen-LoginDV-submit']/div")).click();
}

}
