package com.demoPOC.step_definitions;

import org.testng.Assert;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.cucumber.listener.Reporter;
import com.demoPOC.bdd.BaseTest;
import com.demoPOC.pageFactory.MercuryPage;

public class TC01_LoginFlow_StepDef extends BaseTest {
	//Load the Page Object Class Login
	MercuryPage login = PageFactory.initElements(driver, MercuryPage.class);

	@Given("^Login Page is displayed$")
	public void Login_Page_is_displayed() throws Throwable {
		Reporter.addStepLog("Login Positive Scenario with Valid Credentials ");
	}

	@When("^Enter valid login credentials$")
	public void Enter_valid_login_credentials() throws Throwable {

		login.LoginApplication("mercury", "mercury");
		
		Reporter.addStepLog("Enter Valid Username and Password ");
		
	}

	@Then("^Validate the User after logging in to application$")
	public void Validate_the_User_after_logging_in_to_application() throws Throwable {

		Assert.assertTrue(login.VerifyHomePage(), "Home Page is displayed");
		Reporter.addStepLog("Verify the Home Page after Logging with Valid Credentials ");
	}

	@Given("^Launch the application$")
	public void Launch_the_application() throws Throwable {
		Reporter.addStepLog("Login Negative Scenario with Invalid Credentials ");
	}

	@When("^Enter Invalid login credentials$")
	public void Enter_Invalid_login_credentials() throws Throwable {

		login.LoginApplication("mercury", "mercury1");
		Reporter.addStepLog("Enter InValid Username and Password ");
	

	}

	@Then("^Validate Error Message is displayed$")
	public void Validate_Error_Message_is_displayed() throws Throwable {

		Assert.assertTrue(login.VerifySignOnPage(), "SignOn page is displayed on giving invalid credentials");
		Reporter.addStepLog("Verify the SigOn Page after Logging with Invalid Credentials ");
	}

}
