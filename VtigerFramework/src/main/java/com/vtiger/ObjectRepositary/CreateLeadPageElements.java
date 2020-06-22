package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLeadPageElements {
	@FindBy(name="lastname")
	private WebElement lastnametb;
	
	@FindBy(name="company")
	private WebElement companytb;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement saveBtn;

	public WebElement getLastnametb() {
		return lastnametb;
	}

	public WebElement getCompanytb() {
		return companytb;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
}
