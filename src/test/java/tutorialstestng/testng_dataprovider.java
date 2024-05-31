package tutorialstestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testng_dataprovider {
	
	@DataProvider(name="dp")
	public Object[][] dp() {
		return new Object[][] {{1,2,3},{4,5,6},{7,8,9}};
	}
	
	@Test(dataProvider = "dp")
	public void test(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}

}
