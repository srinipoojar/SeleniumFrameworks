package com.LinkedIn.GenericUtilLibrary;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class SuperTestNG {
	protected WebDriver driver;

	// Logger logger = (Logger) LogManager.getLogger(SuperTestNG.class);
	
	@Parameters("Browser")
	@BeforeMethod
	public void openBrowser(String Browser) {
		String url = "https://www.linkedin.com/";

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "/Users/AB77588/Downloads/chromedriver_win32/chromedriver.exe"); driver = new
		 * ChromeDriver();
		 */
		if (Browser.equalsIgnoreCase("FireFox")) {
			 System.setProperty("webdriver.gecko.driver",
					  "C:\\Srinivas Poojar\\Selenium Repository\\Selenium Jars\\geckodriver-v0.23.0-win64\\geckodriver.exe" );
					  driver = new FirefoxDriver();
					 
		}
		else if (Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/AB77588/Downloads/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
		}
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Srinivas Poojar\\Selenium Repository\\Selenium Jars\\geckodriver-v0.23.0-win64\\geckodriver.exe"
		 * ); driver = new FirefoxDriver();
		 */
		 
		Logger log = Logger.getLogger("devpinoyLogger");

		// org.apache.logging.log4j.Logger log = LogManager.getLogger("devpinoyLogger");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		log.debug("Test Message for Manual Log INFO");
		// log.info("Test Message for Manual Log INFO");
	}

	@AfterMethod()
	public void closeBrowser() {
		driver.quit();
	}

}