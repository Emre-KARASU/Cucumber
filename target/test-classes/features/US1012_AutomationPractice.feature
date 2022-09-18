Feature: US1012 Kullanici register yapabilmeli

  @aut
  Scenario: TC17 kullanici uygun datalarla register olabilmeli

    Given kullanici "automationUrl" anasayfasinda
    And kullanici 1 sn bekler
    And user sign in linkine tiklar
    And kullanici 1 sn bekler
    And user Create and account bolumune email adresi girer
    And kullanici 1 sn bekler
    And Create an Account butonuna basar
    And kullanici 1 sn bekler
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And kullanici 1 sn bekler
    And user Register butonuna basar
    And kullanici 1 sn bekler
    Then hesap olustugunu dogrular
    And kullanici 1 sn bekler


