package BingSearchTest;



import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class bingSearchRunner {
	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	navigateActions nav = new navigateActions();
	searchActions sea = new searchActions();
	
	@Test
	void runTest() {
		
		nav.openBing();
		sea.byKeyword("serenity");
		sea.clickImagesTab();
	}

}
