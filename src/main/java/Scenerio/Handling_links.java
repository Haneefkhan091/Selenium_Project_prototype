package Scenerio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_links {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.findElement(By.id("gf-BIG"));
		// Find the element by its ID
		WebElement parentElement = driver.findElement(By.id("gf-BIG"));

		// Use Actions class to scroll to the element
		Actions actions = new Actions(driver);
		actions.moveToElement(parentElement);
		actions.perform();

		// Find all anchor elements within the parent element
		List<WebElement> links = parentElement.findElements(By.tagName("a"));

		// Open each link in a new tab and print its title
		for (WebElement link : links) {
			// Open link in a new tab using JavaScript
			String script = "window.open('" + link.getAttribute("href") + "','_blank');";
			((org.openqa.selenium.JavascriptExecutor) driver).executeScript(script);

			// Switch to the new tab
			String originalHandle = driver.getWindowHandle();
			for (String handle : driver.getWindowHandles()) {
				if (!handle.equals(originalHandle)) {
					driver.switchTo().window(handle);

					// Print the title of the new tab
					System.out.println("Title of the new tab: " + driver.getTitle());

					// Close the new tab
					driver.close();
				}
			}

			// Switch back to the original tab
			driver.switchTo().window(originalHandle);
		}

	}
}
