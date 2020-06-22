package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrgPageElements {
	@FindBy(css="img[title='Create Organization...']")
	private WebElement createOrg;

	public WebElement getCreateOrg() {
		return createOrg;
	}
}
