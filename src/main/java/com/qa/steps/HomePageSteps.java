package com.qa.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase{
	LoginPage loginpage = new LoginPage();
	HomePage homepage;
	@Given("^user open browser$")
	public void user_open_browser() throws Throwable {
		TestBase.initialization();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	 String title = loginpage.validateLoginPageTitle();
	 org.junit.Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
 	 loginpage = new LoginPage();
	 homepage =  loginpage.loginIntoPage(prop.getProperty("email"), prop.getProperty("password"));
	}

	@Then("^validate homepage title$")
	public void validate_homepage_title() throws Throwable {
		Thread.sleep(6000);
		String homePageTitle = homepage.verifyHomePageTitle();
		Assert.assertEquals("Cogmento CRM",homePageTitle);	   
	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username() throws Throwable {
		String verifyUsername = homepage.verifyUsernameAtHomePage();
		Assert.assertEquals("Sadanand Kothari",verifyUsername);
	}
    @And("^user close the browser$")
    public void user_close_the_browser() throws Throwable {
        driver.quit();
    }

}
