package WebsiteNeedProxy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IF_A_WEBSITE_NEED_PROXY {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		
driver.get("https://expired.badssl.com/");
	}
}
