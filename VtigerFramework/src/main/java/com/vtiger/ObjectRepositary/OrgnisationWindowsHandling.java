package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrgnisationWindowsHandling {

@FindBy(linkText="ReadChip")
private WebElement ReadChip;

public WebElement getReadChip() {
	return ReadChip;
}

}
