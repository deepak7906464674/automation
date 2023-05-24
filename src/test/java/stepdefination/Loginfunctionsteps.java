package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesteps.Loginsteps;

public class Loginfunctionsteps {

	Loginsteps login = new Loginsteps();

	@Given("lunch url site")
	public void lunch_url_site() {
		login.lunch_url_site();
	}

	@When("click accept cookkie and under age button")
	public void click_accept_cookkie_and_under_age_button() {
		login.click_accept_cookkie_and_under_age_button();
	}

	@And("navigate to google")
	public void navigate_to_google() {
		login.navigate_to_google();
	}

	@When("click accept cookkie and age popup")
	public void click_accept_cookkie_and_age_popup() {
		login.click_accept_cookkie_and_age_popup();
	}

	@And("click signin icon")
	public void click_signin_icon() {
		login.click_signin_icon();
	}

	@And("click no and click signup with email")
	public void click_no_and_click_signup_with_email() throws Exception {
		login.click_no_and_click_signup_with_email();
	}

	@And("fill form and create account button")
	public void fill_form_and_create_account_button() throws InterruptedException {
		login.fill_form_and_create_account_button();
	}

	@Then("validate message")
	public void validate_message() {
		login.validate_message();
	}

	@When("login with email and password")
	public void login_with_email_and_password() {
		login.login_with_email_and_password();
	}

	@Then("click signin button")
	public void click_signin_button() {
		login.click_signin_button();
	}

	@And("click forget password and enter email and submit")
	public void click_forget_password_and_enter_email_and_submit() throws Exception {
		login.click_forget_password_and_enter_email_and_submit();

	}

	@Then("validate message forget pasword")
	public void validate_message_forget_pasword() {
		login.validate_message_forget_pasword();

	}

}
