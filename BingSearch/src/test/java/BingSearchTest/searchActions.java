package BingSearchTest;

import org.openqa.selenium.By;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class searchActions extends UIInteractions {
	
	private static final By searchBar = By.xpath("//*[@id=\"sb_form_q\"]");
	private static final By searchButton = By.xpath("/html/body/div[2]/div/div[3]/main/form/div[3]/div/div[1]/div/img");
	private static final By searchBtn = By.className("search_svg");
	private static final By imageTab = By.cssSelector("/html/body/header/nav/ul/li[2]/a");
	
	@Step
	public void byKeyword(String keyword) {
		
		$(searchBar).sendKeys(keyword);
		$(searchButton).click();
	}
	@Step 
	public void clickSearch () {
		$(searchBtn).click();
	}
	
	@Step
	public void clickImagesTab() {
		$(imageTab).click();
	}

}
