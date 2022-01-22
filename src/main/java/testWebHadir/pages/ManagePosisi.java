package testWebHadir.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testWebHadir.driver.DriverSingleton;

public class ManagePosisi {

	private WebDriver driver;
	
	public ManagePosisi() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement txtSearchPosition;

	@FindBy(xpath = "//button[normalize-space()='Tambah']")
	private WebElement btnTambah;
	
	@FindBy(xpath = "//*[@id=\"zz1\"]")
	private WebElement txtPosisi;
	
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	private WebElement btnSubmit1;
	
	@FindBy(xpath = "//tbody/tr[55]/td[3]/button[1]/i[1]")
	private WebElement btnEdit;
	
	@FindBy(xpath = "//input[@placeholder='Masukkan posisi']")
	private WebElement txtEdit;
	
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	private WebElement btnSubmit2;
	
	@FindBy(xpath = "//tbody/tr[55]/td[3]/button[2]/i[1]")
	private WebElement btnHapus;
	
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	private WebElement btnSubmit3;
	
	@FindBy(css = "#sidenav-main > div > div > ul > li")
	private List<WebElement> listMenu;
	
	public void gotoManagePosisi() throws InterruptedException {
		listMenu.get(12).click();
		Thread.sleep(2000);
	}
	
	public void clickSearch() {
		txtSearchPosition.click();
	}
	
	public void searchPosisi(String scposisi) throws InterruptedException {
		txtSearchPosition.sendKeys(scposisi);
		Thread.sleep(2000);
		txtSearchPosition.submit();
		Thread.sleep(2000);
	}
	
	////////// ADD NEW POSITION //////////
	
	public void clickTambah() throws InterruptedException {
		btnTambah.click();
		Thread.sleep(2000);
	}
	
	public void inputPosisi(String posisi) throws InterruptedException{
		txtPosisi.sendKeys(posisi);
		btnSubmit1.click();
		Thread.sleep(4000);
	}
	
	////////// EDIT POSITION //////////
	
	public void clickEdit() throws InterruptedException {
		btnEdit.click();
		Thread.sleep(2000);
	}
	
	public void editPosisi(String edit) throws InterruptedException{
		txtEdit.clear();
		txtEdit.sendKeys(edit);
		btnSubmit2.click();
		Thread.sleep(4000);
	}
	
	////////// REMOVE POSITION //////////
	
	public void removePosisi() throws InterruptedException{
		btnHapus.click();
		btnSubmit3.click();
		Thread.sleep(4000);
	}
}
