package com.vtiger.TestScripts;

import java.io.IOException;
import java.util.Random;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.vtiger.ObjectRepositary.CreateOrgnizationPageElements;
import com.vtiger.ObjectRepositary.HomePageElements;

import com.vtiger.ObjectRepositary.OrgInfoPageElements;
import com.vtiger.ObjectRepositary.OrgPageElements;
import com.vtiger.ObjectRepositary.OrgWindowImage;
import com.vtiger.ObjectRepositary.OrgnisationWindowsHandling;
import com.vtiger.genericlib.BaseClass;

public class CreateOrgnazationTest extends BaseClass {
	@Test
	public void createOrg() throws IOException{
		HomePageElements hp=PageFactory.initElements(driver,HomePageElements.class);
		OrgPageElements lp=PageFactory.initElements(driver,OrgPageElements.class);
		CreateOrgnizationPageElements clp=PageFactory.initElements(driver,CreateOrgnizationPageElements.class);
		OrgInfoPageElements lip=PageFactory.initElements(driver,OrgInfoPageElements.class);
		OrgWindowImage img=PageFactory.initElements(driver, OrgWindowImage.class);
		OrgnisationWindowsHandling org=PageFactory.initElements(driver, OrgnisationWindowsHandling.class);
	       hp. getOrganizations().click();
	       lp.getCreateOrg().click();
	       String orgName = data.getDataFromExcel("OrganisationData", 2, 1);
			Random r = new Random();
			int num = r.nextInt(9999);
			orgName = orgName + num;
	        clp.getOrgnametb().sendKeys(orgName);
	        img.getSelectWindow().click();
	        wlib.switchNewWindow();
	        org.getReadChip().click();
			wlib.acceptAlert();
			wlib.switchToMainWindow();
	       clp.getSaveBtn().click();
	String actOrgMsg=lip.getSuccessMsg().getText();
		Assert.assertTrue(actOrgMsg.contains(data.getDataFromExcel("OrganisationData", 2, 2)));
}
}
