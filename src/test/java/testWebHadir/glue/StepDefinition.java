package testWebHadir.glue;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import testWebHadir.pages.FormRegister;
import testWebHadir.pages.FormRegristration;
import testWebHadir.pages.FormStaff;

import testWebHadir.pages.LeaderPage;
import testWebHadir.pages.ServerSettingPage;

import io.cucumber.spring.CucumberContextConfiguration;
import testWebHadir.config.AutomationFrameworkConfiguration;
import testWebHadir.driver.DriverSingleton;
import testWebHadir.pages.LoginPage;
import testWebHadir.pages.ReportingKaryawan;
import testWebHadir.pages.SelfRegistration;
import testWebHadir.pages.StatusRequest;
import testWebHadir.screenshots.Screenshots;
import testWebHadir.utils.ConfigurationProperties;
import testWebHadir.utils.Constants;
import testWebHadir.utils.TestCases;
import testWebHadir.utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {

	private WebDriver driver;
	private Screenshots sc;
	private LoginPage loginPage;
	private ServerSettingPage serverSettingPage;
	private LeaderPage leaderPage;
	private FormRegristration formRegristration;
	private FormStaff formStaff;
	private FormRegister formRegister;
	private ReportingKaryawan reportingKaryawan;
	private SelfRegistration selfRegistration;
	private StatusRequest statusRequest;
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports();
	static ExtentSparkReporter htmlreporter = new ExtentSparkReporter("src/main/resources/reportTestWebHadir.html");
//	ExtentTest extentTest;
//	static ExtentReports report = new ExtentReports("src/main/resources/Report.html");

	@Autowired
	ConfigurationProperties configurationProperties;

	@Before
	public void initializeObjects() {
		report.attachReporter(htmlreporter);
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		sc = new Screenshots();
		loginPage = new LoginPage();
		serverSettingPage = new ServerSettingPage();
		leaderPage = new LeaderPage();
		formStaff = new FormStaff();
		formRegristration = new FormRegristration();
		formRegister = new FormRegister();
		reportingKaryawan = new ReportingKaryawan();
		selfRegistration = new SelfRegistration();
		statusRequest = new StatusRequest();
		TestCases[] tests = TestCases.values();
		extentTest = report.createTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}

	///////////// LOGIN /////////////////////

	@Given("^User go to the Website")
	public void user_go_to_the_Website() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(Status.PASS, "Navigating to " + Constants.URL);
	}

	@When("^User input username password and click sign in")
	public void user_input_username_password_and_click_sign_in() {
		loginPage.gotoLogin(configurationProperties.getUserName(), configurationProperties.getPassword());
		extentTest.log(Status.PASS, "User input username password and click sign in");
	}

	@Then("^User can login to the Website")
	public void user_can_login_to_the_Website() {
		assertEquals(configurationProperties.getDisplayName1(), loginPage.getDisplayName1());
		extentTest.log(Status.PASS, "User can login to the Website");
	}

	/////////////////// Scenario Server Setting/////////////////////

	@When("^User go to server setting page")
	public void user_go_to_server_setting_page() {
		serverSettingPage.gotoServerSetting();
		extentTest.log(Status.PASS, "User go to server setting page");
	}

	@Then("^User can edit server data")
	public void user_can_edit_server_data() {
		serverSettingPage.getEditServer();
		extentTest.log(Status.PASS, "User can edit server data");
	}

	//////////////////// Scenario Leader/////////////////////////
	@When("^User go to leader page")
	public void user_go_to_leader_page() {
		leaderPage.gotoLeader();
		extentTest.log(Status.PASS, "User go to leader page");
	}

	@Then("^User can see employee attendance")
	public void user_can_see_employee_attendance() {
		assertEquals(configurationProperties.getDisplayName2(), leaderPage.getDisplayName2());
		extentTest.log(Status.PASS, "User can see employee attendance");
	}

