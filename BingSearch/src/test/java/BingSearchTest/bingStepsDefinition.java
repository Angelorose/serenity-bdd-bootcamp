package BingSearchTest;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class bingStepsDefinition extends navigateActions {
	navigateActions nav = new navigateActions();
	searchActions sea = new searchActions();
	
	@Given("^Browser \"(.*)\" and website \"(.*)\" is open$")
	public void Browser_and_website_is_open (String browser, String website) {
		openBrowser(browser);
		openBing(website);
	}
	
	@When("^User types the keyword \"(.*)\" in the search bar$")
	public void User_types_keyword(String keyword) {
		sea.byKeyword(keyword);
	}
	
	@And("^User clicks the search button$")
	public void User_clicks_search_button() {
		sea.clickSearch();
	}
	@And("^User clicks images tab \"(.*)\" &")
	public void User_clicks_images_tab() {
		sea.clickImagesTab();
	}

}
