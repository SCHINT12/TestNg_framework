package tutorialstestng;

import java.util.Collection;
import java.util.Collections;

import org.testng.annotations.Test;

public class groupingtestcases {
	
	@Test(groups= {"E2E"})
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(groups= {"smoke test"})
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(groups= {"sanity"})
	public void test3()
	{
		System.out.println("test3");
	}
	
	@Test(groups= {"smoke test"})
	public void test4()
	{
		System.out.println("test4");
	}

}
