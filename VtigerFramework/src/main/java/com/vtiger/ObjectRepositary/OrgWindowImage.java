package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrgWindowImage {
	@FindBy(xpath="//input[@name='account_name']/following-sibling::img")
	
	private WebElement SelectWindow;

	public WebElement getSelectWindow() {
		return SelectWindow;
	}

	
}
