package stepDefination;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InventoryPage;
import pages.LoginPage;
import testBase.Testbase;
import testBase.World;

public class InventorySteps {
	public InventoryPage ip;
	public World world;
	
	
	public InventorySteps(World world) throws IOException{
		this.world=world;//step 1
		this.ip=world.po.getInventoryPage();
	}
	
	@When("I click on add to cart for sauce lab backpack")
	public void i_click_on_add_to_cart_for_sauce_lab_backpack() {
      ip.clickOnAddToCartSauceLabsBackpack();
	}
	@Then("I verify remove tag for added product")
	public void i_verify_remove_tag_for_added_product() {
    Assert.assertEquals("Remov", ip.getRemoveSauceLabsBackpackText());
	}
	
	@When("I click on remove button for add to cart for sauce lab backpack")
	public void i_click_on_remove_button_for_add_to_cart_for_sauce_lab_backpack() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("I verify Add to cart for sauce lab backpack button")
	public void i_verify_add_to_cart_for_sauce_lab_backpack_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	

}
