package com.LinkedIn.TestScripts;


import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.LinkedIn.GenericUtilLibrary.SuperTestNG;
import com.LinkedIn.PageObjects.LoginPage;
import com.LinkedIn.TestData.ReadExcel;

public class BlankPassword extends SuperTestNG {
	
	@Test()
	public void TestForBlankPwd() throws InvalidFormatException{ 
		Logger log = Logger.getLogger("devpinoyLogger");
		LoginPage lp = new LoginPage(driver);
		
		//String user = ReadExcel.getCellValue("C:\\Srinivas Poojar\\Selenium Repository\\TestData\\BrowserAndURL.xlsx\\", "Sheet1", 4, 1);
		//String pwd = ReadExcel.getCellValue("C:\\Srinivas Poojar\\Selenium Repository\\TestData\\BrowserAndURL.xlsx\\", "Sheet1", 4, 2);
		
		
		String user = ReadExcel.getCellValue("C:\\Srinivas Poojar\\Selenium Repository\\TestData\\TestData.xlsx\\", "Sheet1", 4,1);
		System.out.println(user);
		String pwd = ReadExcel.getCellValue("C:\\Srinivas Poojar\\Selenium Repository\\TestData\\TestData.xlsx\\", "Sheet1", 4,2);
		System.out.println(pwd);
		
		lp.login(user, pwd);
		
		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
		String TitleOfPage = "LinkedIn Login, LinkedIn Sign in | LinkedIn";
		Assert.assertEquals(TitleOfPage, PageTitle);
		Reporter.log("Testing complete for BlankPassword ID test case");
		log.debug("BlankPassword Test case is passed");
		
	}
}
