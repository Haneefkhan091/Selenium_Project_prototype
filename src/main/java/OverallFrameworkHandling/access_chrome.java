package OverallFrameworkHandling;

import objectrepository.*;

import java.time.Duration;
import org.testng.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ApacheLogs.log24j;
//import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import OverallFrameworkHandling.*;
public class access_chrome extends propertiesaccess_setup_chrome {
	public static WebDriver driver;
	public static final Logger log = LogManager.getLogger(propertiesaccess_setup_chrome.class.getName());
	@Test(dataProvider = "loginData")
	public static void setup(String username, String password) {
		WebDriverManager.chromedriver().setup();
		propertiesaccess_setup_chrome webDriverSetup = new propertiesaccess_setup_chrome();

		driver = webDriverSetup.initializeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(BASE_URL);
		LoginHRM login = new LoginHRM(driver);
		System.out.println(login.getlogintext().getText());

		Assert.assertEquals(login.getlogintext().getText().replaceAll("\\s+", " "),
				"Username : Admin Password : admin1a23");
		login.getUsername().sendKeys(username);
		login.getPassword().sendKeys(password);
		login.getLoginButton().click();
	}

	@DataProvider(name = "loginData")
	public Object[][] getLoginData() {
		// You can modify this method to provide different sets of username and password
		return new Object[][] { { "Admin", "admin2123" },
				// Add more data sets as needed
		};
	}
}
