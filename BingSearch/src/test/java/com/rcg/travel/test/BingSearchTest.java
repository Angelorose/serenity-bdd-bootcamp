package com.rcg.travel.test;




import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
@ExtendWith(SerenityJUnit5Extension.class)
public class BingSearchTest{

		@Managed(driver = "edge")
		WebDriver driver;

		NavigateToWebsite navigate;
		ClickTravelOption option;
		SearchDestination search;
		GetDestination dest;
		String destination = "France";
		String text = "Destinations";
		
		@Test
		public void automateBingWebsite() {
			navigate.toTheBingSearchPage();
			driver.manage().window().maximize();
			
			option.clickTheDotsContainerMenu();
			option.chooseTheTravelInMenu();
			search.searchDestination(destination);
			dest.validates(text);
			
		}
	}

