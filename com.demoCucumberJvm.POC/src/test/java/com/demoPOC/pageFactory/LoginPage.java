package com.demoPOC.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoPOC.bdd.BaseTest;

public class LoginPage extends BaseTest {

	// Login Page Objects Properties-Object Repository
	@FindBy(id = "txtUserID")
	WebElement Username;
	@FindBy(id = "txtPassword")
	
	WebElement password;
	@FindBy(id = "sub")
	WebElement LoginButton;
	@FindBy(xpath = "//a[contains(.,'MCL Internal User')]")
	WebElement LoggedUsername;

	
	public LoginPage(){
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
	}

	// Enter Login Details
	public void LoginApplication(String username, String Password) {
		
		Username.sendKeys(username);
		password.sendKeys(Password);
		LoginButton.click();

	}

	public String VerifyHomePage() {
		String activeUsername = LoggedUsername.getText();
		return activeUsername;
		// ApplicationSpecific.VerifyValue(logger, "Username", activeUsername,
		// actVal);
	}


	
}
