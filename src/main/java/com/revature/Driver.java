package com.revature;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.revature.pages.LogIn;
import com.revature.services.NavigationService;

public class Driver {

	static WebDriver driver;
	static String url = "https://rev2.lightning.force.com/";

	/*
	 * This is where all the magic happens... Since this application lacks a
	 * Controller layer, the main method will be used to call other methods in
	 * this class, which then call methods in the Page Object Model classes
	 */
	public static void main(String[] args) throws InterruptedException {
		// use Selenium WebDriver to open the browser at the given URL (this is THE
		// standard way of doing this)
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:\\Users\\Revature\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get(url);
		
		//Login to SalesForce (hardcoded for now)
		logIn("email", "password");
		
		//Navigate to page that displays trainings
		navToTrainings();
		
		//Close the browser
//		driver.quit();
	}
	
	/**
	 * Logs into SalesForce using the given username and password
	 * Invokes the enterCreds method from the LogIn class
	 * @param username
	 * Credential for username
	 * @param password
	 * Credential for password
	 * @param driver
	 * WebDriver object used to open the browser
	 */
	public static void logIn(String username, String password) {
		NavigationService ns = new NavigationService();
		ns.logIn(username, password, driver);
	}
	
	public static void navToTrainings() throws InterruptedException {
		Thread.sleep(20000); //<---temporary hotfix...I know it sucks
		NavigationService ns = new NavigationService();
		ns.navToTrainings(driver);
	}

}
