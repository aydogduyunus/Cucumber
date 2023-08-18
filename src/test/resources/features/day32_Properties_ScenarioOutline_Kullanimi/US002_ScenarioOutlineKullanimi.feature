Feature: US002 Google Sayfasi Testi

  Scenario Outline: TC01 Arama Kutusunda Araclar Aratilir

    Given Kullanici "googleUrl" sayfasina properties ile gider
    Then kullanici google arama kutusunda "<aranacakAraclar>" aratir
    And kullanici 2 saniye bekler
    And kullanici sayfa basliginin "<aranacakAraclar>" icerdigini test etti
    And sayfayi kapatir

    Examples:
      | aranacakAraclar |
      | volvo           |
      | ford            |
      | audi            |
      | mercedes        |
    #Scenario outline kullanımı testng deki data provider mantığı ile aynı çalışır
  #yukarıdaki örnekteki gibi birden fazla veriyi loop kullanmadan test edebiliriz
  #scenario outline kullanımında excemples yapısını kendimiz yazmamıza gerek yok
  #scenario outline yazdığımız zaman altını kırmızı çizer ve mouse ile
  #üzerine geldigimizde excemples yapısını create edebiliriz