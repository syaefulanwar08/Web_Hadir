package testWebHadir.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testWebHadir.driver.DriverSingleton;

public class ManageAbsenPoin {

	private WebDriver driver;
	
	public ManageAbsenPoin() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css = "body > div:nth-child(2) > nav:nth-child(1) > div:nth-child(1) > div:nth-child(4) > ul:nth-child(3) > li:nth-child(12) > a:nth-child(1)")
	private WebElement listModul;
	
	@FindBy(xpath ="//*[@id=\"navbar-main\"]/div/form/div/div/input")
	private WebElement txtSearchAbsenPoin;
	
	@FindBy(xpath ="/html/body/div/div/div[2]/div/div/div/div[1]/div/button")
	private WebElement btnTambah3;
	
	@FindBy(xpath ="/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/div[1]/input")
	private WebElement txtTempatAbsen;
	
	@FindBy(xpath ="/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/div[2]/input")
	private WebElement txtNamaLokasi;
	
	@FindBy(xpath ="/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/div[3]/input")
	private WebElement txtLatitude;
	
	@FindBy(xpath ="/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/div[4]/input")
	private WebElement txtLongitude;
	
	@FindBy(xpath ="/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/button[3]")
	private WebElement btnSubmitTambahAbsenPoin;
	
	@FindBy(xpath ="/html/body/div/div/div[2]/div/div/div[1]/span")
	private WebElement txtDisplayNameTambahAbsenPoin;
	
	@FindBy(xpath ="/html/body/div/div/div[2]/div/div/div[2]/div[2]/table/tbody/tr[101]/td[5]/button[1]")
	private WebElement btnUbahAbsenPoin;
	
	@FindBy(xpath ="/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/div[1]/input")
	private WebElement txtMasukanTempatAbsen;
	
	@FindBy(xpath ="/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/div[2]/input")
	private WebElement txtLatitude1;
	
	@FindBy(xpath ="/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/div[3]/input")
	private WebElement txtLongitude1;
	
	@FindBy(xpath ="/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/button[2]")
	private WebElement btnSubmitUbahAbsenPoin;
	
	@FindBy(xpath ="/html/body/div/div/div[2]/div/div/div[1]/span")
	private WebElement txtDisplayNameUbahAbsenPoin;
	
	@FindBy(xpath ="/html/body/div/div/div[2]/div/div/div[2]/div[2]/table/tbody/tr[101]/td[5]/button[2]")
	private WebElement btnHapusAbsenPoin;
	
	@FindBy(xpath ="/html/body/div[2]/div/div[1]/div/div/div[3]/button[2]")
	private WebElement btnSubmitHapusAbsenPoin;
	
	
	public void addManageAbsenPoin() {
		listModul.click();
	}
	
	public void clickSearchAbsenPoin() throws InterruptedException {
		txtSearchAbsenPoin.click();
		Thread.sleep(4000);
	}
	
	public void searchAbsenPoin() {
		txtSearchAbsenPoin.sendKeys("ammar", Keys.ENTER);
	}
	
	public void gotoTambahData3(String tempatAbsen, String lokasi, String latitude, String longitude) throws InterruptedException {
		btnTambah3.click();
		Thread.sleep(2000);
		txtTempatAbsen.sendKeys(tempatAbsen);
		txtNamaLokasi.sendKeys(lokasi);
		Thread.sleep(2000);
		txtLatitude.clear();
		txtLatitude.sendKeys(latitude);
		Thread.sleep(2000);
		txtLongitude.clear();
		txtLongitude.sendKeys(longitude);
		Thread.sleep(2000);
		btnSubmitTambahAbsenPoin.click();
		Thread.sleep(4000);
		
	}
	
	public void gotoUbahAbsenPoin(String editTempat, String editlatitude, String editlangitude) throws InterruptedException {
		btnUbahAbsenPoin.click();
		Thread.sleep(2000);
		txtMasukanTempatAbsen.clear();
		txtMasukanTempatAbsen.sendKeys(editTempat);
		Thread.sleep(2000);
		txtLatitude1.clear();
		txtLatitude1.sendKeys(editlatitude);
		Thread.sleep(2000);
		txtLongitude1.clear();
		txtLongitude1.sendKeys(editlangitude);
		Thread.sleep(2000);
		btnSubmitUbahAbsenPoin.click();
		Thread.sleep(4000);
	}
	
	public void gotoHapusAbsenPoin() throws InterruptedException {
		btnHapusAbsenPoin.click();
		Thread.sleep(2000);
		btnSubmitHapusAbsenPoin.click();
		Thread.sleep(4000);
	}
}
