package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe_handling_DragDropable {
    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));
        driver.switchTo().frame(iframe);

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        // Create Actions class instance
        Actions actions = new Actions(driver);

        // Perform drag-and-drop
        actions.dragAndDrop(draggable, droppable).build().perform();

        // Switch back to the default content
//        driver.switchTo().defaultContent();

        // Close the browser
//        driver.quit();
    }
}
