package testWebHadir.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testWebHadir.driver.DriverSingleton;

public class Logout {
	
private WebDriver driver;
	
	public Logout() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"navbar-main\"]/div/ul/li")
	private WebElement profil;
	
	@FindBy(xpath = "//*[@id=\"navbar-main\"]/div/ul/li/div/a[2]")
	private WebElement logout;
	
	public void klilProfile() {
		profil.click();
	}
	
	public void logoutWeb() {
		logout.click();
	}
}
