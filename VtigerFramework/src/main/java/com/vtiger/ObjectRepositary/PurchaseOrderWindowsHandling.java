package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseOrderWindowsHandling {
@FindBy(xpath="//input[@name='vendor_name']/following-sibling::img")
	private WebElement SelectVendor;
public WebElement getSelectVendor() {
	return SelectVendor;
}


}
