
  Feature: US1005 dogru kullanici adi ve sifre ile giris yapilabilmeli

    @hmc @pr1
    Scenario: TC08 positive login test

      Given kullanici "HMCUrl" anasayfasinda
      Then Log in yazisina tiklar
      And gecerli username girer
      And gecerli password girer
      And Login butonuna basar
      Then sayfaya giris yaptigini kontrol eder
      Then kullanici 5 sn bekler
      And sayfayi kapatir