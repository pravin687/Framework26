package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public LoginPage lp;
	public InventoryPage ip;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage getLopinPage() throws IOException {
		lp=new LoginPage(driver);
		return lp;
	}

	public InventoryPage getInventoryPage() throws IOException {
		ip=new InventoryPage(driver);
		return ip;
	}
}
