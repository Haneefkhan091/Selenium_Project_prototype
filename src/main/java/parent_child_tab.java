import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parent_child_tab {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // Initialize the WebDriver
        driver = new ChromeDriver();

        // Navigate to the specified URL
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

        // Click on an element with the class "blinkingText"
        driver.findElement(By.cssSelector(".blinkingText")).click();

        // Get the window handles (IDs) for the currently open windows
        Set<String> windows = driver.getWindowHandles(); // [parentid, childid, subchildId]

        // Use an iterator to navigate through the window handles
        Iterator<String> it = windows.iterator();

        // Get the IDs of the parent and child windows
        String parentId = it.next();
        String childId = it.next();

        // Switch to the child window
        driver.switchTo().window(childId);

        // Extract text from an element with the CSS selector ".im-para.red"
        String text = driver.findElement(By.cssSelector(".im-para.red")).getText();

        // Define a regular expression pattern to match an email address
        String emailPattern = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";

        // Compile the pattern and create a matcher for the extracted text
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(text);

        // Use a ternary operator to assign the value of emailAddress based on whether the matcher finds a match
        String emailAddress = matcher.find() ? matcher.group() : null;

        // Print the extracted email address to the console
        System.out.println("Extracted email address: " + emailAddress);

        // Switch back to the parent window
        driver.switchTo().window(parentId);

        // Input the email address into the username field (if not null)
        driver.findElement(By.id("username")).sendKeys(emailAddress);

        // Introduce a brief delay (2 seconds) to observe the result (optional)
        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}
