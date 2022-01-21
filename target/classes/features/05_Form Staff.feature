Feature: Web Hadir Testing Form Staff

Scenario: Testing form staff page
    When User Can Open Form Staff
    And User Searching For Employees Data Based On The Specified Category
    And User Open Form View History
    And User Can Export Employee Absence History Data
    And User Open Form Edit Data Employee
		And User Can Edit Employee Photo
    And User Can Edit Employees Data
    And User Can Edit Employee Departement
    Then User Complete Edit Data
    