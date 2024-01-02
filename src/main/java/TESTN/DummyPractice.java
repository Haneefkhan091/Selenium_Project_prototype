package TESTN;

import org.testng.Assert;
import org.testng.annotations.*;

public class DummyPractice {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite - Executed once before the test suite.");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite - Executed once after the test suite.");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test - Executed once before the test cases in the current <test> tag.");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test - Executed once after the test cases in the current <test> tag.");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class - Executed once before all the test methods in the current class.");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class - Executed once after all the test methods in the current class.");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method - Executed before each test method.");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method - Executed after each test method.");
    }

    @Test(groups = "sanity")
    public void testMethod1() {
        System.out.println("Test Method 1 - Group: sanity");
        Assert.assertTrue(true);
    }

    @Test(groups = "regression")
    public void testMethod2() {
        System.out.println("Test Method 2 - Group: regression");
        Assert.assertEquals("Hello", "Hello");
    }

    @Test(groups = {"sanity", "regression"})
    public void testMethod3() {
        System.out.println("Test Method 3 - Groups: sanity, regression");
        Assert.assertNotEquals(5, 10);
    }

    @Parameters({"param1", "param2"})
    @Test
    public void parameterizedTest(@Optional("defaultParam1") String param1, @Optional("defaultParam2") String param2) {
        System.out.println("Parameterized Test - Param1: " + param1 + ", Param2: " + param2);
    }

    @Test(dependsOnMethods = {"testMethod1"})
    public void dependentTest() {
        System.out.println("Dependent Test - Depends on testMethod1");
    }

    @Test(enabled = false)
    public void disabledTest() {
        System.out.println("Disabled Test - This test will not be executed.");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void exceptionTest() {
        System.out.println("Exception Test - Expects ArithmeticException");
        int result = 1 / 0; // This will throw ArithmeticException
    }

    @Test(timeOut = 2000)
    public void timeoutTest() throws InterruptedException {
        System.out.println("Timeout Test - This test should finish within 2 seconds.");
        Thread.sleep(1000);
    }
}
