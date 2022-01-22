Feature: Manage Posisi

	Scenario: Testing the authentication in manage position
		Given User go to manage position page
		When User click tambah button in position page
		And User input new name position and submit
		When User click ubah data button in position page
		And User input edited data in position page and submit
		When User click hapus data button in position page
		When User click search bar position
		And User input data search position