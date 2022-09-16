#hotel my camp sitesinde 3 adet negative test senaryosu olusturalim.
  # 1- Dogru usarname-yanlis password
  # 2- Yanlis usarname-dogru password
  # 3- Yanlis usarname-yanlis password

  Feature: US1006 yanlis bilgilerle siteye giris yapilamaz

  Scenario: TC09 yanlis password ile giris yapilamaz
    Given kullanici "HMCUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigi test eder
    Then kullanici 3 sn bekler
    And sayfayi kapatir


  Scenario: TC10 yanlis kullanici adi ile giris yapilamaz
    Given kullanici "HMCUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecersiz username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigi test eder
    Then kullanici 3 sn bekler
    And sayfayi kapatir

  Scenario: TC11 yanlis kullanici adi ve yanlis sifre ile giris yapilamaz
    Given kullanici "HMCUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigi test eder
    Then kullanici 3 sn bekler
    And sayfayi kapatir
