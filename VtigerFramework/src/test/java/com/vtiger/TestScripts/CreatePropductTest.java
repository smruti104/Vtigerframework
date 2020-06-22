package com.vtiger.TestScripts;

import java.io.IOException;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.vtiger.ObjectRepositary.CreateProductPageElements;
import com.vtiger.ObjectRepositary.HomePageElements;
import com.vtiger.ObjectRepositary.ProductInfoPageElements;
import com.vtiger.ObjectRepositary.ProductPageElements;
import com.vtiger.genericlib.BaseClass;

public class CreatePropductTest extends BaseClass{
	@Test
	public void CreateProduct() throws IOException{
		HomePageElements hp=PageFactory.initElements(driver, HomePageElements.class);
		ProductPageElements lp=PageFactory.initElements(driver, ProductPageElements.class);
		CreateProductPageElements clp=PageFactory.initElements(driver,CreateProductPageElements.class);
		ProductInfoPageElements lip=PageFactory.initElements(driver, ProductInfoPageElements.class);
		hp.getProducts().click();
		lp.getCreateProduct().click();
		clp.getProductnametb().sendKeys(data.getDataFromExcel("ProductData", 2, 1));
		clp.getSaveBtn().click();
		String actProductMsg=lip.getSucessMsg().getText();
		Assert.assertTrue(actProductMsg.contains(data.getDataFromExcel("ProductData", 2, 2)));
		
	}
	}

