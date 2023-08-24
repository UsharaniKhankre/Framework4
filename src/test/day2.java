package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day2 
{
	@AfterTest
	public void afSuite() 
	{
		System.out.println("i execute last");
	}
	@Test(groups={"smoke"})
	public void demo2() 
	{
		System.out.println("hi");
	}
	@BeforeSuite
	public void bfSuite()
	{
		System.out.println("I am in 1st");
	}
	@Test(timeOut=4000)
	public void demo3() 
	{
		System.out.println("welcome");
	}
	@Test
	public void demo4() 
	{
		System.out.println("solicite");
	}

}
