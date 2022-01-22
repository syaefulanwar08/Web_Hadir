package testWebHadir.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testWebHadir.driver.DriverSingleton;

public class ManageHariCuti {

	private WebDriver driver;
	
	public ManageHariCuti() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css ="#sidenav-main > div > div > ul > li:nth-child(11) > a")
	private WebElement manageHariCuti;
	
	@FindBy(xpath ="//input[@type='text']")
	private WebElement txtSearchHariCuti;
	
	@FindBy(css ="#root > div > div.mt--8.container-fluid > div > div > div > div.border-0.card-header > div > button")
	private WebElement btnTambah1;
	
	@FindBy(xpath ="//div[@class='rdt']//input")
	private WebElement btnKalender;
	
	@FindBy(xpath ="//td[@data-value='14']")
	private WebElement btnTanggal;
	
	@FindBy(xpath ="/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/div/label")
	private WebElement btnLabel;
	
	@FindBy(xpath ="/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/button[2]")
	private WebElement btnSubmit4;
	
	@FindBy(css ="#root > div > div.mt--8.container-fluid > div > div > div.alert.alert-success.alert-dismissible.show > span")
	private WebElement txtDisplayName4;
	
	@FindBy(xpath ="//tbody/tr[3]/td[3]/button[1]/i[1]")
	private WebElement btnUbah1;
	
	@FindBy(xpath ="//div[@class='rdt']//input")
	private WebElement btnKalender1;
	
	@FindBy(xpath ="//td[@data-value='16']")
	private WebElement btnTanggal1;
	
	@FindBy(xpath ="/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/div/div/div[1]/span/i")
	private WebElement btnLabel1;
	
	@FindBy(css ="body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > div > form > button.btn.btn-primary")
	private WebElement btnSubmit5;
	
	@FindBy(css ="#root > div > div.mt--8.container-fluid > div > div > div.alert.alert-success.alert-dismissible.show > span")
	private WebElement txtDisplayName5;
	
	@FindBy(xpath ="//tbody/tr[3]/td[3]/button[2]/i[1]")
	private WebElement btnHapus1;
	
	@FindBy(xpath ="/html/body/div[2]/div/div[1]/div/div/div[3]/button[2]")
	private WebElement btnSubmit6;
	
	
	public void addManageHariCuti() {
		manageHariCuti.click();
	}
	
	public void clickSearchHariCuti() throws InterruptedException {
		txtSearchHariCuti.click();
		Thread.sleep(4000);
	}
	
	public void searchHariCuti(String ammar) throws InterruptedException {
		txtSearchHariCuti.sendKeys(ammar);
		txtSearchHariCuti.submit();
		Thread.sleep(2000);
	}
	
	public void gotoTambahData1(String setharicuti) throws InterruptedException {
		btnTambah1.click();
		Thread.sleep(2000);
		btnKalender.click();
		btnTanggal.click();
		btnLabel.click();
		Thread.sleep(2000);
		btnSubmit4.click();
		Thread.sleep(3000);
	}	
	
	public void gotoUbahData1() throws InterruptedException {
		btnUbah1.click();
		Thread.sleep(2000);
		btnKalender1.click();
		btnTanggal1.click();
		btnLabel1.click();
		Thread.sleep(2000);
		btnSubmit5.click();
		Thread.sleep(3000);
	}
	
	public void gotoHapusData1() throws InterruptedException {
		btnHapus1.click();
		Thread.sleep(2000);
		btnSubmit6.click();
		Thread.sleep(3000);
	}
}
