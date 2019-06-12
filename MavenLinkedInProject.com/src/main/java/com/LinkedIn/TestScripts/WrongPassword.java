package com.LinkedIn.TestScripts;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.LinkedIn.GenericUtilLibrary.SuperTestNG;
import com.LinkedIn.GenericUtilLibrary.UtilityClass;
import com.LinkedIn.PageObjects.LoginPage;
import com.LinkedIn.TestData.ReadExcel;

public class WrongPassword extends SuperTestNG{
	
	
	@Test()
	public void wrongPasswordTest() throws InvalidFormatException   {
		Logger log = Logger.getLogger("devpinoyLogger");
		LoginPage lp = new LoginPage(driver);
		
		
		System.out.println("second program");
		String user = ReadExcel.getCellValue("C:\\Srinivas Poojar\\Selenium Repository\\TestData\\TestData.xlsx\\", "Sheet1", 2,1);
		String pwd = ReadExcel.getCellValue("C:\\Srinivas Poojar\\Selenium Repository\\TestData\\TestData.xlsx\\", "Sheet1", 2,2);
		lp.login(user, pwd);
		log.fatal("This is FATAL error : The application will lead to abort");
		
		
		
		/*
		 * UtilityClass.systemPropertiesForChrome(); driver = new ChromeDriver();
		 * driver.get("https://www.linkedin.com/"); driver.manage().window().maximize();
		 * driver.findElement(By.xpath("/html/body/nav/a[3]")).click();
		 * driver.findElement(By.xpath("//input[@id='username']")).sendKeys(
		 * "srini.poojar@gmail.com");
		 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys("xyz");
		 * driver.findElement(By.xpath("//*[@aria-label=\"Sign in\"]")).click();
		 */
		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
		String TitleOfPage = "LinkedIn Login, LinkedIn Sign in | LinkedIn";
		Assert.assertEquals(TitleOfPage, PageTitle);
		//Reporter.log("Testing complete for WrongPassword ID test case");
		log.debug("The test case WrongPassword is passed");
	}

}
