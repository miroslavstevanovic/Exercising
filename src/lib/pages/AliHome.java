package lib.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AliHome {

	public WebDriver driver;

	@FindBy(xpath = "//*[@id='home-firstscreen']/div/div[2]/div/div[2]/dl[3]/dt/span/a")
	private WebElement phonesMenu;
	
	@FindBy(linkText = "Phone Bags & Cases")
	private WebElement phoneBagsMenu;
	
	@FindBy(linkText = "Polyester")
	private WebElement polyesterCase;
	
	@FindBy(className = "logo-base")
	private WebElement homeButton;
	
	@FindBy(id = "search-key")
	private WebElement searchField;
	
	@FindBy(className = "search-button")
	private WebElement searchButton;

	public AliHome(WebDriver driver) {
		this.driver = driver;
		Sleeper.sleepTightInSeconds(3);
		PageFactory.initElements(driver, this);

	}

	public AliHome clickPhonesMenu() {
		phonesMenu.click();
		return this;
	}
	
	public AliHome clickPhoneBagsMenu(){
		phoneBagsMenu.click();
		return this;
		
	}
	
	public AliHome clickPolyesterCase(){
		polyesterCase.click();
		return this;
	}
	
	public AliHome clickHomeButton(){
		homeButton.click();
		return this;
	}
	
	public AliHome typeIntoSearchBox(String searchbox){
		searchField.sendKeys(searchbox);
		return this;
	}
	
	public SearchPage clickSearchButton(){
		searchButton.click();
		return new SearchPage(driver);
	}

}
