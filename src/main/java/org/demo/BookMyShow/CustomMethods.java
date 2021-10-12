package org.demo.BookMyShow;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomMethods extends BaseClass {
	
	/*
	 * This method is to click the Corresponding WebElement.
	 */
	
	public static void click(WebElement element, String log) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(element));

		try {
			element.click();
			System.out.println( log + " was clicked  successfully ");
		} catch (Exception e) {

			System.err.println( log + " wasn't clicked");
			throw new Error();
		}
	}
	
	/*
	 * This method is used to Print the Details We need.
	 */
	
	public static void ticketDetails(WebElement element,String log) {
	 try {	WebElement details = driver.findElement(By.xpath("element"));
			System.out.print("" +log+ "Details :" +details.getText());
			System.out.println("");
	} catch(Exception e) {
		    iTakeSnap();
		    System.err.println("" +log+ " Wasn't Printed");
		    throw new Error();
	}
	}
	/*
	 * This method is used to take Instantaneous snapshot.  
	 */
	
	public static long iTakeSnap() {
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;
        try {
            FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
                    new File("C:\\Users\\sraj\\eclipse-workspace\\Amazon\\Screenshot" + number + ".jpg"));
        } catch (WebDriverException | IOException e) {
        	System.err.println(e);
			System.err.println("Kindly verify the screenshot");
        }
        return number;
		
	}
	
	/*
	 * This method is used to find and click Random WebElement from list of WebElements available.
	 */
	
	public void findAndClick(WebElement element, String log) {
		Random random=new Random();
		List <WebElement> ele =driver.findElements(By.xpath("//div[contains(@id,'A_')]"));
		int x =ele.size();
		int r=random.nextInt(x);
		ele.get(r).click();
		System.out.println("" +log+ "is Selected Successfully");
	}
	
	/*
	 * This method is used to tearDown the Browser.
	 */
	
	public static void tearDown() {
		driver.quit();
		System.out.println("The Browser Has Been TearedDown");
	}
	
	

}
