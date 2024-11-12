package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testBase.Testbase;

public class LoginPage{

	public WebDriver driver;
    public LoginPage(WebDriver driver) throws IOException {
    	this.driver=driver;
    	
    }

	private By username=By.cssSelector("#user-name");
	private By password=By.xpath("//input[@id='password']");
	private By loginButton=By.id("login-button");
	
	public void  launchBrowser() {
		driver.get("https://www.saucedemo.com");
	}
	
	public void setUsername(String name) {
		driver.findElement(username).sendKeys(name);
	}

	public void setPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clicklOnLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	public String getCurrentUrl() {
	 return	driver.getCurrentUrl().toString();
	}
}
