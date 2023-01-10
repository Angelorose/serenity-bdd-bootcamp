package com.rcg.travel.test;


import org.openqa.selenium.By;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class SearchDestination extends UIInteractions{
	private static final By SEARCHBAR = By.xpath("//input[@id='downshift-0-input']");
	private static final By CLICKSEARCH = By.xpath("//button[@aria-label='Search']");
	
	
	@Step("Search for destination '{0}'")
	public void searchDestination(String destination) {
		$(SEARCHBAR).sendKeys(destination);
		$(CLICKSEARCH).click();		
	}
}
