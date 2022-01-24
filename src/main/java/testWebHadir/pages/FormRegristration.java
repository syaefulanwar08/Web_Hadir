package testWebHadir.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testWebHadir.driver.DriverSingleton;

public class FormRegristration {
private WebDriver driver;
	
	public FormRegristration() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (css = "#sidenav-main > div > div > ul > li:nth-child(4) > a")
	WebElement formRegrist;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div.bg-secondary.shadow.card > div.bg-white.border-0.card-header > div > div.text-right.col-4 > a > button")
	WebElement btnStaff;
	
	@FindBy (xpath = "//input[@type='file']")
	WebElement btnChooseFoto;
	
	@FindBy (css = "#root > div > div.mt--8.container > div > div > div > div > form > div.text-center > button")
	WebElement btnSignin;
	
	@FindBy (id ="input-username")
	WebElement txtUsername;
	
	@FindBy (id = "input-email")
	WebElement txtEmail;
	
	@FindBy (id = "input-first-name")
	WebElement txtFullName;
	
	@FindBy (id ="input-password")
	WebElement txtPassword;
	
	@FindBy (id = "input-imei")
	WebElement txtImei;
	
	@FindBy (id = "input-nik")
	WebElement txtNIK;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div.bg-secondary.shadow.card > div.card-body > form > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div > select")
	WebElement txtLevel;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div.bg-secondary.shadow.card > div.card-body > form > div:nth-child(5) > div:nth-child(1) > div:nth-child(3) > div > select")
	WebElement txtTipeKaryawan;
	
	@FindBy (id = "input-deptName")
	WebElement txtDepartemen;
	
	@FindBy (id = "input-posisi")
	WebElement txtPosisi;
	
	@FindBy (xpath = "//*[@id=\"input-jam-kerja\"]")
	WebElement txtJamKerja;
	
	@FindBy (id = "input-lokasi")
	WebElement txtLokasi;
	
	@FindBy (id = "input-lembur")
	WebElement txtLembur;
	
	@FindBy (xpath = "//input[@type=\"number\"]")
	WebElement txtCuti;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div.bg-secondary.shadow.card > div.card-body > form > div:nth-child(5) > div:nth-child(4) > div > div > div > div:nth-child(1) > input")
	WebElement txtJamMasuk;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div.bg-secondary.shadow.card > div.card-body > form > div:nth-child(5) > div:nth-child(4) > div > div > div > div:nth-child(2) > input")
	WebElement txtJamKeluar;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div.bg-secondary.shadow.card > div.card-body > form > div:nth-child(5) > div:nth-child(5) > div > div > select")
	WebElement txtAbsenPoint;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div.bg-secondary.shadow.card > div.card-body > form > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div > select")
	WebElement txtLeader;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div.bg-secondary.shadow.card > div.card-body > form > div:nth-child(8) > div:nth-child(1) > div:nth-child(2) > div > select")
	WebElement txtSupervisor;
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/form/div[3]/div[1]/div[3]/div/select")
	WebElement txtManager;
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/form/div[3]/div[2]/div[1]/div/select")
	WebElement txtHead;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div.bg-secondary.shadow.card > div.card-body > form > div:nth-child(8) > div:nth-child(2) > div:nth-child(2) > div > select")
	WebElement txtGM;
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/form/div[4]/div/div/button")
	WebElement btnSubmit;
	
	@FindBy (css = "#swal2-content")
	WebElement displayFormRegist;
	
	@FindBy (css = "body > div.swal2-container.swal2-center.swal2-fade.swal2-shown > div > div.swal2-actions > button.swal2-confirm.swal2-styled")
	WebElement btnOKRegistration;
	
	@FindBy (css = "#navbar-main > div > form > div > div > input")
	WebElement btnSearchPage;
	
	public void pageRegist() {
		formRegrist.click();
	}
	
	public void SearchAllPage(String searchAllPage) {
		btnSearchPage.sendKeys(searchAllPage, Keys.ENTER);
	}
	
	public void PageStaff() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnStaff.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		formRegrist.click();		
	}
	
	public void btnChooseFoto(String foto2) {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnChooseFoto.sendKeys(foto2);
	}
	
	public void InputBiodata(String username2, String email2, String fullname2, String password2, String imei2, String nik2) {
//		try {
//			Thread.sleep(10000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		txtUsername.sendKeys(username2);
		txtEmail.sendKeys(email2);
		txtFullName.sendKeys(fullname2);
		txtPassword.sendKeys(password2);
		txtImei.sendKeys(imei2);
		txtNIK.sendKeys(nik2);
	}
		
	
	public void chooseDepartement(String level, String tipekaryawan, String departemen, String posisi, String jamkerja, String lokasi, String lembur, String cuti,
			String jammasuk, String jamkeluar, String absenpoint, String leader, String supervisor, String manager) {
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		txtLevel.sendKeys(level, Keys.ENTER);
		txtTipeKaryawan.sendKeys(tipekaryawan, Keys.ENTER);
		txtDepartemen.sendKeys(departemen, Keys.ENTER);
		txtPosisi.sendKeys(posisi, Keys.ENTER);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		txtJamKerja.sendKeys(jamkerja, Keys.ENTER);
		txtLokasi.sendKeys(lokasi, Keys.ENTER);
		txtLembur.sendKeys(lembur, Keys.ENTER);
		txtCuti.sendKeys(Keys.CONTROL+"a");
		txtCuti.sendKeys(cuti);
		txtJamMasuk.sendKeys(jammasuk);
		txtJamKeluar.sendKeys(jamkeluar);
		txtAbsenPoint.sendKeys(absenpoint);
		txtLeader.sendKeys(leader);
		txtSupervisor.sendKeys(supervisor);
		txtManager.sendKeys(manager);
		txtHead.sendKeys(Keys.ARROW_DOWN);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		txtGM.sendKeys(Keys.ARROW_DOWN);
		
	}
	
	public void SubmitRegist() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnSubmit.click();
	}
	
	public String DisplayFormRegist() throws InterruptedException {
		Thread.sleep(3000);
		return displayFormRegist.getText();
	}
	
	public void OKRegristration() throws InterruptedException {
		Thread.sleep(2000);
		btnOKRegistration.click();
	}
}
