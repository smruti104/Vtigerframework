package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemSelectOnPurchaseOrder {
@FindBy(xpath="//input[@name='productName1']/following-sibling::img")
	
	private WebElement SelectItem;

@FindBy(linkText="a")
private WebElement Item;

public WebElement getSelectItem() {
	return SelectItem;
}

public WebElement getItem() {
	return Item;
}


}
