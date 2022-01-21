package testWebHadir.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testWebHadir.driver.DriverSingleton;

public class StatusRequest {

	private WebDriver driver;

	public StatusRequest() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"sidenav-main\"]/div/div/ul/li[9]/a")
	private WebElement gotoStatusRequest;
	
	@FindBy(xpath = "//*[@id=\"navbar-main\"]/div/form/div/div/input")
	private WebElement searchGlobal;
	
	public void pageStatusRequest() {
		gotoStatusRequest.click();
	}
	
	public void klikSearchGlobal() {
		searchGlobal.click();
	}

	public void inputSearchGlobal(String inputSearchGlobalStatusRequest) {
		searchGlobal.sendKeys(inputSearchGlobalStatusRequest, Keys.ENTER);
	}
}
