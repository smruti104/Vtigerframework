package com.vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPageElements {
@FindBy(css="img[title='Create Product...']")
private WebElement createProduct;

public WebElement getCreateProduct() {
	return createProduct;
}

}
