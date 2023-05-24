package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pagesteps.addcar;

public class Addcartfunction {
	addcar basket = new addcar();

	@And("check basket is empty")
	public void check_basket_is_empty() throws Exception {
		basket.check_basket_is_empty();

	}

	@And("search epod")
	public void search_epod() throws Exception {
		basket.search_epod();

	}

	@And("select product")
	public void select_product() {
		basket.select_product();

	}

	@Then("validate basket product")
	public void validate_basket_product() throws Exception {
		basket.validate_basket_product();

	}

	@And("click product")
	public void click_product() {
		basket.click_product();

	}

	@And("add to basket")
	public void add_to_basket() {
		basket.add_to_basket();

	}

}
