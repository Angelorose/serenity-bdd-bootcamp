package com.rcg.serenity;


import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class FirstSerenityActivity extends UIInteractions{
	
	 @Managed(driver = "edge")
	 WebDriver driver;

	 NavigateActions navigate;
	 SearchActions search;

	 	 
	@Test
	public void enterYourNameOnSearchBar() {
		navigate.toTheGoogleSearchPage();
		driver.manage().window().maximize();
		search.clickVideoBtn();
		search.populateSearch("Serenity BDD");
		search.clickVideo();
		search.validateTitle();
		
		
	}
}
