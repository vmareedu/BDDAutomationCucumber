package com.demoPOC.TestRunners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/TestScenarios/Sprint1.feature"
		,glue={""},monochrome = true, plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/Sprint1.html","html:target/cucumber-html-report"}
		)
 
public class RunCukesTest {
		
	@AfterClass
    public static void setup() {
        Reporter.loadXMLConfig(new File("./Configuration/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows 7");
        Reporter.setTestRunnerOutput("Release1 Testcases Execution Summary ");
    }
 
}