////////////////////Form Registration (Dwiky Kurniawan) \\\\\\\\\\\\\\\\\\\\\\\\\\
	@When("^User Can Open Form Registration")
	public void goToFormRegristration() {
		formRegristration.pageRegist();
		formRegristration.SearchAllPage(configurationProperties.getSearchAllPageDK());
		extentTest.log(Status.PASS, "User Can Open Form Registration");
	}

	@When("^User Open Form Staff From Form Regristration")
	public void goToStafff() {
		formRegristration.PageStaff();
		extentTest.log(Status.PASS, "User Open Form Staff From Form Regristration");
	}

	@When("^User Choose Photos")
	public void goUploadFoto() {
		formRegristration.btnChooseFoto(configurationProperties.getFoto2DK());
		extentTest.log(Status.PASS, "User Choose Photos");
	}

	@When("^User Fill username, email, fullname, password, Imei, dan NIK")
	public void goInputData() {
		formRegristration.InputBiodata(configurationProperties.getUsername2DK(), configurationProperties.getEmail2DK(),
				configurationProperties.getFullname2DK(), configurationProperties.getPasswword2DK(),
				configurationProperties.getImei2DK(), configurationProperties.getNik2DK());
		extentTest.log(Status.PASS, "User Fill username, email, fullname, password, Imei, dan NIK");
	}

	@When("^User Choose level, departemen, posisi kerja, jam kerja, lokasi kerja, lembur, jumlah cuti, jam masuk, jam keluar, absen point, head, and gm")
	public void goChooseDepartement() {
		formRegristration.chooseDepartement(configurationProperties.getLevelDK(),
				configurationProperties.getTipekaryawanDK(), configurationProperties.getDepartemenDK(),
				configurationProperties.getPosisiDK(), configurationProperties.getJamkerjaDK(),
				configurationProperties.getLokasiDK(), configurationProperties.getLemburDK(),
				configurationProperties.getCutiDK(), configurationProperties.getJammasukDK(),
				configurationProperties.getJamkeluarDK(), configurationProperties.getAbsenpointDK(),
				configurationProperties.getLeaderDK(), configurationProperties.getSupervisorDK(),
				configurationProperties.getManagerDK());
		extentTest.log(Status.PASS,
				"User Choose level, departemen, posisi kerja, jam kerja, lokasi kerja, lembur, jumlah cuti, jam masuk, jam keluar, absen point, head, and gm");
	}

	@When("^User Register Employee")
	public void goToSubmit() {
		formRegristration.SubmitRegist();
		extentTest.log(Status.PASS, "User Register Employee");
	}

	@Then("^User Complete Register Employee")
	public void getDisplayFormRegist() {
		formRegristration.DisplayFormRegist();
		assertEquals(configurationProperties.getDisplayFormRegistDK(), formRegristration.DisplayFormRegist());
		formRegristration.OKRegristration();
		extentTest.log(Status.PASS, "User Complete Register Employee");
	}

////////////////////////// Form Staff (Dwiky Kurniawan) \\\\\\\\\\\\\\\\\\\\\\\\\
	@When("^User Can Open Form Staff")
	public void gotoFormSatff() {
		formStaff.FormStaffPage();
		formRegristration.SearchAllPage(configurationProperties.getSearchAllPageDK());
		extentTest.log(Status.PASS, "User Can Open Form Staff");
	}

	@When("^User Searching For Employees Data Based On The Specified Category")
	public void goPageStaff() {
		formStaff.searchEmployee(configurationProperties.getCatNameDK(), configurationProperties.getNameEmployeeDK());
		extentTest.log(Status.PASS, "User Searching For Employees Data Based On The Specified Category");
	}

	@When("^User Open Form View History")
	public void goViewHistory() {
		formStaff.ViewHistory();
		extentTest.log(Status.PASS, "User Open Form View History");
	}

	@When("^User Can Export Employee Absence History Data")
	public void goEksportData() {
		formStaff.pageViewHistory(configurationProperties.getStartDateDK(), configurationProperties.getCatName2DK());
		extentTest.log(Status.PASS, "User Can Export Employee Absence History Data");
	}

	@When("^User Open Form Edit Data Employee")
	public void goEditData() {
		formStaff.formEditData();
		extentTest.log(Status.PASS, "User Open Form Edit Data Employee");
	}

	@When("^User Can Edit Employee Photo")
	public void editFoto() {
		formStaff.editChooseFoto(configurationProperties.getFoto2DK());
		extentTest.log(Status.PASS, "User Can Edit Employee Photo");
	}

	@When("^User Can Edit Employees Data")
	public void editBiodata() {
		formStaff.InputEditBiodata(configurationProperties.getEmail3DK(), configurationProperties.getFullname3DK(),
				configurationProperties.getPassword3DK(), configurationProperties.getImei3DK(),
				configurationProperties.getNik3DK());
		extentTest.log(Status.PASS, "User Can Edit Employees Data");
	}

	@When("^User Can Edit Employee Departement")
	public void editDepartement() {
		formStaff.chooseEditDepartement(configurationProperties.getLevel2DK(),
				configurationProperties.getTipekaryawanDK(), configurationProperties.getDepartemenDK(),
				configurationProperties.getPosisiDK(), configurationProperties.getJammasukDK(),
				configurationProperties.getLokasiDK(), configurationProperties.getLemburDK(),
				configurationProperties.getCutiDK(), configurationProperties.getJammasukDK(),
				configurationProperties.getJamkeluarDK(), configurationProperties.getAbsenpointDK());
		extentTest.log(Status.PASS, "User Can Edit Employee Departement");
	}

	@Then("^User Complete Edit Data")
	public void displaySatff() {
		formStaff.displayFormstaff();
		assertEquals(configurationProperties.getDisplayFormStaffDK(), formStaff.displayFormstaff());
		extentTest.log(Status.PASS, "User Complete Edit Data");
	}

