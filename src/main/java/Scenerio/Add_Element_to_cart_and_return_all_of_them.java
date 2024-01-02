package Scenerio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Add_Element_to_cart_and_return_all_of_them {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		// List of product names to add to the cart
		List<String> productsToAdd = Arrays.asList("Cucumber", "Brocolli", "Tomato");

		// Get all products
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		// Iterate through the products to add
		for (String productName : productsToAdd) {
			for (int i = 0; i < products.size(); i++) {
				String currentProduct = products.get(i).getText();
				if (currentProduct.contains(productName)) {
					// Find the corresponding "ADD TO CART" button and click it
					driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
					break;
				}
			}
		}

		// You can add further logic here if needed
		Thread.sleep(2000);
		// Close the browser
		driver.quit();
	}
}
