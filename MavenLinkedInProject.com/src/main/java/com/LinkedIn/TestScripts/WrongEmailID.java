package com.LinkedIn.TestScripts;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.LinkedIn.GenericUtilLibrary.SuperTestNG;
import com.LinkedIn.PageObjects.LoginPage;
import com.LinkedIn.TestData.ReadExcel;

public class WrongEmailID extends SuperTestNG {
	

	
    
	@Test()
	public void wrongEmailIdTest() throws InvalidFormatException {
		Logger log = Logger.getLogger("devpinoyLogger");
		LoginPage lp=new LoginPage(driver);
		System.out.println("second program");
		String user = ReadExcel.getCellValue("C:\\Srinivas Poojar\\Selenium Repository\\TestData\\TestData.xlsx\\", "Sheet1", 1,1);
		String pwd = ReadExcel.getCellValue("C:\\Srinivas Poojar\\Selenium Repository\\TestData\\TestData.xlsx\\", "Sheet1", 1,2);
		lp.login(user, pwd);
		
		//String user = DataFromXls.getCellValue("./BrowserAndURL.xlsx", "Sheet1", 1, 1);
		
        //String pass = GenericUtilLibrary.getCellValue("./BrowserAndURL.xlsx", "Sheet1", 1, 2);
		System.out.println("clicked on signin button");
		 //driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
		 //driver.findElement(By.xpath("//*[@aria-label=\"Sign in\"]")).click();
		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
		String TitleOfPage = "LinkedIn Login, LinkedIn Sign in | LinkedIn";
		Assert.assertEquals(TitleOfPage, PageTitle);
		Reporter.log("Testing complete for WrongEmailID ID test case");
		log.debug("The test case WrongEmailID is passed");
				 
	}
}

