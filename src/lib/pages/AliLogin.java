package lib.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lib.data.Property;

public class AliLogin {

	@FindBy(id = "fm-login-id")
	private WebElement usernameField;

	@FindBy(xpath = "//*[@id=('fm-login-password')]")
	private WebElement passwordField;

	@FindBy(xpath = "//*[@id=('fm-login-submit')]")
	private WebElement submitButton;

	public WebDriver driver;

	public AliLogin(WebDriver driver) {
		this.driver = driver;
		driver.manage().window().maximize();
		driver.get(Property.URL);
		driver.switchTo().frame("alibaba-login-box");
		Sleeper.sleepTightInSeconds(5);
		PageFactory.initElements(driver, this);

	}

	public AliLogin enterUsername(String username) {
		usernameField.sendKeys(username);
		return this;
	}

	public AliLogin enterPassword(String password) {
		passwordField.sendKeys(password);
		return this;

	}

	public AliHome clickOnSubmitButton() {
		submitButton.click();
		return new AliHome(driver);
	}
}
