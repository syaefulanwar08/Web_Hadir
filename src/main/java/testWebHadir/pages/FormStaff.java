package testWebHadir.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testWebHadir.driver.DriverSingleton;

public class FormStaff {
private WebDriver driver;
	
	public FormStaff() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@type='file']")
	WebElement btnChooseFoto;
	
	@FindBy (css = "#root > div > div.mt--8.container > div > div > div > div > form > div.text-center > button")
	WebElement btnSignin;
	
	@FindBy (id ="input-username")
	WebElement txtUsername;
	
	@FindBy (css = "#input-email")
	WebElement txtEmail;
	
	@FindBy (css = "#input-first-name")
	WebElement txtFullName;
	
	@FindBy (css ="#input-password")
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
	
	@FindBy (id = "input-jam-kerja")
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
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div.bg-secondary.shadow.card > div.card-body > form > div:nth-child(8) > div > select")
	WebElement txtGM;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div.bg-secondary.shadow.card > div.card-body > form > div:nth-child(9) > div > div > button")
	WebElement btnSubmit;
	
	@FindBy (css = "#sidenav-main > div > div > ul > li:nth-child(5) > a")
	WebElement FormStaff;
	
	@FindBy (css = "#root > div > div.mt-2.container-fluid > div > div.border-0.p-1.ml-2.card-header > form > div > div:nth-child(2) > div > select")
	WebElement lstCategory;
	
	@FindBy (css = "#root > div > div.mt-2.container-fluid > div > div.border-0.p-1.ml-2.card-header > form > div > div.col-lg-4 > div > input")
	WebElement searchCategory;
	
	@FindBy (css = "button[type='submit']")
	WebElement btnSearchStaff;
	
	@FindBy (css = "#root > div > div.mt-2.container-fluid > div > div.row > div:nth-child(1) > div > div.pt-0.pt-md-4.card-body > div > div.mt-2 > a:nth-child(1) > button")
	WebElement btnViewHistory;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div > div.border-0.card-header > form > div > div.col-md-2.col-sm-12 > div > div > select")
	WebElement FilterCategory;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div > div.border-0.card-header > form > div > div.col-md-3.col-sm-12 > div > div > div.rdt.rdtOpen > input")
	WebElement SetDate;
	
	@FindBy (css ="#root > div > div.mt--8.container-fluid > div > div > div > div.border-0.card-header > form > div > div.col-md-3.col-sm-12 > div > div > div.rdt.rdtOpen > div")
	WebElement pickerDate;
	
	@FindBy (xpath = "//input[@placeholder='Set start date']")
	WebElement setStartDate;
	
	@FindBy (xpath = "//div[@class='rdtPicker']//th[@class='rdtSwitch']")
	WebElement setStartDateMonthandYear;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div > div.border-0.card-header > form > div > div:nth-child(3) > div > div > div.rdt.rdtOpen > div > div > table > thead > tr:nth-child(1) > th.rdtPrev")
	WebElement PrevStartMonth;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div > div.border-0.card-header > form > div > div:nth-child(3) > div > div > div.rdt.rdtOpen > div > div > table > tbody > tr:nth-child(2) > td:nth-child(1)")
	WebElement setStartDateDay;
	
	@FindBy (xpath = "//input[@placeholder='Set end date']")
	WebElement setEndDate;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div > div.border-0.card-header > form > div > div:nth-child(4) > div > div > div.rdt.rdtOpen > div > div > table > tbody > tr:nth-child(6) > td:nth-child(2)")
	WebElement setEndDateDay;
	
	@FindBy (css = "#root > div > div.mt--8.container-fluid > div > div > div > div.border-0.card-header > form > div > div.text-center.mt--4 > button")
	WebElement btnSearchDate;
	
	@FindBy (css ="#eskport")
	WebElement btnEksporData;
	
	@FindBy (css ="#root > div > div.mt-2.container-fluid > div > div.row > div:nth-child(1) > div > div.pt-0.pt-md-4.card-body > div > div.mt-2 > a:nth-child(2) > button")
	WebElement btnEditData;
	
	@FindBy (xpath ="//div[@class='swal2-content']")
	WebElement displayFormStaff;
	
	@FindBy (xpath ="/html/body/div[2]/div/div[3]/button[1]")
	WebElement btnOKStaff;
	

	
	public void FormStaffPage() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		FormStaff.click();
	}
	
	public void searchEmployee(String catName, String nameEmployee) {
		
		lstCategory.sendKeys(catName, Keys.ENTER);
		searchCategory.sendKeys(nameEmployee);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnSearchStaff.click();
	}
	
	public void ViewHistory() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnViewHistory.click();
	}
	
	
	public void pageViewHistory(String startDate, String catName2) {
		String month = startDate;
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		FilterCategory.sendKeys(catName2, Keys.ENTER);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		setStartDate.click();
		while(true) {
			String textStart = setStartDateMonthandYear.getText();
			
			if (textStart.equals(month)) {
			
			break;
		}
		else {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			PrevStartMonth.click();
		}
		
	}
		setStartDateDay.click();
		setEndDate.click();
		setEndDateDay.click();
		btnSearchDate.click();
		btnEksporData.click();
		driver.navigate().back();
	}
	
	
		
		public void formEditData () {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnEditData.click();
			
		}
	
	public void editChooseFoto(String foto2) {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnChooseFoto.sendKeys(foto2);
		
	}
		
	public void InputEditBiodata(String email3, String fullname3, String password3, String imei3, String nik3) {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		txtEmail.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		txtEmail.sendKeys(email3);
		txtFullName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		txtFullName.sendKeys(fullname3);
		txtPassword.sendKeys(password3);
		txtImei.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		txtImei.sendKeys(imei3);
		txtNIK.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		txtNIK.sendKeys(nik3);
				
	}
		
	public void chooseEditDepartement(String level2, String tipekaryawan, String departemen, String posisi, String jamkerja, String lokasi, String lembur, String cuti,
			String jammasuk, String jamkeluar, String absenpoint) {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		txtLevel.sendKeys(level2, Keys.ENTER);
		txtTipeKaryawan.sendKeys(tipekaryawan, Keys.ENTER);
		txtDepartemen.sendKeys(departemen, Keys.ENTER);
		txtPosisi.sendKeys(posisi, Keys.ENTER);
		txtJamKerja.sendKeys(jamkerja, Keys.ENTER);
		txtLokasi.sendKeys(lokasi, Keys.ENTER);
		txtLembur.sendKeys(lembur, Keys.ENTER);
		txtCuti.sendKeys(Keys.CONTROL+"a");
		txtCuti.sendKeys(cuti);
		txtJamMasuk.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		txtJamMasuk.sendKeys(jammasuk);
		txtJamKeluar.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		txtJamKeluar.sendKeys(jamkeluar);
		txtAbsenPoint.sendKeys(absenpoint,  Keys.ENTER);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		txtGM.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		btnSubmit.click();
		
	}
	
	public String displayFormstaff() {
		return displayFormStaff.getText();
	}
}
