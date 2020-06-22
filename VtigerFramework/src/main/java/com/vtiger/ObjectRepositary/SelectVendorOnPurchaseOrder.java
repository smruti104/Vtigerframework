package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectVendorOnPurchaseOrder {
	@FindBy(linkText="metadata")
	private WebElement metadata;
	public WebElement getMetadata() {
		return metadata;
	}
		
}
