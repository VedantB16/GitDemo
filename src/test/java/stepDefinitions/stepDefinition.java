package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {

	@Given("^User is on netbanking landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {
		
		System.out.println("Navigated to landing page");

	}

	@When("^User logins into the application with username and password$")
	public void user_logins_into_the_application_with_username_and_password() throws Throwable {
		System.out.println("Trying to log in with correct credentials");
	}
	
	 @When("^User logins into the application with \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_logins_into_the_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
	       System.out.printf("login with values - %s / %s\n", strArg1, strArg2);
	    }


	@Then("^Homepage is populated$")
	public void homepage_is_populated() throws Throwable {
		System.out.println("On Homepage");
	}

	@And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
		System.out.println("Validation of card display - " + strArg1);
		System.out.println("hello");
		System.out.println("hello2");
    }

}