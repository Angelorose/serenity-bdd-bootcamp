package com.rcg.travel.test;


import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class NavigateToWebsite extends UIInteractions {
	
	@Step("Navigate to the home page")
    public void toTheBingSearchPage() {
        openUrl("https://www.bing.com/");
    }
}