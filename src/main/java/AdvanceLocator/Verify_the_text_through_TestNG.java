package AdvanceLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_the_text_through_TestNG {
    public static WebDriver driver;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
    }

    @Test
    public void testLogin() throws InterruptedException {
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();

        String actualText = driver.findElement(By.xpath("//form[@class='form']")).getText();
        String expectedPartialText = "Sign in\nRemember my username";
        String expectedText = "Sign in\nRemember my username\nI agree to the terms and privacy policy.\nForgot your password?\nSIGN IN";
        // Assertion
        Assert.assertEquals(actualText, expectedText, "Text does not match!");
        // Assertion
        Assert.assertTrue(actualText.contains(expectedPartialText), "Partial text is not present!");

        Thread.sleep(4000);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
