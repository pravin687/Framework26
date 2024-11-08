package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue="stepDefination",monochrome=true,
tags="@Sanity",
plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/rerun.txt"}
)

public class TestRunner extends AbstractTestNGCucumberTests{
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
	
}
