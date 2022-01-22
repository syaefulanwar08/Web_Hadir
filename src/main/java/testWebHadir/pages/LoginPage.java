package testWebHadir.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testWebHadir.driver.DriverSingleton;

public class LoginPage {
	
private WebDriver driver;
	
	public LoginPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="#root > div > div.mt--8.container > div > div > div > div > form > div.mb-3.form-group > div > input")
	private WebElement txtUserName;
	
	@FindBy(css ="#root > div > div.mt--8.container > div > div > div > div > form > div:nth-child(2) > div > input")
	private WebElement txtPassword;
	
	@FindBy(css ="#root > div > div.mt--8.container > div > div > div > div > form > div.text-center > button")
	private WebElement btnSignin;
	
	@FindBy(css ="#root > div > div:nth-child(4) > footer > div > div > div > a")
	private WebElement txtDisplayName1;
	
	public void gotoLogin(String username, String password) {
		txtUserName.sendKeys(username);
		txtPassword.sendKeys(password);
		btnSignin.click();
	}
	
	public String getDisplayName1() {
		return txtDisplayName1.getText();
	}

}
