package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchasePageElements {
	@FindBy(css="img[title='Create Purchase Order...']")
	private WebElement createPurchaseOrder;

	public WebElement getCreatePurchaseOrder() {
		return createPurchaseOrder;
	}
}
