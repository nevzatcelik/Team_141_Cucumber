Feature: O bilet sitesine tarayici uzerinden gidilerek gorevler yerine getirilir
  @browser
  Scenario: kullanici o bilet mobil browser tarayicisinda dil ve para birimi degisikligini dogrular

  * kullanici "https://www.obilet.com/en" sayfasina gider
  * dil olarak turkce secilir
  * para birimi olarak tl secilir
  * otobus bileti bul a tiklanir
  * gelen bilet fiyatlarinin tl oldugu dogrulanir