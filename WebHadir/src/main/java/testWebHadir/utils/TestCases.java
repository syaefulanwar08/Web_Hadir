package testWebHadir.utils;

public enum TestCases {

	T1("Testing the authentication login"),
	T2("Testing the reporting karyawan"),
	T3("Testing the self registration"),
	T4("Testing the status request");
	
	private String testName;

	private TestCases(String values) {
		// TODO Auto-generated constructor stub
		this.testName = values;
	}

	public String getTestName() {
		return testName;
	}
	
}
