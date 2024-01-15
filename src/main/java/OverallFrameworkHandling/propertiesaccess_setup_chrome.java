package OverallFrameworkHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class propertiesaccess_setup_chrome {

    private WebDriver driver;
    public static final String BASE_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
   
    public WebDriver initializeDriver() {
        Properties properties = new Properties();
        FileInputStream fileInputStream;

        try {
            // Load properties from the file
            fileInputStream = new FileInputStream("C:\\Users\\Codes Orbit\\eclipse-workspace\\MySeleniumCourcePractice\\src\\main\\java\\data.properties");
            properties.load(fileInputStream);

            // Get browser value from properties
            String browser = properties.getProperty("browser");

            // Choose the WebDriver based on the browser value
            if ("chrome".equalsIgnoreCase(browser)) {
                setupChromeDriver();
            } else if ("firefox".equalsIgnoreCase(browser)) {
                setupFirefoxDriver();
            } else {
                System.out.println("Invalid browser specified in data.properties");
            }

            // Maximize the window
            driver.manage().window().maximize();

            // Check if the 'url' property is present in the properties file
            if (properties.containsKey("url")) {
                // Navigate to the URL if the 'url' property is available
                driver.get(properties.getProperty("url"));
            } else {
                System.out.println("URL is not specified in data.properties");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return driver;
    }

    private void setupChromeDriver() {
        // Set the path to your ChromeDriver executable
        driver = new ChromeDriver();
    }

    private void setupFirefoxDriver() {
        // Set the path to your geckodriver executable
        // System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
        driver = new FirefoxDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void main(String[] args) {
        propertiesaccess_setup_chrome webDriverSetup = new propertiesaccess_setup_chrome();
        WebDriver driver = webDriverSetup.initializeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Use the 'driver' instance in your test script to access the WebDriver
        // Do your test operations here

        webDriverSetup.quitDriver();
    }
}
