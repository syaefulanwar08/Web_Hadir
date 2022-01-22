package testWebHadir.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testWebHadir.driver.DriverSingleton;

public class ManageTipe {

	private WebDriver driver;

	public ManageTipe() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);

	}

	@FindBy(css ="#sidenav-main > div > div > ul > li:nth-child(10) > a")
	private WebElement manageTipe;
	
	@FindBy(xpath ="//*[@id=\"navbar-main\"]/div/form/div/div/input")
	private WebElement txtSearchTipe;

	@FindBy(xpath ="//button[@class='ml-2 btn btn-primary']")
	private WebElement btnTambah;

	@FindBy(css ="#zz1")
	private WebElement txtTipe;

	@FindBy(css ="body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > div > form > button.btn.btn-primary")
	private WebElement btnSubmit;

	@FindBy(css ="#root > div > div.mt--8.container-fluid > div > div > div > div.border-0.card-header > div.alert.alert-success.alert-dismissible.show > span")
	private WebElement txtDisplayName;

	@FindBy(xpath ="//tbody/tr[6]/td[3]/button[1]/i[1]")
	private WebElement btnUbah;

	@FindBy(xpath ="//input[@placeholder='Masukkan tipe karyawan']")
	private WebElement txtTipe1;

	@FindBy(xpath ="/html/body/div[2]/div/div[1]/div/div/div[2]/form/button[2]")
	private WebElement btnSubmit1;

	@FindBy(css ="#root > div > div.mt--8.container-fluid > div > div > div > div.border-0.card-header > div.alert.alert-success.alert-dismissible.show > span")
	private WebElement txtDisplayName2;

	@FindBy(xpath ="//tbody/tr[6]/td[3]/button[2]/i[1]")
	private WebElement btnHapus;

	@FindBy(xpath ="//button[normalize-space()='Submit']")
	private WebElement btnSubmit2;

	@FindBy(css ="#root > div > div.mt--8.container-fluid > div > div > div > div.border-0.card-header > div.alert.alert-success.alert-dismissible.show > span")
	private WebElement txtDisplayName3;

	public void addManageTipe() {
		manageTipe.click();
	}
 	public void clickSearchTipe() throws InterruptedException {
		txtSearchTipe.click();
		Thread.sleep(1000);
	}
	
	public void searchTipe() throws InterruptedException {
		txtSearchTipe.sendKeys("ammar", Keys.ENTER);
		Thread.sleep(4000);
	}
 	
	public void gotoTambahData(String tipeKaryawan1) throws InterruptedException {
		btnTambah.click();
		Thread.sleep(2000);
		txtTipe.sendKeys(tipeKaryawan1);
		btnSubmit.click();
		Thread.sleep(4000);
	}
	public void gotoUbahData() throws InterruptedException {
		btnUbah.click();
		Thread.sleep(2000);
		txtTipe1.sendKeys("zoni");
		btnSubmit1.click();
		Thread.sleep(4000);
	}

	public void gotoHapusData() throws InterruptedException {
		btnHapus.click();
		Thread.sleep(2000);
		btnSubmit2.click();
		Thread.sleep(4000);
	}
}
