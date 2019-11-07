package com.revature.services;

import org.openqa.selenium.WebDriver;

import com.revature.pages.DashboardHome;
import com.revature.pages.LogIn;

public class NavigationService {
	
	/**
	 * Use credentials to log in. Called by the Driver Class. This method invokes the
	 * {@link com.revature.pages.LogIn.enterCreds} method 
	 * @param username
	 * @param password
	 * @param driver
	 * WebDriver object
	 */
	public void logIn(String username, String password, WebDriver driver) {
		// create object representation of LogIn page
		LogIn login = new LogIn(driver);
		//method from com.revature.pages.Login
		login.enterCreds(username, password);
	}
	
	/**
	 * This method is meant to navigate from the Home page to the list of trainings
	 * @param driver
	 * WebDriver object
	 */
	public void navToTrainings(WebDriver driver) {
		DashboardHome dh = new DashboardHome(driver);
		dh.navToTrainings();
	}
}
