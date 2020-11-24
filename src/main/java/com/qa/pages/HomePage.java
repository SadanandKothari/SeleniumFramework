package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.util.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath = "//span[@class='user-display']")
	WebElement identifyUser;
	
	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactLink;
	
	@FindBy(xpath = "//span[contains(text(),'Calendar')]")
	WebElement calendarLink;
	
	@FindBy(xpath = "//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public String verifyUsernameAtHomePage(){
		String actualUsername = identifyUser.getText();
		return actualUsername;
	}
	
	public ContactsPage clickOnContactLink(){
		contactLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink(){
		dealsLink.click();
		return new DealsPage();
	}
	
	public CalendarPage clickOnCalendarLink(){
		calendarLink.click();
		return new CalendarPage();
	}
}
