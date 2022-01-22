package testWebHadir.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testWebHadir.driver.DriverSingleton;

public class ManageSetting {

	private WebDriver driver;
	
	public ManageSetting() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement txtSearchSetting;
	
	@FindBy(css = "#sidenav-main > div > div > ul > li")
	private List<WebElement> listMenu;
	
	@FindBy(xpath = "//tbody/tr/td/div[1]")
	private WebElement btnActive;
	
	@FindBy(xpath = "//i[@class='fa fa-edit']")
	private WebElement btnEdit;
	
	@FindBy(xpath = "//div[@class='modal-content']//div[1]//input[1]")
	private WebElement txtTimer;
	
	@FindBy(xpath = "//div[@class='modal-body text-danger']//div[2]//input[1]")
	private WebElement txtRadius;
	
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[1]/button/span")
	private WebElement btnClose;
	
	public void gotoManageSetting() throws InterruptedException {
		listMenu.get(14).click();
		Thread.sleep(5000);
	}
	
	public void buttonActive() throws InterruptedException {
		btnActive.click();
		Thread.sleep(2000);
	}
	
	public void clickEdit() {
		btnEdit.click();
	}
	
	public void editTimer(String timer) throws InterruptedException {
		txtTimer.clear();
		txtTimer.sendKeys(timer);
		Thread.sleep(2000);
	}
	
	public void editRadius(String radius) throws InterruptedException {
		txtRadius.clear();
		txtRadius.sendKeys(radius);
		Thread.sleep(2000);
		btnSubmit.click();
		Thread.sleep(2000);
		btnClose.click();
		Thread.sleep(2000);
	}
	
	public void clickSearchSetting() {
		txtSearchSetting.click();
	}
	
	public void searchSetting(String scsetting) throws InterruptedException {
		txtSearchSetting.sendKeys(scsetting);
		Thread.sleep(2000);
		txtSearchSetting.submit();
		Thread.sleep(2000);
	}
}
