
Feature: Kullanici aile butcem uygulamasindaki gorevleri yerine getirir

  Background: sisteme giris yapilmasi gereken ortak adimlar
    * ilk ekran ayarlarini yapin 889 1275 750 178 1275 ve ardindan login sayfasina "Giriş Yap" ulasin
    * "email" ve "password" bilgilerini girerek kullanici bilgileriyle giris yapin
    * uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin

  Scenario Outline: Kullanici aile butcem uygulamasindaki hesabim bolumde degisiklikleri dogrular
    * sol kisimdaki menuden "Hesabım" bolumune gidin
    * hesabim sayfasindaki bilgileri "<isim>" "<soyisim>" "<sehir>" "<yas>" "<meslek>" degistirerek degisikleri kaydedin ve dogrulayin
    * Kullanici uygulamayi kapatir
    Examples:
      | isim     |soyisim |sehir |yas |meslek|
      | isim1    |soyisim1|sehir1|yas1|meslek1|
      | isim2    |soyisim2|sehir2|yas2|meslek2|

  @ab
  Scenario: Aile butcem uygulamasindaki gelir ekleme bolumden serbest gelir gorevleri yerine getirlir
    * anasayfadaki arti butonuna tiklayin
    * "Gelir Ekle" Butonuna text uzerinden Tiklanir
    * Gelir Ekle sayfasinda aciklama kismina "T141 ilk gelir" deger girilir
    * Gelir Ekle sayfasinda Gelir tipi "Düzensiz" secilir
    * Gelir Ekle sayfasinda Kategori "Serbest Gelir" secilir
    * Gelir Ekle sayfasinda Tarih belirlemesi 2 ve gun secimi "15" yapilir
    * Gelir Ekle sayfasinda Tutar bilgisi "5000" girilir
    * "Kaydet" Butonuna text uzerinden Tiklanir
    * basariyla eklendigini dogrulayin
    * Kullanici uygulamayi kapatir

    Scenario: aile butcem uygulamasindaki gelir ekleme bolumden maas ekleme gorevleri yerine getirlir

      * anasayfadaki arti butonuna tiklayin
      * "Gelir Ekle" Butonuna text uzerinden Tiklanir
      * Gelir Ekle sayfasinda aciklama kismina "T141 ilk maasi" deger girilir
      * Gelir Ekle sayfasinda Gelir tipi "Düzensiz" secilir
      * Gelir Ekle sayfasinda Kategori "Maaş Geliri" secilir
      * Gelir Ekle sayfasinda Tarih belirlemesi 3 ve gun secimi "20" yapilir
      * Gelir Ekle sayfasinda Tutar bilgisi "50000" girilir
      * "Kaydet" Butonuna text uzerinden Tiklanir
      * basariyla eklendigini dogrulayin
      * Kullanici uygulamayi kapatir

    Scenario: aile butcem uygulamasindaki gider ekleme bolumden market gorevleri yerine getirlir
      * anasayfadaki arti butonuna tiklayin
      * "Gider Ekle" Butonuna text uzerinden Tiklanir
      * Gelir Ekle sayfasinda aciklama kismina "T141 ilk market alis verisi" deger girilir
      * Gelir Ekle sayfasinda Gelir tipi "Düzensiz" secilir
      * Gelir Ekle sayfasinda Kategori "Market" secilir
      * Gelir Ekle sayfasinda Tarih belirlemesi 1 ve gun secimi "5" yapilir
      * Gelir Ekle sayfasinda Tutar bilgisi "250" girilir
      * "Kaydet" Butonuna text uzerinden Tiklanir
      * basariyla gider eklendigini dogrulayin
      * Kullanici uygulamayi kapatir
