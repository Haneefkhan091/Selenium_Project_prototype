package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginHRM {

    WebDriver driver;

    public LoginHRM(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.xpath("//input[@placeholder='Username']");
    By password = By.xpath("//input[@placeholder='Password']");
    By loginButton = By.xpath("//button[normalize-space()='Login']");
    By textforlogin = By.xpath("//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials']");

    public WebElement getUsername() {
        return driver.findElement(username);
    }

    public WebElement getPassword() {
        return driver.findElement(password);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }
    
    public WebElement getlogintext() {

    	return driver.findElement(textforlogin);

	}
}
