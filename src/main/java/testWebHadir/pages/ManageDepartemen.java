package testWebHadir.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testWebHadir.driver.DriverSingleton;

public class ManageDepartemen {

	private WebDriver driver;
	
	public ManageDepartemen() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement txtSearchDepartemen;
	
	@FindBy(css = "#sidenav-main > div > div > ul > li")
	private List<WebElement> listMenu;
	
	@FindBy(xpath = "//button[normalize-space()='Tambah']")
	private WebElement btnTambah;
	
	@FindBy(xpath = "//*[@id=\"zz1\"]")
	private WebElement txtDepartemen;
	
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	private WebElement btnSubmit1;
	
	@FindBy(xpath = "//tbody/tr[23]/td[3]/button[1]/i[1]")
	private WebElement btnEdit;
	
	@FindBy(xpath = "//input[@placeholder='Masukkan departemen']")
	private WebElement txtEdit;
	
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	private WebElement btnSubmit2;
	
	@FindBy(xpath = "//tbody/tr[23]/td[3]/button[2]/i[1]")
	private WebElement btnHapus;
	
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	private WebElement btnSubmit3;
	
	
	public void gotoManageDepartemen() {
		listMenu.get(15).click();
	}
	
	public void clickSearchDepartemen() {
		txtSearchDepartemen.click();
	}
	
	public void searchDepartemen(String scdepartemen) throws InterruptedException {
		txtSearchDepartemen.sendKeys(scdepartemen);
		Thread.sleep(2000);
		txtSearchDepartemen.submit();
		Thread.sleep(2000);
	}
	
	////////// ADD NEW DEPARTEMEN //////////
		
	public void clickTambah() throws InterruptedException {
		btnTambah.click();
		Thread.sleep(4000);
	}
	
	public void inputDepartemen(String departemen) throws InterruptedException{
		txtDepartemen.sendKeys(departemen);
		btnSubmit1.click();
		Thread.sleep(4000);
	}
	
	////////// EDIT DEPARTEMEN //////////
	
	public void clickEdit() throws InterruptedException {
		btnEdit.click();
		Thread.sleep(2000);
	}
	
	public void editDepartemen(String edit) throws InterruptedException{
		txtEdit.clear();
		txtEdit.sendKeys(edit);
		btnSubmit2.click();
		Thread.sleep(4000);
	}
	
	////////// REMOVE DEPARTEMEN //////////
	
	public void removeDepartemen() throws InterruptedException{
		btnHapus.click();
		btnSubmit3.click();
		Thread.sleep(4000);
	}
}
