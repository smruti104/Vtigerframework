package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import com.vtiger.genericlib.BaseClass;


public class HomePageElements extends BaseClass {
	@FindBy(linkText="Leads")
	private WebElement leads;

@FindBy(linkText="Organizations")
private WebElement organizations;

@FindBy(linkText="Products")
private WebElement products;

@FindBy(linkText="More")
private WebElement More;
@FindBy(linkText="Purchase Order")
private WebElement PurchaseOrder;
@FindBy(xpath="//span[text()=' Administrator']/../following-sibling::td[1]/img")
private WebElement signoutDD;

@FindBy(linkText="Sign Out")
private WebElement signoutLink;

public WebElement getLeads() {
	return leads;
}

public WebElement getOrganizations() {
	return organizations;
}

public WebElement getProducts() {
	return products;
}
public WebElement getMore() {
	return More;
}
public WebElement getPurchaseOrder() {
	return PurchaseOrder;
}

public WebElement getSignoutDD() {
	return signoutDD;
}

public WebElement getSignoutLink() {
	return signoutLink;
}
/*public void linkOnPurchaseOrder() {
	wlib.keepMouseElement(More);
	PurchaseOrder.click();
}*/

public void logoutFromApp() {
	wlib.keepMouseElement(signoutDD);
	signoutLink.click();
}
}
