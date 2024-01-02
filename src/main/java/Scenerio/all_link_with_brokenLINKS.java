package Scenerio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class all_link_with_brokenLINKS {
    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Find all the links on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Iterate through each link and check for broken links
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            verifyLink(url);
        }

        // Close the browser
        driver.quit();
    }

    // Function to verify if a link is broken
    public static void verifyLink(String url) {
        try {
            URL link = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setConnectTimeout(3000); // Set the timeout for the connection
            httpURLConnection.connect();

            // Check the HTTP response code
            if (httpURLConnection.getResponseCode() == 200) {
                System.out.println(url + " - OK (Status: " + httpURLConnection.getResponseCode() + ")");
            } else {
                System.out.println(url + " - Broken Link (Status: " + httpURLConnection.getResponseCode() + ")");
            }
        } catch (Exception e) {
            System.out.println(url + " - Exception Occurred (Broken Link)");
        }
    }
}
