package testWebHadir.glue;

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

import io.cucumber.spring.CucumberContextConfiguration;
import testWebHadir.config.AutomationFrameworkConfiguration;
import testWebHadir.driver.DriverSingleton;
import testWebHadir.pages.Login;
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
import io.cucumber.java.en.When;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {

	private WebDriver driver;
	private Screenshots sc;
	private Login login;
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
		login = new Login();
		reportingKaryawan = new ReportingKaryawan();
		selfRegistration = new SelfRegistration();
		statusRequest = new StatusRequest();
		TestCases[] tests = TestCases.values();
		extentTest = report.createTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}

	///////////// LOGIN /////////////////////

	@Given("User go to the website")
	public void User_go_to_the_website() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(Status.PASS, "Navigating to "+ Constants.URL);
	}	

	@When("User input username password and click SignIn")
	public void User_input_username_password_and_click_SignIn() {
		login.inputLogin(configurationProperties.getUsernameLogin(), configurationProperties.getPasswordLogin());
		// extentTest.log(LogStatus.PASS, "User input username password and click login");
		extentTest.log(Status.PASS, "User input username password and click login");
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
		extentTest.log(Status.FAIL, "User could not find the data entered", MediaEntityBuilder.createScreenCaptureFromPath(Constants.PATH_SCREENSHOT+"searchLeader_reportingKaryawan.png").build());
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
		extentTest.log(Status.FAIL, "User input staff in form search", MediaEntityBuilder.createScreenCaptureFromPath(Constants.PATH_SCREENSHOT+"Global_Search_reportingKaryawan.png").build());
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
		selfRegistration.inputDataUserInformation(configurationProperties.getInEditEmailSelfRegistration(), configurationProperties.getInEditFullnameSelfRegistration());
		extentTest.log(Status.PASS, "User edit user information");
	}
	
	@And("User click open hidden password")
	public void User_click_open_hidden_password() throws InterruptedException {
		selfRegistration.openHiddenPassword();
		extentTest.log(Status.PASS, "User click open hidden password");
	}
	
	@And("User input job information")
	public void User_input_job_information() {
		selfRegistration.inputDataJobInformation(configurationProperties.getInJumlahCutiSelfRegistration(), configurationProperties.getInJamMasukSelfRegistration(), configurationProperties.getInJamKeluarSelfRegistration());
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
		extentTest.log(Status.FAIL, "User input staff in form search", MediaEntityBuilder.createScreenCaptureFromPath(Constants.PATH_SCREENSHOT+"Search_Global_SelfRegistration.png").build());
	}

	///////////// STATUS REQUEST /////////////////////
	@Given("User go to the status request page")
	public void  User_go_to_the_status_request_page() {
		statusRequest.pageStatusRequest();
		extentTest.log(Status.PASS, "User go to the status request page");
	}
	
	@When("show change request data")
	public void show_change_request_data() throws IOException {
		sc.takeScreenshotsFullPage("data_Change_Request");
		extentTest.log(Status.SKIP, "dont show change request data", MediaEntityBuilder.createScreenCaptureFromPath(Constants.PATH_SCREENSHOT+"data_Change_Request.png").build());
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
		extentTest.log(Status.FAIL, "User input staff in form search", MediaEntityBuilder.createScreenCaptureFromPath(Constants.PATH_SCREENSHOT+"Global_Search_ChangeRequestStatus.png").build());
	}

	@After
	public void closeObject() {
		//report.endTest(extentTest);
		report.flush();
	}
	

}
