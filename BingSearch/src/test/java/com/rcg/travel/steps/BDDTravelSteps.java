package com.rcg.travel.steps;

import org.openqa.selenium.WebDriver;

import com.rcg.travel.test.ClickTravelOption;
import com.rcg.travel.test.GetDestination;
import com.rcg.travel.test.NavigateToWebsite;
import com.rcg.travel.test.SearchDestination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class BDDTravelSteps extends NavigateToWebsite{
	
	@Managed(driver = "edge")
	WebDriver driver;
	
	ClickTravelOption option;
	SearchDestination search;
	GetDestination dest;
	
	@Given("^Browser and website \"(.*)\" is open$")
	public void openBrowserAndWebsite(String website) {
		driver.manage().window().maximize();
		openUrl(website);
	}
	
	@When("^User click the 3 dot option and choose Travel$")
	public void clickDotsAndTravel() {
		option.clickTheDotsContainerMenu();
		option.chooseTheTravelInMenu();
	}
	
	@And("^User search their desired destination \"(.*)\" to port$")
	public void searchDesireDestination(String destination) {
		search.searchDestination(destination);
	}
	
	@Then("^Validates if the header text contains this \"(.*)\" text$")
	public void successfullyBooked(String text) {
		dest.validates(text);
	}
}