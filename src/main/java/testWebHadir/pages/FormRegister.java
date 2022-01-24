package testWebHadir.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testWebHadir.driver.DriverSingleton;

public class FormRegister {
private WebDriver driver;
	
	public FormRegister() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy (xpath ="/html/body/div[2]/div/div[3]/button[1]")
//	WebElement btnOKStaff;
	
	@FindBy (css = "#sidenav-main > div > div > ul > li:nth-child(6) > a")
	WebElement formRegister;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div > div.border-0.card-header > div > button")
	WebElement btnRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(1) > input")
	WebElement btnChooseFotoRegister;

	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(2) > input")
	WebElement txtNamaRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(3) > select")
	WebElement txtLevelRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(4) > select")
	WebElement txtLeaderRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(5) > select")
	WebElement txtSupervisorRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(6) > select")
	WebElement txtManagerRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(7) > select")
	WebElement txtHeadRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(8) > select")
	WebElement txtGMRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(9) > input")
	WebElement txtEmailRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(5) > input")
	WebElement txtEmailRegister2;
	
	@FindBy (css ="body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(10) > input")
	WebElement txtUsernameRegister;
	
	@FindBy (css ="body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(11) > input")
	WebElement txtPasswordRegister;
	
	@FindBy (css ="body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(6) > input")
	WebElement txtPasswordRegister2;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(12) > input")
	WebElement txtNIKRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(7) > input")
	WebElement txtNIKRegister2;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(13) > select")
	WebElement txtTipeKaryawanRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(8) > select")
	WebElement txtTipeKaryawanRegister2;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(14) > select")
	WebElement txtPosisiRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(9) > select")
	WebElement txtPosisiRegister2;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(15) > input")
	WebElement txtImeiRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(10) > input")
	WebElement txtImeiRegister2;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(16) > select")
	WebElement txtJamKerjaRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(17) > div > div:nth-child(1) > input")
	WebElement txtJamMasukRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(17) > div > div:nth-child(2) > input")
	WebElement txtJamKeluarRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(11) > select")
	WebElement txtJamKerjaRegister2;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(12) > div > div:nth-child(1) > input")
	WebElement txtJamMasukRegister2;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(12) > div > div:nth-child(2) > input")
	WebElement txtJamKeluarRegister2;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(18) > select")
	WebElement txtLokasiRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(13) > select")
	WebElement txtLokasiRegister2;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(19) > select")
	WebElement txtAbsenPointRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(14) > select")
	WebElement txtAbsenPointRegister2;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(20) > input")
	WebElement txtCutiRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(15) > input")
	WebElement txtCutiRegister2;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(21) > select")
	WebElement txtLemburRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div:nth-child(16) > select")
	WebElement txtLemburRegister2;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-body.text-danger > form > div.row > div.col-md-4.col-lg-4 > button")
	WebElement btnSubmitRegister;
	
	@FindBy (css = "body > div:nth-child(6) > div > div.modal.fade.show > div > div > div.modal-header > button > span")
	WebElement btnCloseRegister;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div > div.border-0.card-header > form > div > div:nth-child(2) > div > select")
	WebElement txtFilterRegister;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div > div.border-0.card-header > form > div > div.col-lg-4 > div > select")
	WebElement txtDivisiRegister;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div > div.border-0.card-header > form > div > div.col-sm-2 > button")
	WebElement btnSearchRegister;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div.shadow.card > ul > li:nth-child(5) > a")
	WebElement btnNextRegister;
	
	@FindBy (xpath = "//a[@aria-label='Go to previous page']")
	WebElement btnPrevRegister;
	
	@FindBy (xpath = "//*[@id=\"t4\"]")
	WebElement btnLihatDetail;
	
	@FindBy (xpath = "//*[@id=\"t1\"]/i")
	WebElement btnUbahData;
	
	@FindBy (xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/form/button")
	WebElement btnSubmitUbahDataRegister;
	
	@FindBy (xpath = "//span[@class='alert-inner--text']")
	WebElement displayRegister;
	
	
	
	public void PageRegister() throws InterruptedException {
		Thread.sleep(2000);
//		btnOKStaff.click();
		formRegister.click();

	}
	
	public void Register() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnRegister.click();	
	}
	
	public void btnChooseFotoRegister(String foto3) {
		btnChooseFotoRegister.sendKeys(foto3);
	}
	
