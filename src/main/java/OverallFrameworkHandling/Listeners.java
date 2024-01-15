package OverallFrameworkHandling;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners extends ScreenshotUtility implements ITestListener {

public static WebDriver driver;

//    @Override
    public void onTestFailure(ITestResult result) {
    	
    	WebDriver driver = null;
    	String testCaseName = result.getMethod().getMethodName();
    	try {
			driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			// TODO: handle exception
			
		}
    	try {
			getScreenShotPath(testCaseName,driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
    }
}

    // Implement other ITestListener methods if needed

//  
