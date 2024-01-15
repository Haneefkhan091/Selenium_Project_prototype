package ExtentReport;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreport {

	ExtentReports extent;
	public static WebDriver driver;

	@BeforeTest

	public void config()

	{

// ExtentReports , ExtentSparkReporter

		String path = System.getProperty("user.dir") + "\\reports\\index.html";

		ExtentSparkReporter reporter = new ExtentSparkReporter(path);

		reporter.config().setReportName("Codes Automation");

		reporter.config().setDocumentTitle("Test Results of automation");

		extent = new ExtentReports();

		extent.attachReporter(reporter);

		extent.setSystemInfo("Tester", "Haneef Khan");

	}

	@Test

	public void initialDemo()

	{

		ExtentTest test = extent.createTest("Initial Demo");

//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com");

		System.out.println(driver.getTitle());

		driver.close();

//test.fail("Result do not match");

		extent.flush();

	}

}
