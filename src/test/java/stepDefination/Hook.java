package stepDefination;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import testBase.World;

public class Hook {
	public World world;
	public static ExtentReports extent;
	public Hook(World world) {
		this.world=world;
	}
	
	
	@After
	public void closeDriver() throws IOException {
		world.tb.launchDriver().quit();
	}
	
	public String getBase64ScreenShot() throws WebDriverException, IOException {
		return ((TakesScreenshot) world.tb.launchDriver()).getScreenshotAs(OutputType.BASE64);
	}
	
	@AfterStep
	public void afterStep(Scenario sc) throws WebDriverException, IOException {
		if(sc.isFailed()) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, MediaEntityBuilder
			.createScreenCaptureFromBase64String(getBase64ScreenShot()).build());
		}
		
	}

}
