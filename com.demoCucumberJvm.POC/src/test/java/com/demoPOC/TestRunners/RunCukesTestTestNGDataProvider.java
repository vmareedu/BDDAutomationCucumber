package com.demoPOC.TestRunners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.testng.CucumberFeatureWrapper;
import java.io.File;
import java.util.List;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.runtime.model.CucumberFeature; 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/TestScenarios/"
		,glue={""},monochrome = true, plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/Sprint2.html","html:target/cucumber-html-report"}
		)
 
public class RunCukesTestTestNGDataProvider {
	
	private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
    
    	 
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
        
    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
       
    }

    @AfterTest
    public void tearDownClass() throws Exception {
    	Reporter.loadXMLConfig(new File("./Configuration/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows 7");
        Reporter.setTestRunnerOutput("Release1 Testcases Execution Summary ");
        testNGCucumberRunner.finish();
    }
 


}