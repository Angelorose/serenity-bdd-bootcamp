package com.rcg.serenity;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class SearchActions extends UIInteractions {
	
	private static final By NAME = By.name("q");
	private static final By LASTINDEX = By.xpath("//ul[@class='G43f7e'");
	private static final By VIDEOBTN = By.linkText("Videos");
	private static final By SEARCHBAR = By.id("sb_form_q");	
	private static final By SUBMITBTN = By.className("b_searchboxSubmit");
	private static final By CLICKVIDEO = By.xpath("//div/div[@class='cico']/img");
	private static final By VIDEOTITLE = By.linkText("PART 1 : Serenity BDD Tool Introduction || Naveen AutomationLabs");
	
	
	
	@Step("Search for '{0}'")	
	public void clickVideoBtn()
	{
		$(VIDEOBTN).click();
	}
	
	public void populateSearch(String x)
	{
		$(SEARCHBAR).sendKeys(x);
	}
	
	public void clickVideo()
	{
		$(SUBMITBTN).click();
		$(CLICKVIDEO).click();
	}
	
	public String verifyTitle()
	{
		String text = $(VIDEOTITLE).getText();
		return text;
	}

	public void validateTitle()
	{
		Assert.assertTrue(verifyTitle().equalsIgnoreCase("PART 1 : Serenity BDD Tool Introduction || Naveen AutomationLabs"));
	}

}