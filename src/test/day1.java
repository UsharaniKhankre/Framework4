package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 
{
	@Test(groups= {"smoke"})
	public void demo() 
	{
		System.out.println("hello");
		
	}
	@BeforeTest
	public void bfTest() 
	{
		System.out.println("I will excecute first");
	}

}
