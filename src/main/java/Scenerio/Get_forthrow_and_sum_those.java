package Scenerio;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Get_forthrow_and_sum_those {
	public static WebDriver driver;

	public static void main(String[] args) {
		// Set the path to your chromedriver executable
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		// Initialize WebDriver
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Find the table by class name
		WebElement table = driver.findElement(By.className("tableFixHead"));

		// Use JavascriptExecutor to scroll inside the table
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", table);

		// Wait for elements in the fourth column to be present
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".tableFixHead td:nth-child(4)")));

		// Find all elements in the fourth column
		java.util.List<WebElement> elementsInFourthColumn = driver
				.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

		// Sum of values in the fourth column
		int sum = 0;

		// Get the text of each element, parse as integer, and accumulate the sum
		for (WebElement element : elementsInFourthColumn) {
			String text = element.getText().trim();

			// Assuming the text contains numeric values
			try {
				int value = Integer.parseInt(text);
				sum += value;
			} catch (NumberFormatException e) {
				// Handle if the text is not a valid integer
				System.out.println("Skipped non-numeric value: " + text);
			}
		}

		// Print the sum
		System.out.println("Sum of values in the fourth column: " + sum);

		// Find the totalAmount element by id
		WebElement totalAmountElement = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".totalAmount")));

		// Get the text inside the totalAmount element
		String totalAmountText = totalAmountElement.getText().trim();

		// Extract the numeric part using regular expressions
		String numericPart = totalAmountText.replaceAll("[^0-9]", "");

		// Print the numeric part
		System.out.println("Numeric part inside totalAmount: " + numericPart);
//Apply assertion to it
//		assertEquals(numericPart, sum);
		// Perform assertion
        Assert.assertEquals(sum, Integer.parseInt(numericPart), "Sum of values in the fourth column is equal to the numeric part inside totalAmount");

		// Close the browser
		driver.quit();
	}
}
