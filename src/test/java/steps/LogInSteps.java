package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LogInPage;

public class LogInSteps {
    LogInPage loginPage = new LogInPage();

    @Given("^I am on the Landing Page of http://automationpractice\\.com/index\\.php$")
    public void i_am_on_the_Landing_Page_of_http_automationpractice_com_index_php() throws Throwable {
        loginPage.LaunchUrl();

    }

    @And("^I click on the \"([^\"]*)\" button$")
    public void i_click_on_the_button(String arg1) throws Throwable {
        loginPage.ClickSignInButton();

    }

    @When("^I enter my emailAddress and Password$")
    public void i_enter_my_emailAddress_and_Password() throws Throwable {
        loginPage.EnterEmailAndPassword();

    }

    @And("^I click on Sign in Button$")
    public void i_click_on_Sign_in_Button() throws Throwable {
        loginPage.SignInButton();

    }

    @Then("^I should be signed in  and a logout button should be visible$")
    public void i_should_be_signed_in_and_a_logout_button_should_be_visible() throws Throwable {

        loginPage.ValidateSignOutButton();

    }
}
