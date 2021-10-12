package org.demo.BookMyShow;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestRunner extends BaseClass {
	
	@BeforeSuite
	
		public void browserLaunch() {
		browserInvoke("chrome");
		webpageNavigation("https://in.bookmyshow.com/explore/home/chennai");
		
	}
	
	@Test
	
	    public void ticketBooking() throws InterruptedException {
		PageObjects p=new PageObjects();
		p.homePage();
		p.ticketBooking();
		p.timeDetails();
		p.seatSelection();
		p.ticketSummary();
		
	}
	
	@AfterSuite
	
	public void browserDown() {
		CustomMethods.tearDown();
	}
	
	
	}


