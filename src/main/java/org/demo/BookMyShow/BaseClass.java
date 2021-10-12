package org.demo.BookMyShow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	/*
	 * This method is to Invoke the Browser as per User's Input. 
	 */
	
	
	public static void browserInvoke(String browser) {

		if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			System.err.println("Please choose the Correct Browser");
		}
		driver.manage().window().maximize();
		System.out.println(browser + "Browser Invoked");
	}
	
	/*
	 * This method is used to Navigate to Corresponding URL.
	 */
	
	public static void webpageNavigation(String url) {
		driver.get(url);
		System.out.println("URL Lanunched Succesfully :" + url);
	}

}
