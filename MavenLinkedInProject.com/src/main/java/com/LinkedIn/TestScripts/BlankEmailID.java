package com.LinkedIn.TestScripts;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.LinkedIn.GenericUtilLibrary.SuperTestNG;
import com.LinkedIn.PageObjects.LoginPage;
import com.LinkedIn.TestData.ReadExcel;

public class BlankEmailID extends SuperTestNG {

	
	@Test()
	public void BlankEmailIDTest() throws InvalidFormatException {
		 Logger log = Logger.getLogger("devpinoyLogger");
		LoginPage lp =new LoginPage(driver);
		
		String user = ReadExcel.getCellValue("C:\\Srinivas Poojar\\Selenium Repository\\TestData\\TestData.xlsx\\", "Sheet1", 3,1);
		System.out.println(user);
		String pwd = ReadExcel.getCellValue("C:\\Srinivas Poojar\\Selenium Repository\\TestData\\TestData.xlsx\\", "Sheet1", 3,2);
		System.out.println(pwd);
		lp.login(user, pwd);
		
		Reporter.log("Testing complete for BlankEmail ID test case");
		String PageTitle = driver.getTitle();
		
		System.out.println(PageTitle);
		String TitleOfPage = "LinkedIn Login, LinkedIn Sign in | LinkedIn";
		Assert.assertEquals(TitleOfPage, PageTitle);
		log.trace("This is the TRACE log :Title of the page  matched and Test Case : BlankEmailID Passed");
		log.debug("This is the DEBUG log :Title of the page  matched and Test Case : BlankEmailID Passed **Here it failing**");
		log.info("This is the INFO log : Title of the page  matched and Test Case : BlankEmailID Passed");
		log.warn("This is WARN message : The server is down");
		log.error("This is ERROR message : The error is used to log the JAVA error and Exceptions");
		log.fatal("This is FATAL error : The application will lead to abort");
		
		
		
		
		
	}
}
