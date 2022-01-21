Feature: Web Hadir Testing Form Regristration

Scenario: Testing form regristration page
    When User Can Open Form Registration
    And User Open Form Staff From Form Regristration
    And User Choose Photos
    And User Fill username, email, fullname, password, Imei, dan NIK
    And User Choose level, departemen, posisi kerja, jam kerja, lokasi kerja, lembur, jumlah cuti, jam masuk, jam keluar, absen point, head, and gm
		And User Register Employee
    Then User Complete Register Employee