	public void InputBiodataRegister(String fullname4, String level, String supervisor, String manager, String email3, String username2, String password2,
			String nik3, String tipekaryawan, String posisi, String imei3, String jamkerja, String jammasuk, String jamkeluar, String lokasi,
			String absenpoint, String cuti, String lembur) {
		try {
			Thread.sleep(25000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.switchTo().alert().dismiss();
		txtNamaRegister.sendKeys(fullname4);
		txtLevelRegister.sendKeys(level, Keys.ENTER);
		txtLeaderRegister.click();
		txtSupervisorRegister.sendKeys(supervisor,Keys.ENTER);
		txtManagerRegister.sendKeys(manager, Keys.ENTER);
		txtHeadRegister.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		txtGMRegister.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		txtEmailRegister.sendKeys(email3);
		txtUsernameRegister.sendKeys(username2);
		txtPasswordRegister.sendKeys(password2);
		txtNIKRegister.sendKeys(nik3);
		txtTipeKaryawanRegister.sendKeys(tipekaryawan, Keys.ENTER);
		txtPosisiRegister.sendKeys(posisi, Keys.ENTER);
		txtImeiRegister.sendKeys(imei3);
		txtJamKerjaRegister.sendKeys(jamkerja, Keys.ENTER);
		txtJamMasukRegister.sendKeys(jammasuk, Keys.ENTER);
		txtJamKeluarRegister.sendKeys(jamkeluar, Keys.ENTER);
		txtLokasiRegister.sendKeys(lokasi, Keys.ENTER);
		txtAbsenPointRegister.sendKeys(absenpoint, Keys.ENTER);
		txtCutiRegister.sendKeys(cuti, Keys.ENTER);
		txtLemburRegister.sendKeys(lembur, Keys.ENTER);
	}
	
	public void SubmitRegister() {
		btnSubmitRegister.click();
	}
	
	public void SearchKaryawanRegister(String chooseDivisi) {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnCloseRegister.click();
		txtFilterRegister.sendKeys("Divisi", Keys.ENTER);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		txtDivisiRegister.sendKeys(chooseDivisi, Keys.ENTER);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnSearchRegister.click();
	}
	
	public void BtnNextAndPrev() {
		btnNextRegister.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnPrevRegister.click();
	}
	
	public void FormLihatDetail() {
		btnLihatDetail.click();
	}
	
	public void FormUbahData() {
		btnUbahData.click();
	}
	
	public void FotoRegister(String foto3) {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnChooseFotoRegister.sendKeys(foto3);
	}
	
	public void UbahDataRegister(String fullname4, String level, String email4, String password2, String nik4, String tipekaryawan2,
			String imei4, String chooseDivisi, String jamkerja, String jammasuk, String jamkeluar,String lokasi, String absenpoint, String cuti, String lembur3) {
		txtNamaRegister.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		txtNamaRegister.sendKeys(fullname4);
		txtLevelRegister.sendKeys(level, Keys.ENTER);
		txtLeaderRegister.click();
		txtEmailRegister2.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		txtEmailRegister2.sendKeys(email4);
		txtPasswordRegister2.sendKeys(password2);
		txtNIKRegister2.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		txtNIKRegister2.sendKeys(nik4);
		txtTipeKaryawanRegister2.sendKeys(tipekaryawan2, Keys.ENTER);
		txtImeiRegister2.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		txtImeiRegister2.sendKeys(imei4);
		txtPosisiRegister2.sendKeys(chooseDivisi, Keys.ENTER);
		txtJamKerjaRegister2.sendKeys(jamkerja, Keys.ENTER);
		txtJamMasukRegister2.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		txtJamMasukRegister2.sendKeys(jammasuk);
		txtJamKeluarRegister2.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		txtJamKeluarRegister2.sendKeys(jamkeluar);
		txtLokasiRegister2.sendKeys(lokasi, Keys.ENTER);
		txtAbsenPointRegister2.sendKeys(absenpoint,  Keys.ENTER);
		txtCutiRegister2.sendKeys(Keys.CONTROL+"a");
		txtCutiRegister2.sendKeys(cuti);
		txtLemburRegister2.sendKeys(lembur3, Keys.ENTER);
	}
	
	public void SubmitUbahDataRegister() {
		btnSubmitUbahDataRegister.click();
	}
	
	public void alertRegister() {
		try {
			Thread.sleep(20000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.switchTo().alert().accept();
	}
	
	public String displayRegister() {
		return displayRegister.getText();
	}
}
