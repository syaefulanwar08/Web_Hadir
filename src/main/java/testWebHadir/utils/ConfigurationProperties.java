package testWebHadir.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;

	////////////////////////////////////////////////////////////////////////

	@Value("${myusername}")
	private String userName;

	@Value("${password}")
	private String password;

	@Value("${displayname1}")
	private String displayName1;

	@Value("${displayname2}")
	private String displayName2;

	@Value("${displayname3}")
	private String displayName3;

	/////////////////////////////////////////////////////////////////

	@Value("${inputNIKReportingKaryawan}")
	private String inNIKReportingKaryawan;

	@Value("${inputNameReportingKaryawan}")
	private String inNameReportingKaryawan;

	@Value("${inputLeaderReportingKaryawan}")
	private String inLeaderReportingKaryawan;

	@Value("${inputSearchGlobalReportingKaryawan}")
	private String inSearchGlobalReportingKaryawan;

	@Value("${inputEditEmailSelfRegistration}")
	private String inEditEmailSelfRegistration;

	@Value("${inputEditFullnameSelfRegistration}")
	private String inEditFullnameSelfRegistration;

	@Value("${inputJumlahCutiSelfRegistration}")
	private String inJumlahCutiSelfRegistration;

	@Value("${inputJamMasukSelfRegistration}")
	private String inJamMasukSelfRegistration;

	@Value("${inputJamKeluarSelfRegistration}")
	private String inJamKeluarSelfRegistration;

	@Value("${inputSearchGlobalSelfRegistration}")
	private String inSearchGlobalSelfRegistration;

	@Value("${inputSearchGlobalStatusRequest}")
	private String inSearchGlobalStatusRequest;

	public String getBrowser() {
		return browser;
	}

	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getDisplayName1() {
		return displayName1;
	}
	
	public String getDisplayName2() {
		return displayName2;
	}
	
	public String getDisplayName3() {
		return displayName3;
	}
	
	//////////////////////////////////////////////////////////
	
	public String getSearchGlobalStatusRequest() {
		return inSearchGlobalStatusRequest;
	}

	public String getSearchGlobalSelfRegistration() {
		return inSearchGlobalSelfRegistration;
	}

	public String getInEditEmailSelfRegistration() {
		return inEditEmailSelfRegistration;
	}

	public String getInEditFullnameSelfRegistration() {
		return inEditFullnameSelfRegistration;
	}

	public String getInJumlahCutiSelfRegistration() {
		return inJumlahCutiSelfRegistration;
	}

	public String getInJamMasukSelfRegistration() {
		return inJamMasukSelfRegistration;
	}

	public String getInJamKeluarSelfRegistration() {
		return inJamKeluarSelfRegistration;
	}

	public String getSearchGlobalReportingKaryawan() {
		return inSearchGlobalReportingKaryawan;
	}

	public String getInLeaderReportingKaryawan() {
		return inLeaderReportingKaryawan;
	}

	public String getInNameReportingKaryawan() {
		return inNameReportingKaryawan;
	}

	public String getInNIKReportingKaryawan() {
		return inNIKReportingKaryawan;
	}

}
