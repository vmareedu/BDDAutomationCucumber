package com.demoPOC.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demoPOC.bdd.BaseTest;
import com.demoPOC.helpers.Utils;

public class StaffSearch extends BaseTest {
	// Login Page Objects Properties-Object Repository
	@FindBy(xpath = "//a[@aria-label='menu Search']")
	WebElement clickSearch;
	@FindBy(xpath = ".//*[@id='pyNavigation1498767951640']/li[1]/a/span/span")
	WebElement clickEntity;
	@FindBy(id = "SearchCriteria1")
	WebElement individual;
	@FindBy(id = "SearchCriteria2")
	WebElement BusinessEntity;
	@FindBy(id = "LastName")
	WebElement lastname;
	@FindBy(id = "FirstName")
	WebElement firstname;
	@FindBy(id = "DateOfBirth")
	WebElement DOB;
	@FindBy(xpath = ".//*[@id='RULE_KEY']/div/div/div/div[4]/div/div/span/button")
	WebElement searchBtn;
	@FindBy(xpath=".//*[@id='pyNavigation1498767951640']/li[1]/a/span/span")
	WebElement clear;

	public void searchBy(String lastname, String FirstName, String dateofBirth) {

		individual.sendKeys(lastname);
		BusinessEntity.sendKeys(FirstName);
		DOB.sendKeys(dateofBirth);

	}

	public void ClickSearch() {
		searchBtn.click();

	}
	public void ClickClear() {
		clear.click();

	}

}
