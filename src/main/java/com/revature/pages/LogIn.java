package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	@FindBy(xpath="//input[@name='username']")
	public WebElement username;
	@FindBy(xpath="//input[@name='pw']")
	public WebElement password;
	@FindBy(xpath="//input[@name='Login']")
	public WebElement Log;
	
	public LogIn(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}
	
	/**
	 * This method is used to enter user credentials into the Login page of Salesforce
	 * It grabs the input element with the id of "username" and inputs the username string.
	 * It then grabs the element with an id called "pw"
	 * @param user
	 * String representing the username credential
	 * @param pass
	 * String representing the password credential
	 */
	public void enterCreds(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);	
		Log.click();
		
	}
}
