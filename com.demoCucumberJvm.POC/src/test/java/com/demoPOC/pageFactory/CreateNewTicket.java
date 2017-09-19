package com.demoPOC.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demoPOC.bdd.BaseTest;
import com.demoPOC.helpers.Utils;


public class CreateNewTicket extends BaseTest {
	// Login Page Objects Properties-Object Repository
	@FindBy(xpath = ".//*[@id='createTicket']")
	WebElement CreateTicketLink;
	@FindBy(id = "customer")
	WebElement CustomerName;
	@FindBy(id = "description")
	WebElement Description;
	@FindBy(id = "attachment")
	WebElement Attachment;
	@FindBy(id = "status")
	WebElement TicketStatus;
	@FindBy(id = "technician")
	WebElement Technician;
	@FindBy(id = "submitTicketBtn")
	WebElement SubmitTicketButton;

	public void ClickonCreateTicket() {
		CreateTicketLink.click();

	}

	public void enterNewTicketDetails(String CustName, String DescriptionText, String AttachmentName, String Status,
			String TechnicianName) {
		Utils.selectElementByNameMethod(CustomerName, CustName);
		Description.sendKeys(DescriptionText);
		Attachment.sendKeys(AttachmentName);
		Utils.selectElementByNameMethod(TicketStatus, Status);
		Utils.selectElementByNameMethod(Technician, TechnicianName);

	}

	public void ClickonsubmitTicketButton() {
		SubmitTicketButton.click();

	}

}
