package tutorialstestng;

import org.testng.annotations.Test;

public class test {

@Test(groups= {"A"})
public void a1()
{
	System.out.println("a1");
}

@Test(groups= {"A"})
public void a2()
{
	System.out.println("a2");
}

@Test(groups= {"B"})
public void a3()
{
	System.out.println("a3");
}

@Test(groups= {"C"})
public void a4()
{
	System.out.println("a4");
}

}
