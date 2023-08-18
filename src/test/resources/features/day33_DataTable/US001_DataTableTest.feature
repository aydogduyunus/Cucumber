Feature:US001 Google Sayfasında Urun Aratma

  Scenario: TC01 Tablo Verilen Urunler Aratilir
    Given kullanici "googleUrl" sayfasina properties ile gider
    And kullanici verilen bilgiler ile arama yapar
      | Urunler  |
      | nokia    |
      | samsung  |
      | iphone   |
      | motorola |
    And sayfayi kapatir






  #DataTable Scenario Outline daki gibi birden fazla veriyi ayni scenario da test etmek icin kullanilir
  #Scenario Outline dan farkli olarak verilerle ilgili tablolari şistedigimiz stepten sonra kendimiz olusturabiliriz
  #Tabloyu olusturdugumuz step'in methoduna parametre olarak io.cucumber'dan DataTable parametresini ekleriz
  #Bu parametre sayesinde olusturmus oldugumuz tabloyu bir liste donusturup loop ile verileri kullanabiliriz
  #Birden fazla sutun olusturduysak yine DataTable parametresi sayesinde excel 'den bildigimiz row() methodu ile bu
  #datalara ulasabiliriz.