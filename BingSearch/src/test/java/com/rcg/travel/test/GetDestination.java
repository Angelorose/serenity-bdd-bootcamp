package com.rcg.travel.test;


import org.junit.Assert;
import org.openqa.selenium.By;


import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class GetDestination extends UIInteractions{
	
	private static final By GETH3 = By.xpath("//div[@class='pd-header-left']");
	
	@Step("Get the h3 text")
	public String getDest() {
		String text = $(GETH3).getText();
		return text;
	}
	
	@Step("Validates if the header contains this '{0}' text")
	public void validates(String text) {
		Assert.assertTrue(getDest().contains(text));
	}
}
