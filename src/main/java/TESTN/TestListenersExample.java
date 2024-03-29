//package TESTN;
//
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//@Listeners(TestListenersExample.TestListener.class)
//public class TestListenersExample {
//
//    @Test
//    public void testWithListener1() {
//        System.out.println("Test Method with Listener 1");
//    }
//
//    @Test
//    public void testWithListener2() {
//        System.out.println("Test Method with Listener 2");
//    }
//
//    public static class TestListener implements ITestListener {
//
//        @Override
//        public void onTestStart(ITestResult result) {
//            System.out.println("Test Started: " + result.getName());
//        }
//
//        @Override
//        public void onTestSuccess(ITestResult result) {
//            System.out.println("Test Passed: " + result.getName());
//        }
//
//        @Override
//        public void onTestFailure(ITestResult result) {
//            System.out.println("Test Failed: " + result.getName());
//        }
//
//        @Override
//        public void onTestSkipped(ITestResult result) {
//            System.out.println("Test Skipped: " + result.getName());
//        }
//
//        @Override
//        public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//            // Not used in this example
//        }
//
//        @Override
//        public void onStart(ITestContext context) {
//            System.out.println("Test Suite Started: " + context.getName());
//        }
//
//        @Override
//        public void onFinish(ITestContext context) {
//            System.out.println("Test Suite Finished: " + context.getName());
//        }
//    }
//}
