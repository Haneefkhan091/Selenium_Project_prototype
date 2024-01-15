package objectrepository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginaccess {

	public static WebDriver driver;

	@Test
	public static void login() {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		LoginHRM loginPage = new LoginHRM(driver);
		loginPage.getUsername().sendKeys("Admin");
		loginPage.getPassword().sendKeys("admin123");
		loginPage.getLoginButton().click();

	}

}
