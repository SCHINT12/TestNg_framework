package pages.facebook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.Common;
import excelutils.Excelutils;

public class homepage extends Common{
	
	WebDriver driver;
	Excelutils excelutils=new Excelutils();
	
	@FindBy(xpath="//*[@data-testid=\"open-registration-form-button\"]")
	public static WebElement createaccount ;
	
	public homepage(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickcreateaccount()
	{
		//createaccount.click();
		click(driver,createaccount, "Create Account");
	}
}
