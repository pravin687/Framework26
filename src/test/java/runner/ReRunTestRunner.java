package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/rerun.txt", glue="stepDefination",monochrome=true,
plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/rerun.txt"}
)

public class ReRunTestRunner extends AbstractTestNGCucumberTests{
	
}
