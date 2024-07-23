package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='2px solid red'", driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")));
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(6000);
		js.executeScript("arguments[0].style.border='2px solid red'", driver.findElement(By.xpath("//*[@name='firstname']")));
		js.executeScript("arguments[0].style.background='blue'", driver.findElement(By.xpath("//*[@name='firstname']")));
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Shiva");
		js.executeScript("arguments[0].style.border='2px solid red'", driver.findElement(By.xpath("//*[@name='lastname']")));
		js.executeScript("arguments[0].style.background='blue'", driver.findElement(By.xpath("//*[@name='lastname']")));
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Narayana");



	}

}
