package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealProgram {

	@Given("^Launch Site$")
	public void launch_Site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("First");
	}

	@When("^Enter username$")
	public void enter_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("Nice");    
	
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("Hi");    
	}

	@When("^Click on Sign In Button$")
	public void click_on_Sign_In_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("Ok");    
	}

	@Then("^Site should be launched successfully$")
	public void site_should_be_launched_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Good");
	}


	
}
