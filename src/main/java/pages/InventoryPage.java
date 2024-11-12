package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
	public WebDriver driver;
    public InventoryPage(WebDriver driver) throws IOException {
    	this.driver=driver;
    	
    }

	private By addToCartSauceLabsBackpack=By.cssSelector("#add-to-cart-sauce-labs-backpack");
	private By removeSauceLabsBackpack=By.cssSelector("#remove-sauce-labs-backpack");


	
	public void clickOnAddToCartSauceLabsBackpack() {
		driver.findElement(addToCartSauceLabsBackpack).click();
	}
	
	public String getRemoveSauceLabsBackpackText() {
		return driver.findElement(removeSauceLabsBackpack).getText();
	}
	
	public void deleteCookies() {
		driver.manage().deleteAllCookies();
	}

}
