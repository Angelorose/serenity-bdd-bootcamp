package BingSearchTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;

public class navigateActions extends UIInteractions {
	@Managed(driver = "chrome")
	WebDriver driver;
	String website = "www.bing.com";
	
	
	@Step
	public void openBrowser(String browser) {
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
	}
	
	
	public void openBing (String website) {
		
		openUrl(website);
	}

}
