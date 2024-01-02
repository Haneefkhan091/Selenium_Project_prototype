package TAKESCREENSHOT;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class takescreenshot {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		driver = new ChromeDriver(option);

		driver.get("https://expired.badssl.com/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:/ScreenShot/s2.jpg"));
		driver.quit();
	}
}
