package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreateAccountPage;

public class CreateAccountSteps {
    CreateAccountPage signinpage = new CreateAccountPage();

    @Given("^I navigate to http://automationpractice\\.com/index\\.php$")
    public void i_navigate_to_http_automationpractice_com_index_php() throws Throwable {
        signinpage.LaunchUrl();

    }

    @And("^I click on the signIn button$")
    public void i_click_on_the_signIn_button() throws Throwable {
        signinpage.ClickSignInButton();

    }

    @When("^I enter my email address$")
    public void i_enter_my_email_address() throws Throwable {
        signinpage.EnterEmailAddress();

    }

    @And("^I click on the create an account button$")
    public void i_click_on_the_create_an_account_button() throws Throwable {
        signinpage.CreateAnAccount();
    }

    @Then("^a create an account page is displayed$")
    public void a_create_an_account_page_is_displayed() throws Throwable {
        signinpage.ValidateCreateAccountPage();
    }

    @Given("^I click on the title button$")
    public void i_click_on_the_title_button() throws Throwable {
        signinpage.SelectTitle();

    }

    @Given("^I enter my firstName and LastName$")
    public void i_enter_my_firstName_and_LastName() throws Throwable {
        signinpage.EnterFirstAndLastName();

    }

    @When("^I enter my password$")
    public void i_enter_my_password() throws Throwable {
        signinpage.EnterPassword();

    }

    @When("^I select my date of birth$")
    public void i_select_my_date_of_birth() throws Throwable {
        signinpage.SelectDateOfBirth();
        signinpage.SelectMonth();
        signinpage.SelectYear();
    }

    @Given("^I enter my address fields and values as below$")
    public void i_enter_my_address_fields_and_values_as_below(DataTable AddressDetails) throws Throwable {
        signinpage.EnterAddressDetails(AddressDetails);

    }

    @When("^I click on the register button$")
    public void i_click_on_the_register_button() throws Throwable {
        signinpage.ClickOnRegisterButton();

    }

    @Then("^I should be registered$")
    public void i_should_be_registered() throws Throwable {

    }


}





