package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.util.TestBase;

public class LoginPage extends TestBase {
	//Page Factory or OR.
		@FindBy(xpath="//a[@href='https://freecrm.com']")
		WebElement logo;
		
		@FindBy(xpath = "//div/ul/a")
		WebElement login;
		
		@FindBy(name = "email")
		WebElement email;
		
		@FindBy(name = "password")
		WebElement passowrd;
		
		@FindBy(xpath = "//div[@class='ui fluid large blue submit button'][contains(text(), 'Login')]")
		WebElement loginbtn;
		
		//Now we have to initialize all these objct repositories with the help of page factory.
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		//Now i can define diff action need to perform.
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateLogo(){
			return logo.isDisplayed();
		}
		
		public HomePage loginIntoPage(String em, String pw){
			login.click();
			email.sendKeys(em);
			passowrd.sendKeys(pw);
			loginbtn.click();
			
			return new HomePage();
		}
	
}
