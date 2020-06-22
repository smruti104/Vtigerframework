package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseOrderInfoPageElements {
	@FindBy(xpath="//span[contains(text(),'Purchase Order Information')]")
	private WebElement successMsg;

	public WebElement getSuccessMsg() {
		return successMsg;
	}
}
