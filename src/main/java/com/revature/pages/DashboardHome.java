package com.revature.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardHome {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[6]/a/span")
	public WebElement trainings;
	
	public DashboardHome(WebDriver driver) {
		PageFactory.initElements(driver, this);		
		this.driver = driver;
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
	public void navToTrainings() {
		System.out.println(driver.getTitle() + "<===============");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		trainings.click();
	}
		
}
