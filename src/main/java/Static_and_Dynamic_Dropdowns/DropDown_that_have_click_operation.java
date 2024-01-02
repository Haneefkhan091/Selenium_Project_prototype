package Static_and_Dynamic_Dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_that_have_click_operation {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// Static dropdown
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		System.out.print(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		int i = 1;
		while (i < 5)
		{

//			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			driver.findElement(By.id("hrefIncAdt")).click();
//			driver.findElement(By.cssSelector("#btnclosepaxoption")).click();// 4 times
			i++;

		}
		driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
		System.out.print(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		
		//Using for loop we can still achieve this
		
//		for(int i=1;i<5;i++)
//
//		{
//
//		driver.findElement(By.id("hrefIncAdt")).click();
//
//		}
		
		
	}

}
