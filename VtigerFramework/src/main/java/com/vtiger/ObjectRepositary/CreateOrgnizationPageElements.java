package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateOrgnizationPageElements {
	@FindBy(name="accountname")
	private WebElement orgnametb;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement saveBtn;

	public WebElement getOrgnametb() {
		return orgnametb;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

}
