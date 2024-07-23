import org.testng.annotations.Test;

public class test {
	
	@Test(dataProvider = "workorderTestData",dataProviderClass = DP.class,priority = 1)
	public void test3(Object obj)
	{
		System.out.println(obj);
		
	}
	
//	@Test(dataProvider = "workorderTestData1",dataProviderClass = DP.class,priority = 2)
//	public void test1(Object obj)
//	{
//		System.out.println(obj);
//		
//	}

}
