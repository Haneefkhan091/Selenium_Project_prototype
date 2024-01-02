package Scenerio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLINKs {
    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Find all the links on the page
        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));

        // Print the total number of links
        System.out.println("Total number of links: " + links.size());

        // Print the text and href attributes of each link
        for (WebElement link : links) {
            System.out.println("Link Text: " + link.getText());
            System.out.println("Link Href: " + link.getAttribute("href"));
            System.out.println("-------------------------");
        }

        // Close the browser
        driver.quit();
    }
}
