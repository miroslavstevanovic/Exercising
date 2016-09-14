package test;

import org.testng.annotations.Test;

import lib.data.Property;
import lib.pages.AliHome;
import lib.pages.AliLogin;
import lib.pages.SearchPage;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterClass;

public class TestAli {

	AliHome aliHome;
	AliLogin aliLogin;
	SearchPage searchPage;

	public WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		try {
			driver = new FirefoxDriver();		
			aliLogin = new AliLogin(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void f() {
		
		try {
			aliLogin.enterUsername(Property.username);
			Sleeper.sleepTightInSeconds(2);
			aliLogin.enterPassword(Property.password);
			Sleeper.sleepTightInSeconds(2);
			aliHome = aliLogin.clickOnSubmitButton();
			Sleeper.sleepTightInSeconds(5);
			aliHome.clickPhonesMenu();
			Sleeper.sleepTightInSeconds(2);
			aliHome.clickPhoneBagsMenu();
			Sleeper.sleepTightInSeconds(2);
			aliHome.clickPolyesterCase();
			Sleeper.sleepTightInSeconds(2);
			aliHome.clickHomeButton();
			Sleeper.sleepTightInSeconds(2);
			aliHome.typeIntoSearchBox(Property.searchbox);
			Sleeper.sleepTightInSeconds(2);
			searchPage = aliHome.clickSearchButton();
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	 

}
