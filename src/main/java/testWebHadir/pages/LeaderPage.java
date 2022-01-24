package testWebHadir.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testWebHadir.driver.DriverSingleton;

public class LeaderPage {
	
private WebDriver driver;
	
	public LeaderPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="#sidenav-main > div > div > ul > li:nth-child(3) > a")
	private WebElement btnLeader;
	
	@FindBy(id ="t4")
	private WebElement btnLihat;
	
	@FindBy(css ="#root > div > div.mt--8.container-fluid > div > div > div > div:nth-child(2) > div > div.border-0.card-header > h3")
	private WebElement txtDisplayName2;
	
	public void gotoLeader() throws InterruptedException {
		Thread.sleep(2000);
		btnLeader.click();
		Thread.sleep(2000);
		btnLihat.click();
	}
	
	public String getDisplayName2() {
		return txtDisplayName2.getText();
	}
}
