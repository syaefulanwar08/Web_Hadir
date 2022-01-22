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
	
	@Value("${searchAllPageDK}")
	private String searchAllPageDK;
	
	@Value("${foto2DK}")
	private String foto2DK;
	
	@Value("${username2DK}")
	private String username2DK;
	
	@Value("${email2DK}")
	private String email2DK;
	
	@Value("${fullname2DK}")
	private String fullname2DK;
	
	@Value("${password2DK}")
	private String passwword2DK;
	
	@Value("${imei2DK}")
	private String imei2DK;
	
	@Value("${nik2DK}")
	private String nik2DK;
	
	@Value("${levelDK}")
	private String levelDK;
	
	@Value("${tipekaryawanDK}")
	private String tipekaryawanDK;
	
	@Value("${departemenDK}")
	private String departemenDK;
	
	@Value("${posisiDK}")
	private String posisiDK;
	
	@Value("${jamkerjaDK}")
	private String jamkerjaDK;
	
	@Value("${lokasiDK}")
	private String lokasiDK;
	
	@Value("${lemburDK}")
	private String lemburDK;
	
	@Value("${cutiDK}")
	private String cutiDK;
	
	@Value("${jammasukDK}")
	private String jammasukDK;
	
	@Value("${jamkeluarDK}")
	private String jamkeluarDK;
	
	@Value("${absenpointDK}")
	private String absenpointDK;
	
	@Value("${leaderDK}")
	private String leaderDK;
	
	@Value("${supervisorDK}")
	private String supervisorDK;
	
	@Value("${managerDK}")
	private String managerDK;
	
	@Value("${displayFormRegistDK}")
	private String displayFormRegistDK;
	
	@Value("${foto3DK}")
	private String foto3DK;
	
	@Value("${email3DK}")
	private String email3DK;
	
	@Value("${fullname3DK}")
	private String fullname3DK;
	
	@Value("${password3DK}")
	private String password3DK;
	
	@Value("${imei3DK}")
	private String imei3DK;
	
	@Value("${nik3DK}")
	private String nik3DK;
	
	@Value("${startDateDK}")
	private String startDateDK;
	
	@Value("${displayFormStaffDK}")
	private String displayFormStaffDK;
	
	@Value("${categoryDK")
	private String categoryDK;
	
	@Value("${chooseDivisiDK}")
	private String chooseDivisiDK;
	
	@Value("${lembur3DK}")
	private String lembur3DK;
	
	@Value("${nik4DK}")
	private String nik4DK;
	
	@Value("${fullname4DK}")
	private String fullname4DK;
	
	@Value("${imei4DK}")
	private String imei4DK;
	
	@Value("${email4DK}")
	private String email4DK;
	
	@Value("${tipekaryawan2DK}")
	private String tipekaryawan2DK;
	
	@Value("${displayRegisterDK}")
	private String displayRegisterDK;
	
	@Value("${catNameDK}")
	private String catNameDK;
	
	@Value("${nameEmployeeDK}")
	private String nameEmployeeDK;
	
	@Value("${catName2DK}")
	private String catName2DK;
	
	@Value("${level2DK}")
	private String level2DK;
	
	///////////////////////////////////////////////////////////////

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
	
	////////////Modul posisi, modul setting, modul departemen ///////////////////
	@Value("${inputPosisi}")
	private String inPosisi;
	
	@Value("${editPosisi}")
	private String editPosisi;
	
	@Value("${inputTimer}")
	private String inTimer;
	
	@Value("${inputRadius}")
	private String inRadius;
	
	@Value("${inputDepartemen}")
	private String inDepartemen;
	
	@Value("${editDepartemen}")
	private String editDepartemen;
	
	@Value("${searchPosisi}")
	private String searchPosisi;
	
	@Value("${searchSetting}")
	private String searchSetting;
	
	@Value("${searchDepartemen}")
	private String searchDepartemen;
	
	//////////// Modul Tipe, Modul Hari Cuti, Modul Absen Point ///////////
	
	@Value("${tipeKaryawan1}")
	private String tipeKaryawan1;
	
	@Value("${searchTipe}")
	private String searchTipe;
	
	@Value("${searchHariCuti}")
	private String searchHariCuti;
	
	@Value("${searchAbsenPoint}")
	private String searchAbsenPoint;
	
	@Value("${setHariCuti}")
	private String setHariCuti;
	
	@Value("${inputTempatAbsen}")
	private String inTempatAbsen;
	
	@Value("${inputNamaLokasi}")
	private String inNamaLokasi;
	
	@Value("${inputLatitude}")
	private String inLatitude;
	
	@Value("${inputLongitude}")
	private String inLongitude;
	
	@Value("${editTempatAbsen}")
	private String editTempatAbsen;
	
	@Value("${editLatitude}")
	private String editLatitude;
	
	@Value("${editLongitude}")
	private String editLongitude;

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

	public String getSearchAllPageDK() {
		return searchAllPageDK;
	}

	/////////////////////////////////////////////////////////////
	
	public String getFoto2DK() {
		return foto2DK;
	}

	public String getUsername2DK() {
		return username2DK;
	}

	public String getEmail2DK() {
		return email2DK;
	}

	public String getFullname2DK() {
		return fullname2DK;
	}

	public String getPasswword2DK() {
		return passwword2DK;
	}

	public String getImei2DK() {
		return imei2DK;
	}

	public String getNik2DK() {
		return nik2DK;
	}

	public String getLevelDK() {
		return levelDK;
	}

	public String getTipekaryawanDK() {
		return tipekaryawanDK;
	}

	public String getDepartemenDK() {
		return departemenDK;
	}

	public String getPosisiDK() {
		return posisiDK;
	}

	public String getJamkerjaDK() {
		return jamkerjaDK;
	}

	public String getLokasiDK() {
		return lokasiDK;
	}

	public String getLemburDK() {
		return lemburDK;
	}

	public String getCutiDK() {
		return cutiDK;
	}

	public String getJammasukDK() {
		return jammasukDK;
	}

	public String getJamkeluarDK() {
		return jamkeluarDK;
	}

	public String getAbsenpointDK() {
		return absenpointDK;
	}

	public String getLeaderDK() {
		return leaderDK;
	}

	public String getSupervisorDK() {
		return supervisorDK;
	}

	public String getManagerDK() {
		return managerDK;
	}

	public String getDisplayFormRegistDK() {
		return displayFormRegistDK;
	}

	public String getFoto3DK() {
		return foto3DK;
	}

	public String getEmail3DK() {
		return email3DK;
	}

	public String getFullname3DK() {
		return fullname3DK;
	}

	public String getPassword3DK() {
		return password3DK;
	}

	public String getImei3DK() {
		return imei3DK;
	}

	public String getNik3DK() {
		return nik3DK;
	}

	public String getStartDateDK() {
		return startDateDK;
	}

	public String getDisplayFormStaffDK() {
		return displayFormStaffDK;
	}

	public String getCategoryDK() {
		return categoryDK;
	}

	public String getChooseDivisiDK() {
		return chooseDivisiDK;
	}

	public String getLembur3DK() {
		return lembur3DK;
	}

	public String getNik4DK() {
		return nik4DK;
	}

	public String getFullname4DK() {
		return fullname4DK;
	}

	public String getImei4DK() {
		return imei4DK;
	}

	public String getEmail4DK() {
		return email4DK;
	}

	public String getTipekaryawan2DK() {
		return tipekaryawan2DK;
	}

	public String getDisplayRegisterDK() {
		return displayRegisterDK;
	}

	public String getCatNameDK() {
		return catNameDK;
	}

	public String getNameEmployeeDK() {
		return nameEmployeeDK;
	}

	public String getCatName2DK() {
		return catName2DK;
	}

	public String getLevel2DK() {
		return level2DK;
	}
	
	/////////////////////////////////////////////////
	
	public String getInSearchGlobalReportingKaryawan() {
		return inSearchGlobalReportingKaryawan;
	}

	public String getInSearchGlobalSelfRegistration() {
		return inSearchGlobalSelfRegistration;
	}

	public String getInSearchGlobalStatusRequest() {
		return inSearchGlobalStatusRequest;
	}

	//////////////////////////////////////////////////////////
	
	public String getInPosisi() {
		return inPosisi;
	}

	public String getEditPosisi() {
		return editPosisi;
	}

	public String getInTimer() {
		return inTimer;
	}

	public String getInRadius() {
		return inRadius;
	}

	public String getInDepartemen() {
		return inDepartemen;
	}

	public String getEditDepartemen() {
		return editDepartemen;
	}

	public String getSearchPosisi() {
		return searchPosisi;
	}

	public String getSearchSetting() {
		return searchSetting;
	}

	public String getSearchDepartemen() {
		return searchDepartemen;
	}
	
	//////////////////////////////////////////////////
	
	public String getSearchTipe() {
		return searchTipe;
	}

	public String getSearchHariCuti() {
		return searchHariCuti;
	}

	public String getSearchAbsenPoint() {
		return searchAbsenPoint;
	}

	public String getSetHariCuti() {
		return setHariCuti;
	}

	public String getInTempatAbsen() {
		return inTempatAbsen;
	}

	public String getInNamaLokasi() {
		return inNamaLokasi;
	}

	public String getInLatitude() {
		return inLatitude;
	}

	public String getInLongitude() {
		return inLongitude;
	}

	public String getEditTempatAbsen() {
		return editTempatAbsen;
	}

	public String getEditLatitude() {
		return editLatitude;
	}

	public String getEditLongitude() {
		return editLongitude;
	}
	
	public String getTipeKaryawan1() {
		return tipeKaryawan1;
	}
}
