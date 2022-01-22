Feature: Manage Departemen

	Scenario: Testing authentication in manage departemen
		Given User go to manage departemen page
		When User click tambah button in departemen page
		And User input new departemen and submit
		When User click ubah data button in departemen page
		And User input edited data and submit in departemen page
		When User click hapus data and submit in departemen page
		When User click search bar departemen
		And User input data search departemen