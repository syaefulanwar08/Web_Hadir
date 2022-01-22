package testWebHadir.utils;

public enum TestCases {

	T1("Testing login page"),
	T2("Testing server setting page"),
	T3("Testing leader page"),
	T4("Testing form regristration page"),
	T5("Testing form staff page"),
	T6("Testing form Register page"),
	T7("Testing the reporting karyawan"),
	T8("Testing the self registration"),
	T9("Testing the status request"),
	T10("Testing page employee type page"),
	T11("Testing page manage hari cuti"),
	T12("Test manage absen poin"),
	T13("Testing the authentication in manage position"),
	T14("Testing authentication and reporting in manage setting"),
	T15("Testing authentication in manage departemen");
	
	private String testName;

	private TestCases(String values) {
		// TODO Auto-generated constructor stub
		this.testName = values;
	}

	public String getTestName() {
		return testName;
	}
	
}
