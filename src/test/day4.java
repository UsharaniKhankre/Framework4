package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({ "URL","APIkey/username" })
	@Test
	public void webHomeLoginCar(String uname,String key) 
	{
		System.out.println("login Web login Home car");
		System.out.println(uname);
		System.out.println(key);
	}
	@Test(dataProvider="getData")
	public void mobileHomeLoginCar(String username,String password) 
	{
		System.out.println("login mobile login Home car ");
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getData() 
	{
		//1st cobination -username password-good credit history=row
		//2nd username password -no credit history
		//3rd -fraudelent credit history
		Object[][] data=new Object[3][2];
		//1st set
		data[0][0]="firstusername";
		data[0][1]="password";
		//2nd set
		data[1][0]="secondusername";
		data[1][1]="spassword";
		//3rd set
		data[2][0]="thirdusername";
		data[2][1]="tpassword";
	return data;
	}
	

		
}


