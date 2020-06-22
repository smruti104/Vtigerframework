package com.vtiger.TestScripts;

import java.io.IOException;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.vtiger.ObjectRepositary.CreateLeadPageElements;
import com.vtiger.ObjectRepositary.HomePageElements;
import com.vtiger.ObjectRepositary.LeadInfoPageElements;
import com.vtiger.ObjectRepositary.LeadsPageElements;
import com.vtiger.genericlib.BaseClass;





public class CreateLeadTest extends BaseClass{
	@Test
	public void createLead() throws IOException{
		HomePageElements hp=PageFactory.initElements(driver,HomePageElements.class);
		LeadsPageElements lp=PageFactory.initElements(driver,LeadsPageElements.class);
		CreateLeadPageElements clp=PageFactory.initElements(driver,CreateLeadPageElements.class);
		LeadInfoPageElements lip=PageFactory.initElements(driver,LeadInfoPageElements.class);
		
	       hp.getLeads().click();
	       lp.getCreateLead().click();
	       clp.getLastnametb().sendKeys(data.getDataFromExcel("LeadData", 2, 1));
	       clp.getCompanytb().sendKeys(data.getDataFromExcel("LeadData", 2, 2));
	       clp.getSaveBtn().click();
	String actLeadMsg=lip.getSuccessMsg().getText();
		Assert.assertTrue(actLeadMsg.contains(data.getDataFromExcel("LeadData", 2, 3)));
}
}
