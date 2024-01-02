package Static_and_Dynamic_Dropdowns;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggest_dropdown {

	public static WebDriver driver;

public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub
driver=new ChromeDriver();

WebDriverManager.chromedriver().setup();

driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

driver.findElement(By.id("autosuggest")).sendKeys("pak");

Thread.sleep(3000);

List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

for(WebElement option :options)

{

if(option.getText().equalsIgnoreCase("Pakistan"))

{

option.click();

break;

}

}

}
}

