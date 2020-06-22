package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateProductPageElements {
@FindBy(name="productname")
private WebElement productnametb;

@FindBy(xpath="//input[@value='  Save  ']")
private WebElement saveBtn;

public WebElement getProductnametb() {
	return productnametb;
}

public WebElement getSaveBtn() {
	return saveBtn;
}

}
