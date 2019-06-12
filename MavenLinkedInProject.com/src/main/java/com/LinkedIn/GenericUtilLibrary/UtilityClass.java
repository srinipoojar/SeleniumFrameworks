package com.LinkedIn.GenericUtilLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityClass {
	
	public static WebDriver driver;
	
	public static void systemPropertiesForChrome() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/AB77588/Downloads/chromedriver_win32/chromedriver.exe");
		
	}

	public static void systemPropertiesForMozilla() {
		System.setProperty("webdriver.gecko.driver", "C:\\Srinivas Poojar\\Selenium Repository\\Selenium Jars\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		
	}
	
	public static void systemPropertiesForIE() {
		System.setProperty("webdriver.ie.driver", "");
		
	}
	
	public static void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
	}
	
	
}