///////////////////////// Form Register (Dwiky Kurniawan) \\\\\\\\\\\\\\\\\\\\\\\\

	@When("^User Can Open Form Register")
	public void goPageRegister() {
		formRegister.PageRegister();
		formRegristration.SearchAllPage(configurationProperties.getSearchAllPageDK());
		extentTest.log(Status.PASS, "User Can Open Form Register");
	}

	@When("^User Add Employee Data In Register Form")
	public void AddRegister() {
		formRegister.Register();
		extentTest.log(Status.PASS, "User Add Employee Data In Register Form");
	}

	@When("^User Choose Profile Picture")
	public void chooseFotoRegisterPage() throws IOException {
		formRegister.btnChooseFotoRegister(configurationProperties.getFoto2DK());
		sc.takeScreenshotsFullPage("Fail Upload Foto");
		extentTest.log(Status.FAIL, MediaEntityBuilder
				.createScreenCaptureFromPath(Constants.PATH_SCREENSHOT + "Fail Upload Foto.png").build());
	}

	@When("^User Fill Employee Data")
	public void biodataRegister() {
		formRegister.InputBiodataRegister(configurationProperties.getFullname4DK(),
				configurationProperties.getLevelDK(), configurationProperties.getSupervisorDK(),
				configurationProperties.getManagerDK(), configurationProperties.getEmail3DK(),
				configurationProperties.getUsername2DK(), configurationProperties.getPasswword2DK(),
				configurationProperties.getNik3DK(), configurationProperties.getTipekaryawanDK(),
				configurationProperties.getPosisiDK(), configurationProperties.getImei3DK(),
				configurationProperties.getJamkerjaDK(), configurationProperties.getJammasukDK(),
				configurationProperties.getJamkeluarDK(), configurationProperties.getLokasiDK(),
				configurationProperties.getAbsenpointDK(), configurationProperties.getCutiDK(),
				configurationProperties.getLemburDK());
		extentTest.log(Status.PASS, "User Fill Employee Data");
	}

	@When("^User Confirm Employee Register")
	public void confirmRegister() throws IOException {
		formRegister.SubmitRegister();
		sc.takeScreenshotsFullPage("Button Fail Register");
		extentTest.log(Status.FAIL, "User Fail Confirm Because Photo Can't Upload", MediaEntityBuilder
				.createScreenCaptureFromPath(Constants.PATH_SCREENSHOT + "Button Fail Register.png").build());
	}

	@When("^User User Searchings For Employee Data Based On The Specified Category")
	public void searchKaryawanRegister() {
		formRegister.SearchKaryawanRegister(configurationProperties.getChooseDivisiDK());
		extentTest.log(Status.PASS, "User User Searching For Employee Data Based On The Specified Category");
	}

	@When("^User Click button Next and Previous")
	public void NextAndPrev() {
		formRegister.BtnNextAndPrev();
		extentTest.log(Status.PASS, "User Click Button Next And Previous");
	}

	@When("^User Click button Lihat Detail")
	public void formLihatDetail() throws IOException {
		formRegister.FormLihatDetail();
		sc.takeScreenshotsFullPage("Fail Button Lihat Detail");
		extentTest.log(Status.FAIL, "User Click Lihat Detail Because It Doesn't Show Anything", MediaEntityBuilder
				.createScreenCaptureFromPath(Constants.PATH_SCREENSHOT + "Fail Button Lihat Detail.png").build());
	}

	@When("^User Click button Ubah Data")
	public void formUbahData() {
		formRegister.FormUbahData();
		extentTest.log(Status.PASS, "User Click Button Ubah Data");
	}

	@When("User Can Replace Photo")
	public void ReplaceFoto() throws IOException {
		formRegister.FotoRegister(configurationProperties.getFoto2DK());
		sc.takeScreenshotsFullPage("Fail Replace Foto");
		extentTest.log(Status.FAIL, "User Fail Replace Foto", MediaEntityBuilder
				.createScreenCaptureFromPath(Constants.PATH_SCREENSHOT + "Fail Replace Foto.png").build());
	}

	@When("^User Can Edits Employees Data")
	public void editDataRegister() {
		formRegister.UbahDataRegister(configurationProperties.getFullname4DK(), configurationProperties.getLevelDK(),
				configurationProperties.getEmail4DK(), configurationProperties.getPasswword2DK(),
				configurationProperties.getNik4DK(), configurationProperties.getTipekaryawan2DK(),
				configurationProperties.getImei4DK(), configurationProperties.getChooseDivisiDK(),
				configurationProperties.getJamkerjaDK(), configurationProperties.getJammasukDK(),
				configurationProperties.getJamkeluarDK(), configurationProperties.getLokasiDK(),
				configurationProperties.getAbsenpointDK(), configurationProperties.getCutiDK(),
				configurationProperties.getLembur3DK());
		extentTest.log(Status.PASS, "User Can Edits Employees Data");
	}

	@When("User Can Edit Employees Data On Form Register")
	public void SubmitUbahDataRegister() throws IOException {
		formRegister.SubmitUbahDataRegister();
		sc.takeScreenshotsFullPage("Fail Edit Data");
		extentTest.log(Status.FAIL, "User Fail Edit Data Employee Because Photo Can't Upload", MediaEntityBuilder
				.createScreenCaptureFromPath(Constants.PATH_SCREENSHOT + "Fail Edit Data.png").build());
	}

	@Then("^User Complete Ubah Data On Form Register")
	public void getDisplayRegisterPage() throws IOException {
		formRegister.alertRegister();
		formRegister.displayRegister();
		assertEquals(configurationProperties.getDisplayRegisterDK(), formRegister.displayRegister());
		sc.takeScreenshotsFullPage("Gagal Ubah Data");
		extentTest.log(Status.FAIL, "User Fail Edit Data Employee Because Photo Can't Upload", MediaEntityBuilder
				.createScreenCaptureFromPath(Constants.PATH_SCREENSHOT + "Gagal Ubah Data.png").build());
	}
	///////////// REPORTING KARYAWAN /////////////////////

	@Given("User go to the reporting karyawan page")
	public void User_go_to_the_reporting_karyawan_page() {
		reportingKaryawan.gotoReportingKaryawan();
		extentTest.log(Status.PASS, "User go to the reporting karyawan page");
	}

	@When("User click dropdown list for NIK")
	public void User_click_dropdown_list_for_NIK() {
		reportingKaryawan.klikDropdownList();
		extentTest.log(Status.PASS, "User click dropdown list for NIK");
	}

	@And("User click list NIK")
	public void User_click_list_NIK() {
		reportingKaryawan.klikListNik();
		extentTest.log(Status.PASS, "User click list NIK");
	}

	@And("User input NIK in form search and click button search")
	public void User_input_NIK_in_form_search_and_click_button_search() throws InterruptedException {
		reportingKaryawan.searchByNik(configurationProperties.getInNIKReportingKaryawan());
		extentTest.log(Status.PASS, "User input NIK in form search and click button search");
	}

	@When("User click dropdown list for Name")
	public void User_click_dropdown_list_for_Name() {
		reportingKaryawan.klikDropdownList();
		extentTest.log(Status.PASS, "User click dropdown list for Name");
	}

	@And("User click list name")
	public void User_click_list_name() {
		reportingKaryawan.klikListName();
		extentTest.log(Status.PASS, "User click list name");
	}

	@And("User input name in form search and click button search")
	public void User_input_name_in_form_search_and_click_button_search() throws InterruptedException {
		reportingKaryawan.searchByName(configurationProperties.getInNameReportingKaryawan());
		extentTest.log(Status.PASS, "User input name in form search and click button search");
	}

	@When("User click dropdown list for Leader")
	public void User_click_dropdown_list_for_Leader() {
		reportingKaryawan.klikDropdownList();
		extentTest.log(Status.PASS, "User click dropdown list for Leader");
	}

	@And("User click list leader")
	public void User_click_list_leader() {
		reportingKaryawan.klikListLeader();
		extentTest.log(Status.PASS, "User click list leader");
	}

	@And("User input leader in form search and click button search")
	public void User_input_leader_in_form_search_and_click_button_search() throws InterruptedException, IOException {
		reportingKaryawan.searchByName(configurationProperties.getInLeaderReportingKaryawan());
		sc.takeScreenshotsSectionPage("//*[@id=\"root\"]/div/div[2]", "searchLeader_reportingKaryawan");
		extentTest.log(Status.FAIL, "User could not find the data entered", MediaEntityBuilder
				.createScreenCaptureFromPath(Constants.PATH_SCREENSHOT + "searchLeader_reportingKaryawan.png").build());
	}

	@When("User click dropdown list for divisi")
	public void User_click_dropdown_list_for_divisi() {
		reportingKaryawan.klikDropdownList();
		extentTest.log(Status.PASS, "User click dropdown list for Leader");
	}

	@And("User click dropdown list divisi")
	public void User_click_dropdown_list_divisi() {
		reportingKaryawan.klikListDivisi();
		extentTest.log(Status.PASS, "User click list leader");
	}

	@And("User input divisi in form search and click button search")
	public void User_input_divisi_in_form_search_and_click_button_search() throws InterruptedException {
		reportingKaryawan.searchByDivisi();
		extentTest.log(Status.PASS, "User input leader in form search and click button search");
	}

	@When("User choose all data karyawan")
	public void User_choose_all_data_karyawan() {
		reportingKaryawan.pilihAllKaryawan();
		extentTest.log(Status.PASS, "User choose all data karyawan");
	}

	@And("User click button export to excel")
	public void User_click_button_export_to_excel() {
		reportingKaryawan.klikBtnExport();
		extentTest.log(Status.PASS, "User click button export to excel");
	}

	@And("User select the specified time and click button search")
	public void User_select_the_specified_time_and_click_button_search() throws InterruptedException {
		reportingKaryawan.pilihWaktu();
		extentTest.log(Status.PASS, "User select the specified time and click button search");
	}

	@When("User click card body staff")
	public void User_click_card_body_staff() throws InterruptedException {
		reportingKaryawan.klikCardBodyStaff();
		extentTest.log(Status.PASS, "User click card body staff");
	}

	@And("User click card body supervisor")
	public void User_click_card_body_supervisor() throws InterruptedException {
		reportingKaryawan.klikCardBodySupervisor();
		extentTest.log(Status.PASS, "User click card body supervisor");
	}

	@And("User click card body leader")
	public void User_click_card_body_leader() throws InterruptedException {
		reportingKaryawan.klikCardBodyLeader();
		extentTest.log(Status.PASS, "User click card body leader");
	}

	@And("User click card body manager")
	public void User_click_card_body_manager() throws InterruptedException {
		reportingKaryawan.klikCardBodyManager();
		extentTest.log(Status.PASS, "User click card body manager");
	}

	@And("User click card body change request")
	public void User_click_card_body_change_request() throws InterruptedException {
		reportingKaryawan.klikCardBodyChangeRequest();
		extentTest.log(Status.PASS, "User click card body change request");
	}

	@And("User click card body head")
	public void User_click_card_body_head() throws InterruptedException {
		reportingKaryawan.klikCardBodyHead();
		extentTest.log(Status.PASS, "User click card body head");
	}

	@When("User click search global reporting karyawan page")
	public void User_click_search_global_reporting_karyawan_page() {
		reportingKaryawan.klikSearchGlobal();
		extentTest.log(Status.PASS, "User click search global reporting karyawan page");
	}

	@And("User input staff in form search reporting karyawan page")
	public void User_input_staff_in_form_search_reporting_karyawan_page() throws InterruptedException, IOException {
		reportingKaryawan.inputSearchGlobal(configurationProperties.getSearchGlobalReportingKaryawan());
		sc.takeScreenshotsSectionPage("//*[@id=\"navbar-main\"]/div/form/div/div", "Global_Search_reportingKaryawan");
		extentTest.log(Status.FAIL, "User input staff in form search",
				MediaEntityBuilder
						.createScreenCaptureFromPath(Constants.PATH_SCREENSHOT + "Global_Search_reportingKaryawan.png")
						.build());
	}

	///////////// SELF REGISTRATION /////////////////////
	@Given("User go to the self registration page")
	public void User_go_to_the_self_registration_page() {
		selfRegistration.gotoSelfRegistration();
		extentTest.log(Status.PASS, "User go to the self registration page");
	}

	@When("User click button gotoForm")
	public void User_click_button_gotoForm() {
		selfRegistration.gotoForm();
		extentTest.log(Status.PASS, "User click button gotoForm");
	}

	@And("User click button lihat seluruh anggota karyawan")
	public void User_click_button_lihat_seluruh_anggota_karyawan() throws InterruptedException {
		selfRegistration.btnLihasSeluruhAnggota();
		extentTest.log(Status.PASS, "User click button lihat seluruh anggota karyawan");
	}

	@And("User edit user information")
	public void User_edit_user_information() {
		selfRegistration.inputDataUserInformation(configurationProperties.getInEditEmailSelfRegistration(),
				configurationProperties.getInEditFullnameSelfRegistration());
		extentTest.log(Status.PASS, "User edit user information");
	}

	@And("User click open hidden password")
	public void User_click_open_hidden_password() throws InterruptedException {
		selfRegistration.openHiddenPassword();
		extentTest.log(Status.PASS, "User click open hidden password");
	}

	@And("User input job information")
	public void User_input_job_information() {
		selfRegistration.inputDataJobInformation(configurationProperties.getInJumlahCutiSelfRegistration(),
				configurationProperties.getInJamMasukSelfRegistration(),
				configurationProperties.getInJamKeluarSelfRegistration());
		extentTest.log(Status.PASS, "User input job information");
	}

	@And("User input choose leader")
	public void User_input_choose_leader() {
		selfRegistration.inputDataChooseLeader();
		extentTest.log(Status.PASS, "User input choose leader");
	}

	@And("User click submit")
	public void User_click_submit() throws InterruptedException {
		selfRegistration.klikSubmit();
		extentTest.log(Status.PASS, "User click submit");
	}

	@And("User click button reject")
	public void User_click_button_reject() throws InterruptedException {
		selfRegistration.hapusData();
		extentTest.log(Status.PASS, "User click button reject");
	}

	@When("User click search global self registration page")
	public void User_click_search_global_self_registration_page() {
		selfRegistration.klikSearchGlobal();
		extentTest.log(Status.PASS, "User click search global self registration page");
	}

	@And("User input staff in form search self registration page")
	public void User_input_staff_in_form_search_self_registration_page() throws IOException {
		selfRegistration.inputSearchGlobal(configurationProperties.getSearchGlobalSelfRegistration());
		sc.takeScreenshotsSectionPage("//*[@id=\"navbar-main\"]", "Search_Global_SelfRegistration");
		extentTest.log(Status.FAIL, "User input staff in form search", MediaEntityBuilder
				.createScreenCaptureFromPath(Constants.PATH_SCREENSHOT + "Search_Global_SelfRegistration.png").build());
	}

	///////////// STATUS REQUEST /////////////////////
	@Given("User go to the status request page")
	public void User_go_to_the_status_request_page() {
		statusRequest.pageStatusRequest();
		extentTest.log(Status.PASS, "User go to the status request page");
	}

	@When("show change request data")
	public void show_change_request_data() throws IOException {
		sc.takeScreenshotsFullPage("data_Change_Request");
		extentTest.log(Status.SKIP, "dont show change request data", MediaEntityBuilder
				.createScreenCaptureFromPath(Constants.PATH_SCREENSHOT + "data_Change_Request.png").build());
	}

	@When("User click search global status request page")
	public void User_click_search_global_status_request_page() {
		statusRequest.klikSearchGlobal();
		extentTest.log(Status.PASS, "User click search global");
	}

	@And("User input staff in form search status request page")
	public void User_input_staff_in_form_search_status_request_page() throws IOException {
		statusRequest.inputSearchGlobal(configurationProperties.getSearchGlobalStatusRequest());
		sc.takeScreenshotsSectionPage("//*[@id=\"navbar-main\"]", "Global_Search_ChangeRequestStatus");
		extentTest.log(Status.FAIL, "User input staff in form search", MediaEntityBuilder
				.createScreenCaptureFromPath(Constants.PATH_SCREENSHOT + "Global_Search_ChangeRequestStatus.png")
				.build());
	}

	@After
	public void closeObject() {
		// report.endTest(extentTest);
		report.flush();
	}

}
