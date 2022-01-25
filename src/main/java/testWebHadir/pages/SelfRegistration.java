package testWebHadir.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testWebHadir.driver.DriverSingleton;

public class SelfRegistration {

	private WebDriver driver;

	public SelfRegistration() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"sidenav-main\"]/div/div/ul/li[8]/a")
	private WebElement gotoSelfRegistration;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[4]/a/button")
	private WebElement gotoForm;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div/div[2]/a/button")
	private WebElement btnLihatKaryawan;

	////// User information ///////
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement inputEmail;

	@FindBy(xpath = "//input[@id='input-first-name']")
	private WebElement inputFullName;

	////// job information ///////
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/form/div[2]/div[1]/div[2]/div/select")
	private WebElement dropdownLevel;

	@FindBy(xpath = "//option[@value='Staff']")
	private WebElement pilihLevelStaff;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/form/div[2]/div[1]/div[3]/div/select")
	private WebElement dropdownTipeKaryawan;

	@FindBy(xpath = "//option[@value='Magang']")
	private WebElement pilihTipeKaryawan;

	@FindBy(xpath = "//select[@id='input-deptName']")
	private WebElement dropdownDepartemen;

	@FindBy(xpath = "//option[@value='IT & Programming']")
	private WebElement pilihDepartemen;

	@FindBy(xpath = "//select[@id='input-posisi']")
	private WebElement dropdownPosisi;

	@FindBy(xpath = "//option[@value='Programmer']")
	private WebElement pilihPosisi;

	@FindBy(xpath = "//select[@id='input-jam-kerja']")
	private WebElement dropdownJamKerja;

	@FindBy(xpath = "//option[@value='Jam tetap']")
	private WebElement pilihJamKerja;

	@FindBy(xpath = "//select[@id='input-lokasi']")
	private WebElement dropdownLokasi;

	@FindBy(xpath = "//option[@value='Tetap']")
	private WebElement pilihLokasi;

	@FindBy(xpath = "//select[@id='input-lembur']")
	private WebElement dropdownLembur;

	@FindBy(xpath = "//option[@value='ya']")
	private WebElement pilihLembur;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/form/div[2]/div[3]/div[3]/div/input")
	private WebElement jumlahCuti;
	
	@FindBy(xpath = "//input[@placeholder='Jam Masuk']")
	private WebElement jamMasuk;
	
	@FindBy(xpath = "//input[@placeholder='Jam Keluar']")
	private WebElement jamKeluar;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/form/div[2]/div[5]/div/div/select")
	private WebElement absenPoint;
	
	@FindBy(xpath = "//option[@value='Uofq3ns4ot']")
	private WebElement pilihAbsenPoint;


	///// Choose Leader /////////////
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/form/div[3]/div[1]/div[1]/div/select")
	private WebElement dropdownLeader;

	@FindBy(xpath = "//option[@value='254G3Iaw7u']")
	private WebElement pilihLeader;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/form/div[3]/div[1]/div[2]/div/select")
	private WebElement dropdownSupervisor;

	@FindBy(xpath = "//option[@value='SNuLHKATMh']")
	private WebElement pilihSupervisor;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/form/div[3]/div[1]/div[3]/div/select")
	private WebElement dropdownManager;

	@FindBy(xpath = "//option[@value='Uch80BlAmc']")
	private WebElement pilihManager;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/form/div[3]/div[2]/div[1]/div/select")
	private WebElement dropdownHead;

	@FindBy(xpath = "//option[@value='qsEFkUvMzO']")
	private WebElement pilihHead;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/form/div[3]/div[2]/div[2]/div/select")
	private WebElement dropdownGM;

	@FindBy(xpath = "//option[@value='rFIZpY2vWG']")
	private WebElement pilihGM;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
	private WebElement alertSetelahSubmit;
	

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/table/tbody/tr[2]/td/button")
	private WebElement btnReject;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/form/div[1]/div[4]/div[1]/div/div/div/button")
	private WebElement btnHiddenPassword;
	
	@FindBy(xpath = "//*[@id=\"navbar-main\"]/div/form/div/div/input[@placeholder='Search']")
	private WebElement searchGlobal;

	@FindBy(xpath = "//*[@id=\"exampleFormControlInput1\"]")
	private WebElement txtAlasan;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/button[2]")
	private WebElement btnSubmitAlasan;

	public void gotoSelfRegistration() {
		gotoSelfRegistration.click();
	}

	public void gotoForm() {
		gotoForm.click();
	}

	public void btnLihasSeluruhAnggota() throws InterruptedException {
		btnLihatKaryawan.click();
		Thread.sleep(4000);
		driver.navigate().back();
	}

	public void inputDataUserInformation(String email, String fullname) {
		///// User Information /////////
		inputEmail.sendKeys(email);
		inputFullName.sendKeys(fullname);
	}

	public void openHiddenPassword() throws InterruptedException {
		btnHiddenPassword.click();
		Thread.sleep(3000);
	}

	public void inputDataJobInformation(String jmlCuti, String inputJamMasuk, String inputJamKeluar) {
		///// Job Information /////////
		dropdownLevel.click();
		pilihLevelStaff.click();

		dropdownTipeKaryawan.click();
		pilihTipeKaryawan.click();

		dropdownDepartemen.click();
		pilihDepartemen.click();

		dropdownPosisi.click();
		pilihPosisi.click();

		dropdownJamKerja.click();
		pilihJamKerja.click();

		dropdownLokasi.click();
		pilihLokasi.click();

		dropdownLembur.click();
		pilihLembur.click();

		jumlahCuti.sendKeys(jmlCuti);
		
		jamMasuk.sendKeys(inputJamMasuk);
		jamKeluar.sendKeys(inputJamKeluar);
				
	}

	public void inputDataChooseLeader() {
		///// Choose Leader /////////
		dropdownSupervisor.click();
		pilihLeader.click();

		dropdownSupervisor.click();
		pilihSupervisor.click();

		dropdownManager.click();
		pilihManager.click();

		dropdownHead.click();
		pilihHead.click();

		dropdownGM.click();
		pilihGM.click();
	}

	public void klikSubmit() throws InterruptedException {
		btnSubmit.click();
		Thread.sleep(4000);
	}

	public void hapusData() throws InterruptedException {
		btnReject.click();
		Thread.sleep(4000);
		txtAlasan.sendKeys("syaeful_dummy");
		btnSubmitAlasan.click();
		Thread.sleep(5000);
		gotoSelfRegistration.click();
		Thread.sleep(4000);
	}
	
	public void klikAlert() throws InterruptedException {
        alertSetelahSubmit.click();
        Thread.sleep(2000);
    }
	
	public void klikSearchGlobal() {
		searchGlobal.click();
	}

	public void inputSearchGlobal(String inputSearchGlobalSelfRegistration) {
		searchGlobal.sendKeys(inputSearchGlobalSelfRegistration, Keys.ENTER);
	}


}
