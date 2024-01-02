package TESTN;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][] {
                { "John", 25 },
                { "Jane", 30 },
                { "Doe", 35 }
        };
    }

    @Test(dataProvider = "data-provider")
    public void dataProviderTest(String name, int age) {
        System.out.println("Data Provider Test - Name: " + name + ", Age: " + age);
    }
}
