package com.demoPOC.step_definitions;
import org.testng.Assert;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.cucumber.listener.Reporter;
import com.demoPOC.bdd.BaseTest;

import com.demoPOC.pageFactory.MercuryPage;


public class TC02_LoginFlow_StepDef2 extends BaseTest
{
	MercuryPage login = PageFactory.initElements(driver, MercuryPage.class);
	
	@Given("^Open Demo website$")
	public void Open_Demo_website() throws Throwable
	{
		Reporter.addStepLog("Login Positive Scenario with Valid Credentials ");	
	}

	@When("^Enter Login Details \"([^\"]*)\" \"([^\"]*)\"$")
	public void Enter_Login_Details(String username, String password) throws Throwable {
		
		login.LoginApplication(username, password);
		Reporter.addStepLog("Enter Valid Username and Password ");
		
	}

	@And("^Click submit button$")
	public void Click_submit_button() throws Throwable
	{
		
		Assert.assertTrue(login.VerifyHomePage(), "Home Page is displayed");
		Reporter.addStepLog("Verify the Home Page after Logging with Valid Credentials ");	
	}


	@Then("^Verify Home page and verify title$")
	
	public void Verify_Home_page_and_verify_title() throws Throwable {
		
		Assert.assertTrue(login.VerifyHomePage(), "Home Page is displayed");
		Reporter.addStepLog("Verify the Home Page after Logging with Valid Credentials ");	
	}
}
