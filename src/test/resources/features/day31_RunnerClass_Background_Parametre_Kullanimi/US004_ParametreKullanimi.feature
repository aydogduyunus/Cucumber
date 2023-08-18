
Feature: US004 TechproEducation Arama Testi

  Scenario: TC01 Arama Kutusunda Bolum Aratma
    Given Kullanici "https://techproeducation.com" sayfasina gider
    Then arama kutusunda "mobile" aratir
    And kullanici 2 saniye bekler
    But cikan dropdown menuden mobile developer secenegini tiklar
    And kullanici 1 saniye bekler
    And basligin "Mobile" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Google sayfasina gidilir
    Given Kullanici "https://google.com" sayfasina gider

  Scenario:TC03 facebook sayfasina gidilir
    Given Kullanici "https://facebook.com" sayfasina gider

  Scenario:TC04 techpro sayfasina gidilir
    Given Kullanici "https://techproeducation.com" sayfasina gider
    Then arama kutusunda "java" aratir
    And sayfayi kapatir