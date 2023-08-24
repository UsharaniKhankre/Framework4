package test;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 
{
	
	@Test
	public void webLoginCar() 
	{
		System.out.println("Web Login car");
		Assert.assertTrue(false);
	}
	@BeforeClass
	public void bfClass() 
	{
		System.out.println("before executing every method in the day3 class");
	}
	@AfterClass
	public void afClass() 
	{
		System.out.println("afte executing every method in the day3 class");
	}
	@BeforeMethod
	public void bfMethod()
	{
		System.out.println("I will execute before every before method in day3 class");
	}
	@AfterMethod
	public void afMethod()
	{
		System.out.println("I will execute before every after method in day3 class");
	}
	@Test(enabled=false)//In real time if test case is fail or false we go for enabled attribute 
	public void MobileLoginCar() 
	{
		System.out.println("Mobile Login mobile");
	}
	@AfterSuite
	public void afSuite() 
	{
		System.out.println("I am the 1 from last");
	}
	@Test(dependsOnMethods={"webLoginCar"})//this apiLoginCar depends on webLoginMethods
	public void apiLoginCar() 
	{
		System.out.println("api login api");
	}

}
