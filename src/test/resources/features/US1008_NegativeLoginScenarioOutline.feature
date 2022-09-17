Feature: US1008 kullanici farkli yanlis sifre ve kullanici adiyla giris yapamaz

  @negative
  Scenario Outline: TC13 yanlis kullanici adi ve sifrelerle giris yapilamaz

    Given kullanici "HMCUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecersiz usarname olarak "<username>" girer
    And gecersiz pasword olarak "<password>" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigi test eder
    #Then kullanici 5 sn bekler
    And sayfayi kapatir

    Examples:
    |username|      |password|
    |Manager5|      |Manager5!|
    |Manager6|      |Manager6!|
    |Manager7|      |Manager7!|
    |Manager8|      |Manager8!|
    |Manager9|      |Manager9!|
