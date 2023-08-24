package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice 
{
	@Test(dataProvider="getData")
	public void addProductToCartTest(String name,String model,int price,String feature,int qty) 
	{
		System.out.println(name+"-"+model+"-"+price+"-"+feature+"-"+qty);
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] d=new Object[4][5];
		
		d[0][0]="Samsung";
		d[0][1]="A80";
		d[0][2]=3000;
		d[0][3]="Camera";
		d[0][4]=12;
		
		d[1][0]="Nokia";
		d[1][1]="11000";
		d[1][2]=2000;
		d[1][3]="games";
		d[1][4]=5;
		
		d[2][0]="iphone";
		d[2][1]="13pro";
		d[2][2]=5000;
		d[2][3]="Security";
		d[2][4]=12;
		
		d[3][0]="vivo";
		d[3][1]="A20";
		d[3][2]=10000;
		d[3][3]="camera";
		d[3][4]=15;
		
		return d;
		
	}

}
