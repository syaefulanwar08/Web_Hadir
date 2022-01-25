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
	
	@FindBy(xpath ="//div[contains(text(),'Tidak ada data absen hari ini')]")
	private WebElement txtDisplayName2;
	
	public void gotoLeader() throws InterruptedException {
		Thread.sleep(2000);
		btnLeader.click();
		Thread.sleep(2000);
		btnLihat.click();
		Thread.sleep(4000);
	}
	
	public String getDisplayName2() {
		return txtDisplayName2.getText();
	}
}
