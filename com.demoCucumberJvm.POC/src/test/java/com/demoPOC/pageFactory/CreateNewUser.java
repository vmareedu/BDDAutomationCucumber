package com.demoPOC.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demoPOC.bdd.BaseTest;

public class CreateNewUser extends BaseTest {
	// Login Page Objects Properties-Object Repository
		public static @FindBy(id = "actionBtn")
		WebElement ActionButton;
		@FindBy(xpath = ".//*[@id='createUser']")
		WebElement CreateUserLink;
		@FindBy(id = "username")
		WebElement username;
		@FindBy(id = "password")
		WebElement password;
		@FindBy(id = "newUserBtn")
		WebElement CreateuserButton;

		public void ClickonCreateUserLink() {
			CreateUserLink.click();

		}

		public void enterNewUserDetails(String Username, String Password) {
			username.sendKeys(Username);
			password.sendKeys(Password);

		}

		public void ClickonCreateUserButton() {
			CreateuserButton.click();

		}
	}

