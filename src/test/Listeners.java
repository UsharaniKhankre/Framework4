package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener 
{
public void onTestStart(ITestResult result) 
{
	//System.out.println("I sucessfully executed listeners pass code");
}
public void onTestSuccess(ITestResult result) 
{
}

public void onTestFailure(ITestResult result) 
{
	System.out.println("I failed executing listeners pass code"+result.getName());
}
public void onTestSkipped(ITestResult result) 
{
}
public void onTestFailedButWithinSuccessOercentage(ITestResult result) 
{
}
public void onTestStart(ITestContext context) 
{
	}
public void onFinish(ITestContext context)
{
	}

}
