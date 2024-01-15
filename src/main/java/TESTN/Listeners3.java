package TESTN;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class Listeners3 implements ITestListener {
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("This will be on Test start"+result.getName());
	}
	
	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("This will be on Test Fail"+result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		
		// TODO Auto-generated method stub
		System.out.println("This will be on Test Success"+result.getName());
	}

}
