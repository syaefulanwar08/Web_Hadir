package testWebHadir.utils;

public enum TestCases {

	T1("Testing login page"),
	T2("Testing server setting page"),
	T3("Testing leader page"),
	T4("Testing the reporting karyawan"),
	T5("Testing the self registration"),
	T6("Testing the status request");
	
	private String testName;

	private TestCases(String values) {
		// TODO Auto-generated constructor stub
		this.testName = values;
	}

	public String getTestName() {
		return testName;
	}
	
}
