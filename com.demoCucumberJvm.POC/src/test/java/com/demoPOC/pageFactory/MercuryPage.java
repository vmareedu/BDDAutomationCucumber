package com.demoPOC.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demoPOC.bdd.BaseTest;

public class MercuryPage extends BaseTest {

	// Login Page Objects Properties-Object Repository
	
	@FindBy(name = "userName")
	WebElement Username;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "login")
	WebElement LoginButton;
	@FindBy(name="findFlights")
	WebElement findFlights;
	@FindBy(xpath="//img[@src='/images1/masts/mast_signon.gif']")
	WebElement SignOnnPage;
	// Enter Login Details
	public void LoginApplication(String username, String Password) {
	
		Username.sendKeys(username);
		password.sendKeys(Password);
		LoginButton.click();

	}

	public boolean  VerifyHomePage() {
		
		findFlights.isDisplayed();
		return true;
	
	}

	public boolean VerifySignOnPage() {
		SignOnnPage.isDisplayed();
		return true;
	
	}
	
}
