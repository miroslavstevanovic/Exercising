package lib.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	public WebDriver driver;

	public SearchPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

}
