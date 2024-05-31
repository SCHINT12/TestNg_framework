package tutorialstestng;

import org.testng.annotations.Test;

public class priorityoftestcases {

	
	@Test(priority=56)
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(priority = -6)
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("test3");
	}
	
	@Test
	public void test4()
	{
		System.out.println("test4");
	}
}
