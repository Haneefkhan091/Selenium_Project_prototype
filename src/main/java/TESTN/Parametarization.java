package TESTN;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parametarization {

    // Simple DataProvider with multiple sets of data
    @DataProvider(name = "simpleDataProvider")
    public Object[][] simpleDataProviderMethod() {
        return new Object[][]{
                {"Haneef ", "Khan"},
                {"Arsalan", "Bhai"},
                {"Abdul Rahman", "bhai"}
        };
    }

    // DataProvider with different parameter types
    @DataProvider(name = "mixedTypesDataProvider")
    public Object[][] mixedTypesDataProviderMethod() {
        return new Object[][]{
                {"Haneef", 25, true},
                {"Arsalan", 30, true},
                {"Abdul Rahman", 22, true}
        };
    }

    // Dynamic DataProvider that generates data at runtime
    @DataProvider(name = "dynamicDataProvider")
    public Object[][] dynamicDataProviderMethod() {
        // In a real scenario, data can be fetched from a database or external source.
        // Here, we generate some dynamic data for demonstration purposes.
        return new Object[][]{
                {generateRandomString(), generateRandomNumber()},
                {generateRandomString(), generateRandomNumber()},
                {generateRandomString(), generateRandomNumber()}
        };
    }

    // Test method using simpleDataProvider
    @Test(dataProvider = "simpleDataProvider")
    public void testWithSimpleDataProvider(String firstName, String lastName) {
        System.out.println("Test Method (Simple DataProvider) - Name: " + firstName + " " + lastName);
    }

    // Test method using mixedTypesDataProvider
    @Test(dataProvider = "mixedTypesDataProvider")
    public void testWithMixedTypesDataProvider(String name, int age, boolean isAdult) {
        System.out.println("Test Method (Mixed Types DataProvider) - Name: " + name +
                ", Age: " + age + ", Is Adult: " + isAdult);
    }

    // Test method using dynamicDataProvider
    @Test(dataProvider = "dynamicDataProvider")
    public void testWithDynamicDataProvider(String dynamicString, int dynamicNumber) {
        System.out.println("Test Method (Dynamic DataProvider) - Dynamic String: " +
                dynamicString + ", Dynamic Number: " + dynamicNumber);
    }

    // Helper method to generate a random string
    private String generateRandomString() {
        // In a real scenario, a more sophisticated random string generation logic can be used.
        return "RandomString" + System.currentTimeMillis();
    }

    // Helper method to generate a random number
    private int generateRandomNumber() {
        return (int) (Math.random() * 100);
    }
}
