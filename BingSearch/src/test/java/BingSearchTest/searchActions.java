package BingSearchTest;

import org.openqa.selenium.By;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class searchActions extends UIInteractions {
	
	private static final By searchBar = By.xpath("//*[@id=\"sb_form_q\"]");
	private static final By searchButton = By.xpath("//*[@id=\"search_icon\"]/svg");
	private static final By imageTab = By.xpath("//*[@id=\"b-scopeListItem-images\"]/a");
	
	@Step
	public void byKeyword(String keyword) {
		
		$(searchBar).sendKeys(keyword);
		$(searchButton).click();
	}
	
	@Step
	public void clickImagesTab() {
		$(imageTab).click();
	}

}
