package com.rcg.travel.test;

import org.openqa.selenium.By;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class ClickTravelOption extends UIInteractions{
	
	private static final By DOTID = By.cssSelector("ul.scopes li#dots_overflow_menu_container");
	private static final By TRAVEL = By.linkText("Travel");
	
	@Step("Click the 3 dotted menu")
	public void clickTheDotsContainerMenu() {
		$(DOTID).click();
	
	}
	
	@Step("Choose the Travel Option")
	public void chooseTheTravelInMenu() {
		$(TRAVEL).click();
	}
}