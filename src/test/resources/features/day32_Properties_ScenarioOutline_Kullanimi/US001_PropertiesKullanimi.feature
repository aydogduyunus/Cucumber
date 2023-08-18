Feature: US001 Google Sayfasi Testi

  Background: Google Sayfasina Gidildi
    Given Kullanici "googleUrl" sayfasina properties ile gider

    Scenario: TC01 Arama kutusuna Volvo aratir
      Then kullanici arama kutusunda "arac1" aratir
      And kullanici 2 saniye bekler
      And kullanici sayfa basliginin "arac1" icerdigini test eder
      And sayfayi kapatir

#then and methodlarını bir kez kullandıktan sonra * kullanabiliriz
  Scenario:TC02 Arama Kutusunda Ford Aratilir
    * kullanici arama kutusunda "arac2" aratir
    * kullanici 2 saniye bekler
    * kullanici sayfa basliginin "arac2" icerdigini test eder
    * sayfayi kapatir

  Scenario:TC03 Arama Kutusunda Audi Aratilir
    * kullanici arama kutusunda "arac3" aratir
    * kullanici 2 saniye bekler
    * kullanici sayfa basliginin "arac3" icerdigini test eder
    * sayfayi kapatir