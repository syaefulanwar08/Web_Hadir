package testWebHadir.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testWebHadir.driver.DriverSingleton;

public class ReportingKaryawan {

	private WebDriver driver;

	public ReportingKaryawan() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"sidenav-main\"]/div/div/ul/li[7]/a")
	private WebElement gotoReportingKaryawan;

	@FindBy(xpath = "//select[@class='form-control-alternative form-control']")
	private WebElement dropdownList;

	@FindBy(xpath = "//option[@value='nik']")
	private WebElement listNik;

	@FindBy(xpath = "//option[@value='name']")
	private WebElement listName;

	@FindBy(xpath = "//option[@value='leader']")
	private WebElement listLeader;

	@FindBy(xpath = "//option[@value='divisi']")
	private WebElement listDivisi;

	@FindBy(xpath = "//div[@controlid='formlvl']/select[@class='form-control-alternative form-control']")
	private WebElement dropdownDivisi;

	@FindBy(xpath = "//option[@value='IT & Programming']")
	private WebElement pilihDivisi;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[1]/div[1]/form/div/div[3]/div/input")
	private WebElement masukkanInputan;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement btnSearch;

	@FindBy(xpath = "//table[@id='ekspor']//tr//th//input")
	private WebElement chooseAllKaryawan;

	@FindBy(xpath = "//div[@class='float-none']//button")
	private WebElement btnExport;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/div/div[2]/div/div/select")
	private WebElement pilihWaktu;

	@FindBy(xpath = "//option[@value='5']")
	private WebElement pilihWeekly;

	@FindBy(xpath = "//div[@class='rdt']//input[@placeholder='Set tanggal']")
	private WebElement openDropdownTanggal;

	@FindBy(xpath = "//div[@class='rdt rdtOpen']//td[@data-value='10']")
	private WebElement pilihTanggal;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/div/div[4]/button")
	private WebElement btnSearchExport;

	@FindBy(xpath = "//button[@id='test-table-xls-button']")
	private WebElement btnDataSiapExport;

	@FindBy(xpath = "//div[@class='modal-footer']//button")
	private WebElement btnClose;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div/div[1]/div[1]/a")
	private WebElement gotoStaff;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div[1]/a")
	private WebElement gotoSupervisor;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div/div[1]/div[2]/a")
	private WebElement gotoLeader;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div[2]/a")
	private WebElement gotoManager;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div/div[1]/div[3]/a")
	private WebElement gotoChangeRequest;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div[3]/a")
	private WebElement gotoHead;

	@FindBy(xpath = "//*[@id=\"navbar-main\"]/div/form/div/div/input[@placeholder='Search']")
	private WebElement searchGlobal;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div")
	private WebElement scSearchGlobal1;

	public WebElement getScSearchGlobal1() {
		return scSearchGlobal1;
	}

	public void gotoReportingKaryawan() {
		gotoReportingKaryawan.click();
	}

	public void klikDropdownList() {
		dropdownList.click();
	}

	//////// Search by NIK /////////////

	public void klikListNik() {
		listNik.click();
	}

	public void searchByNik(String nik) throws InterruptedException {
		masukkanInputan.sendKeys(nik);
		btnSearch.click();
		Thread.sleep(4000);
	}

	//////// Search by Name /////////////

	public void klikListName() {
		listName.click();
	}

	public void searchByName(String name) throws InterruptedException {
		masukkanInputan.clear();
		masukkanInputan.sendKeys(name);
		btnSearch.click();
		Thread.sleep(4000);
	}

	////////Search by Name /////////////

	public void klikListLeader() {
		listLeader.click();
	}

	public void searchByLeader(String leader) throws InterruptedException {
		masukkanInputan.clear();
		masukkanInputan.sendKeys(leader);
		btnSearch.click();
		Thread.sleep(4000);

	}


	////// Search by divisi ///////////

	public void klikListDivisi() {
		listDivisi.click();
	}

	public void searchByDivisi() throws InterruptedException {
		dropdownDivisi.click();
		pilihDivisi.click();
		btnSearch.click();
		Thread.sleep(4000);

	}

	///////// Export Data ///////////////
	public void pilihAllKaryawan() {
		chooseAllKaryawan.click();
	}

	public void klikBtnExport() {
		btnExport.click();
	}

	public void pilihWaktu() throws InterruptedException {
		pilihWaktu.click();
		pilihWeekly.click();
		openDropdownTanggal.click();
		Thread.sleep(3000);
		
		pilihTanggal.click();
		btnSearchExport.click();
		
		Thread.sleep(3000);

		btnDataSiapExport.click();
		btnClose.click();
	}

	public void klikCardBodyStaff() throws InterruptedException {
		gotoStaff.click();
		gotoReportingKaryawan.click();
		Thread.sleep(3000);

		gotoSupervisor.click();
		gotoReportingKaryawan.click();
		Thread.sleep(3000);;

		gotoLeader.click();
		gotoReportingKaryawan.click();
		Thread.sleep(3000);

		gotoManager.click();
		gotoReportingKaryawan.click();
		Thread.sleep(3000);

		gotoChangeRequest.click();
		gotoReportingKaryawan.click();
		Thread.sleep(3000);
	}

	public void klikCardBodySupervisor() throws InterruptedException {

		gotoSupervisor.click();
		Thread.sleep(3000);
		gotoReportingKaryawan.click();
		Thread.sleep(2000);

	}

	public void klikCardBodyLeader() throws InterruptedException {

		gotoLeader.click();
		Thread.sleep(3000);
		gotoReportingKaryawan.click();
		Thread.sleep(2000);

	}

	public void klikCardBodyManager() throws InterruptedException {

		gotoManager.click();
		Thread.sleep(3000);
		gotoReportingKaryawan.click();
		Thread.sleep(2000);

	}

	public void klikCardBodyChangeRequest() throws InterruptedException {

		gotoChangeRequest.click();
		Thread.sleep(3000);
		gotoReportingKaryawan.click();
		Thread.sleep(2000);
		
	}

	public void klikCardBodyHead() throws InterruptedException {

		gotoHead.click();
		Thread.sleep(3000);
		gotoReportingKaryawan.click();
		Thread.sleep(2000);
		
	}

	public void klikSearchGlobal() {
		searchGlobal.click();
	}

	public void inputSearchGlobal(String inputSearchGlobalReportingKaryawan) throws InterruptedException {
		searchGlobal.click();
		Thread.sleep(3000);
		searchGlobal.sendKeys(inputSearchGlobalReportingKaryawan, Keys.ENTER);
		Thread.sleep(3000);
	}
	
	
	public void scSearchGlobal1() {
		
	}
	

}
