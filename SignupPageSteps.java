package com.instalanes.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.instalanes.factory.DriverFactory;
import com.instalanes.pages.SignupPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupPageSteps {
	WebDriver driver;

	
	@When("user enters Firstname as {string}")
	public void user_enters_firstname_as(String Firstname) throws InterruptedException {
		DriverFactory driverFactory = new DriverFactory();
		driver = driverFactory.initializeDriver("chrome");
		Thread.sleep(3000);
		SignupPage sp = new SignupPage(driver);
		driver.get("https://frontendnewopt.vercel.app/register");
		Thread.sleep(3000);
        sp.setFrstName(Firstname);
		Thread.sleep(3000);
	}

	@When("user enters Lastname as {string}")
	public void user_enters_lastname_as(String Lastname) throws InterruptedException {
		SignupPage sp = new SignupPage(driver);
		sp.setLstName(Lastname);
		Thread.sleep(3000);
	}

	@When("user click organisation role dropDown")
	public void user_click_organisation_role_drop_down() {
		SignupPage sp = new SignupPage(driver);
		sp.dpOrg();
	}
//
//	@When("user select organisation role option")
//	public void user_select_organisation_role_option() {
//	   
//	}
//
//	@When("user click  code dropDown")
//	public void user_click_code_drop_down() {
//	    
//	}
//
//	@When("user select code option")
//	public void user_select_code_option() {
//	   
//	}
//
//	@When("user enters number as {string}")
//	public void user_enters_number_as(String string) {
//	    
//	}
//
//	@When("user enters email as {string}")
//	public void user_enters_email_as(String string) {
//	   
//	}
//
//	@When("user enters password as {string}")
//	public void user_enters_password_as(String string) {
//	   
//	}
//
//	@When("user click on sign-up button")
//	public void user_click_on_sign_up_button() {
//	    
//	}
//
//	@Then("user should see a confirmation message")
//	public void user_should_see_a_confirmation_message() {
//	    
//	}

}
