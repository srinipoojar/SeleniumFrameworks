package com.LinkedIn.PageObjects;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Return;

public class LoginPage {

	protected WebDriver driver;

	 @CacheLookup 
	  @FindBy(xpath="/html/body/nav/a[3]") //used id locator here because its best
	 // in performance, you can use other locators as well
	  public WebElement SignInButton;
	 
	 @CacheLookup
	 @FindBy(xpath="//input[@id='username']")
	 public WebElement UserName;
	 
	 
	 @CacheLookup
	 @FindBy(xpath="//*[@aria-label=\"Sign in\"]")
	 public WebElement SignInButtonClick;
	 
	 @CacheLookup
	 @FindBy(xpath="//input[@id='password']")
	 public WebElement Password;
	 
	 public WebElement Password() {
		 return Password;
	 }
	 
	   public WebElement SignInButton(){
	        return SignInButton;
	   }
	   
	   public WebElement UserName() {
		   return UserName;
	   }
	   
	   public WebElement  SignInButtonClick() {
		   return SignInButtonClick;
	   }
	  public LoginPage(WebDriver driver){ //create a constructor to invoke the page
	 // factory to initialize/load all the webelements present in page class
	  this.driver = driver; 
	  PageFactory.initElements(driver, this); //here 'this'
	  //is the keyword to invoke the same class members
	  
	  }
	 

	public void login(String user, String pwd){
	    	
	        
	     
	        SignInButton.click();
	        UserName.sendKeys(user);
	        Password.sendKeys(pwd);
	        SignInButtonClick.click();
	        
	}
	 
}