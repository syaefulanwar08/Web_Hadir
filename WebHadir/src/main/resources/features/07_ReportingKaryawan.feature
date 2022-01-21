Feature: Reporting Karyawan

	Scenario: Testing the reporting karyawan
		Given User go to the reporting karyawan page 
		When User click dropdown list for NIK
		And User click list NIK
		And User input NIK in form search and click button search
		When User click dropdown list for Name
		And User click list name
		And User input name in form search and click button search
		When User click dropdown list for Leader
		And User click list leader
		And User input leader in form search and click button search
		When User click dropdown list for divisi
		And User click dropdown list divisi
		And User input divisi in form search and click button search
		When User choose all data karyawan
		And User click button export to excel
		And User select the specified time and click button search
		When User click card body staff
		And User click card body supervisor
		And User click card body leader
		And User click card body manager
		And User click card body change request
		And User click card body head
		When User click search global reporting karyawan page
		And User input staff in form search reporting karyawan page