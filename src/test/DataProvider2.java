package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
	@Test(dataProvider="product")
	public void addProductToCartTest(String name,String model,int price,String feature,int qty) 
	{
		System.out.println(name+"-"+model+"-"+price+"-"+feature+"-"+qty);	
	}


		// TODO Auto-generated method stub
		@DataProvider(name="product")
		public Object[][] getData()
		{
			Object[][] d1=new Object[4][5];
			d1[0][0]="Samsung";
			d1[0][1]="A80";
			d1[0][2]=3000;
			d1[0][3]="Camera";
			d1[0][4]=12;
			
			d1[1][0]="Nokia";
			d1[1][1]="11000";
			d1[1][2]=2000;
			d1[1][3]="games";
			d1[1][4]=5;
			
			d1[2][0]="iphone";
			d1[2][1]="13pro";
			d1[2][2]=5000;
			d1[2][3]="Security";
			d1[2][4]=12;
			
			d1[3][0]="vivo";
			d1[3][1]="A20";
			d1[3][2]=10000;
			d1[3][3]="camera";
			d1[3][4]=15;
			
			return d1;

		}

	}


