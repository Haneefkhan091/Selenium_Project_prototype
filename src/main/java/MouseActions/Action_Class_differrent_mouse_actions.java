package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Class_differrent_mouse_actions {
    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.daraz.pk/");

        // Example 1: Move to an element
        Actions mouse = new Actions(driver);
        mouse.moveToElement(driver.findElement(By.id("q"))).build().perform();

        // Example 2: Perform a right-click on an element
        WebElement rightClickElement = driver.findElement(By.id("q"));
        mouse.contextClick(rightClickElement).build().perform();

        // Example 3: Drag and drop
//        WebElement sourceElement = driver.findElement(By.id("yourSourceElementId"));
//        WebElement targetElement = driver.findElement(By.id("yourTargetElementId"));
//        mouse.dragAndDrop(sourceElement, targetElement).build().perform();

        // Example 4: Double click on an element
        WebElement doubleClickElement = driver.findElement(By.id("q"));
        doubleClickElement.sendKeys("Armour");
        mouse.doubleClick(doubleClickElement).build().perform();

        // Example 5: Move by offset (relative to current mouse position)
        mouse.moveByOffset(50, 50).build().perform();

        // Example 6: Click and hold, then release
//        WebElement clickAndHoldElement = driver.findElement(By.id("yourClickAndHoldElementId"));
//        mouse.clickAndHold(clickAndHoldElement).build().perform();
//        mouse.release().build().perform();

        // Close the browser
//        driver.quit();
    }
}
