package BingSearchTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class navigateActions extends UIInteractions {
//	public static WebDriver driver;
	
	@Step
	public void openBing () {
		
		openUrl("www.bing.com");
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("www.google.com");
	}

}
