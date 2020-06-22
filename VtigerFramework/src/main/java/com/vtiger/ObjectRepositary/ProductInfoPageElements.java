package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductInfoPageElements {
@FindBy(xpath="//span[contains(text(),'Product Information')]")
private WebElement sucessMsg;

public WebElement getSucessMsg() {
	return sucessMsg;
}

}
