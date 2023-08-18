#USER STORY : US167854_manager_login_test
#NAME:kullanici tum manager login bilgileri ile giris yapabilmeli
#AC
  #Given kullanici ana sayfada
  #When kullanici login sayfasina gider
  #And kullanici adini girer ->>>>> parametre
  #And sifreyi girer ->>>>>parametre
  #And login butonuna basar
  #Then login islemi gerceklesir
  #Giris yapildigini dogrula
  #Cikis Yap
  #url : https://www.bluerentalcars.com/

#| email                         | password  |
#| sam.walker@bluerentalcars.com | c!fas_art |
#| kate.brown@bluerentalcars.com | tad1$Fas  |

Feature: US167854_manager_login_test

  Scenario Outline: kullanici tum manager login bilgileri ile giris yapabilmeli
    Given kullanici "blueRentalUrl" sayfasina properties ile gider
    When kullanici login butonuna gider
    Then Kullanici bilgilerini girer "<email>", "<password>"
    Then kullanici 2 saniye bekler
    Then kullanici giris yapildigini dogrular
    And sayfayi kapatir
    Examples:
      | email                         | password  |
      | sam.walker@bluerentalcars.com | c!fas_art |
      | kate.brown@bluerentalcars.com | tad1$Fas  |