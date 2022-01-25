Feature: Self Registration

	Scenario: Testing the self registration
		Given User go to the self registration page 
		When User click button gotoForm 
		And User click button lihat seluruh anggota karyawan
		And User edit user information
		And User click open hidden password
		And User input job information
		And User input choose leader
		And User click submit
		When User click button reject
		When User click search global self registration page
		And User input staff in form search self registration page