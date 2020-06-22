package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatePurchaseOrderPageElements {
	@FindBy(name="subject")
	private WebElement subjecttb;
	@FindBy(name="bill_street")
	private WebElement billingAddress;
	@FindBy(name="ship_street")
	private WebElement copyAdress;
	@FindBy(className="detailedViewTextBoxOn")
	private WebElement qty;
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement saveBtn;
	public WebElement getSubjecttb() {
		return subjecttb;
	}
	public WebElement getBillingAddress() {
		return billingAddress;
	}
	public WebElement getCopyAdress() {
		return copyAdress;
	}
	public WebElement getQty() {
		return qty;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	

	
}
