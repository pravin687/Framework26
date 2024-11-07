package stepDefination;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import testBase.Testbase;
import testBase.World;

public class LoginSteps {
	public LoginPage lp;
	public World world;
	
	
	public LoginSteps(World world) throws IOException{
		this.world=world;//step 1
		this.lp=world.po.getLopinPage();//step 2
	}
	

	@Given("I am on the saucedemo login page")
	public void iAmOnTheSauceDemoLoginPage() {
		lp.launchBrowser();
	}
	
	@When("I entered valid username and password")
	public void iEneteredValidUsernameAndPassword() {
		lp.setUsername("standard_user");
		lp.setPassword("secret_sauce");
	}
	
	@And("I click on login button")
	public void iClickOnLoginButton() {
		lp.clicklOnLoginButton();
	}
	
	@Then("I verify user land on home page")
	public void iverifyUserLandOnHomePage() {
		Assert.assertEquals(lp.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
	}
}
