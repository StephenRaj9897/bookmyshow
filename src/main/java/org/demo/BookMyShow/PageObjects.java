package org.demo.BookMyShow;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PageObjects extends CustomMethods {
	
	public PageObjects() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}
	
	@FindBy(xpath="//button[@id='wzrk-cancel']")
	public WebElement personalizedpopup;
	
	@FindBy(xpath="//div[contains(text(),'No Time To Die')]")
	public WebElement movieName;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/section[1]/div/div/div[2]/div[2]/div/button/div")
	public WebElement ticketbooking;
	
	@FindBy(xpath="(//div[@class='styles__DimensionComponent-sc-vhz3gb-3 eQxBjq'])[5]")
	public WebElement languageSelection;
	
	@FindBy(xpath="(//div[@class='date-numeric'])[3]")
	public WebElement DateSelection;
	
	@FindBy(xpath="(//a[@class='showtime-pill'])[2]")
	public WebElement ShowTime;
	
	@FindBy(xpath="//div[@id='btnPopupAccept']")
	public WebElement Notes;
	
	@FindBy(xpath="//li[@id='pop_1']")
	public WebElement NumberofSeats;
	
	@FindBy(xpath="//div[@id='proceed-Qty']")
	public WebElement SelectSeatsButton;
	
	@FindBy(xpath="//div[contains(@id,'A_')]")
	public WebElement SeatNumber;
	
	@FindBy(xpath="(//a[@id='btmcntbook'])[1]")
	public WebElement TicketFare;
	
	@FindBy(xpath="//div[@class='order-summarywrap']")
	public WebElement Ticketsummary;
	
	@FindBy(xpath="//span[@id='ttPrice']")
	public WebElement TicketPrice;
	

	
	public void homePage() throws InterruptedException {
		click(personalizedpopup,"Personalized Popup");
		click(movieName,"No Time to Die Movie");
		
	}
	
	public void ticketBooking() throws InterruptedException {
		Thread.sleep(2000);
		click(ticketbooking,"Book Tickets");
		Thread.sleep(2000);
		click(languageSelection,"Language Options");
	}
	
	public void timeDetails() throws InterruptedException {
		Thread.sleep(10000);
		click(DateSelection,"Date Selection");
		click(ShowTime,"Show Time");
		click(Notes, "Guidelines Popup");
		click(NumberofSeats,"Number of Seats");
		click(SelectSeatsButton,"Seats Selection Button");
			
	}
	
	public void seatSelection() throws InterruptedException {
		findAndClick(SeatNumber,"Seat Number");
		click(TicketFare,"Ticket Charge");
	}
	
	public void ticketSummary() {
		ticketDetails(Ticketsummary,"Ticket Summary");
		ticketDetails(TicketPrice,"Total Ticket Fare");
	}
	

}
