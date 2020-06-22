package com.vtiger.genericlib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import com.vtiger.ObjectRepositary.HomePageElements;
import com.vtiger.ObjectRepositary.LoginPageElements;


public class BaseClass {
	public  static WebDriver driver;
	public DataUtility data=new DataUtility();
	public WebDrivercommonUtil wlib=new WebDrivercommonUtil();
	
	@BeforeSuite
	public void configBS(){
	System.out.println("..............Database connect..................");
	}
	
	@BeforeClass
	public void configBC() throws IOException{
		System.out.println(" ---Browser launching starts---");
		String browser=data.getDataFromProperty("browser");
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(data.getDataFromProperty("url"));
		System.out.println("---Browser launching ends---");
	
	}
	@BeforeMethod
	public void configBM() throws IOException{
	System.out.println("..............Login starts..................");
	LoginPageElements login=PageFactory.initElements(driver, LoginPageElements.class);
	login.loginToApp(data.getDataFromProperty("username"),data.getDataFromProperty("password"));
	System.out.println("..............Login ends..................");
	}
	@AfterMethod
	public void configAM(){
	System.out.println("..............Logout starts..................");
	HomePageElements hp=PageFactory.initElements(driver,HomePageElements.class);
	//hp.linkOnPurchaseOrder();
	hp.logoutFromApp();
	System.out.println(".....................Logout ends.......................");
	}
	@AfterClass
	public void configAC(){
		System.out.println("..............Close Browser..................");
		driver.quit();
	}
	@AfterSuite
	public void configAS(){
		System.out.println("..............Database DisConnect..................");
	}
}
