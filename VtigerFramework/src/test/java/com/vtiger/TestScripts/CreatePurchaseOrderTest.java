package com.vtiger.TestScripts;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.vtiger.ObjectRepositary.CreatePurchaseOrderPageElements;
import com.vtiger.ObjectRepositary.HomePageElements;
import com.vtiger.ObjectRepositary.ItemSelectOnPurchaseOrder;

import com.vtiger.ObjectRepositary.PurchaseOrderInfoPageElements;
import com.vtiger.ObjectRepositary.PurchaseOrderWindowsHandling;
import com.vtiger.ObjectRepositary.PurchasePageElements;
import com.vtiger.ObjectRepositary.SelectVendorOnPurchaseOrder;
import com.vtiger.genericlib.BaseClass;

public class CreatePurchaseOrderTest extends BaseClass {
	@Test
	public void CreatePurchaseOrder() throws IOException {
		HomePageElements hp1=PageFactory.initElements(driver,HomePageElements.class);
		PurchasePageElements lp=PageFactory.initElements(driver,PurchasePageElements.class);
		CreatePurchaseOrderPageElements clp=PageFactory.initElements(driver,CreatePurchaseOrderPageElements.class);
		PurchaseOrderInfoPageElements pip=PageFactory.initElements(driver, PurchaseOrderInfoPageElements.class);
		PurchaseOrderWindowsHandling pimg=PageFactory.initElements(driver, PurchaseOrderWindowsHandling.class);
	SelectVendorOnPurchaseOrder select=PageFactory.initElements(driver,SelectVendorOnPurchaseOrder.class);
		ItemSelectOnPurchaseOrder lip=PageFactory.initElements(driver,ItemSelectOnPurchaseOrder.class);
		hp1.getMore().click();
		hp1.getPurchaseOrder().click();
		lp.getCreatePurchaseOrder().click();
		clp.getSubjecttb().sendKeys(data.getDataFromExcel("PurchaseOrderData", 2, 1));
		 pimg.getSelectVendor().click();
	        wlib.switchNewWindow();
	        select.getMetadata().click();
			//wlib.acceptAlert();
			wlib.switchToMainWindow();
			
		clp.getBillingAddress().sendKeys(data.getDataFromExcel("PurchaseOrderData", 2, 2));
		clp.getCopyAdress().sendKeys(data.getDataFromExcel("PurchaseOrderData", 2, 3));
		lip.getSelectItem().click();
		wlib.switchNewWindow();
        lip.getItem().click();
		//wlib.acceptAlert();
		wlib.switchToMainWindow();
			clp.getQty().sendKeys(data.getDataFromExcel("PurchaseOrderData", 2, 4));
			
			clp.getSaveBtn().click();
			String actPurchaseMsg=pip.getSuccessMsg().getText();
				Assert.assertTrue(actPurchaseMsg.contains(data.getDataFromExcel("PurchaseOrderData", 2, 5)));
		}
		
	}


