package TESTN;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class TestNGannotation {
	@Test(groups = {"smoke"})
	public static void Test() {

		System.out.println("How are you all");

	}
	@Test(groups = {"smoke"})
	
	public static void RegreTest() {

		System.out.println("Regression test");

	}
	@Test(groups = {"smoke"})
	public static void REgTest() {

		System.out.println("REG TEST");

	}
	@Test(groups = {"smoke"})
	public static void SmokeTest() {

		System.out.println("SMoke Test");

	}
	@BeforeMethod
	public static void beforeeverytest() {
		// TODO Auto-generated method stub
		System.out.println("i will be executed before all the every time it run");
	}

	@BeforeTest
	public static void BeforeTest() {

		System.out.println("I will execute before all the test");
	}

	@AfterSuite
	public static void aftsuite() {

		System.out.println("It will be executed after all the test executed at the last");
	}

	@AfterTest
	public static void AfterTest() {
		System.out.println("I will execute after the test");

	}

	@Test
	public static void GreetTest() {
		System.out.println("Hello all hope you guys are doing great");

	}
}
