
Feature: Kullanici aile butcem uygulamasindaki gorevleri yerine getirir

  Scenario Outline: Kullanici aile butcem uygulamasindaki hesabim bolumde degisiklikleri dogrular

    * ilk ekran ayarlarini yapin 889 1275 750 178 1275 ve ardindan login sayfasina "Giriş Yap" ulasin
    * "email" ve "password" bilgilerini girerek kullanici bilgileriyle giris yapin
    * uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin
    * sol kisimdaki menuden "Hesabım" bolumune gidin
    * hesabim sayfasindaki bilgileri "<isim>" "<soyisim>" "<sehir>" "<yas>" "<meslek>" degistirerek degisikleri kaydedin ve dogrulayin
    * Kullanici uygulamayi kapatir
    Examples:
      | isim     |soyisim |sehir |yas |meslek|
      | isim1    |soyisim1|sehir1|yas1|meslek1|
      | isim2    |soyisim2|sehir2|yas2|meslek2|

  @ab
  Scenario: Aile butcem uygulamasindaki gelir ekleme gorevleri yerine getirlir
    * ilk ekran ayarlarini yapin 889 1275 750 178 1275 ve ardindan login sayfasina "Giriş Yap" ulasin
    * "email" ve "password" bilgilerini girerek kullanici bilgileriyle giris yapin
    * uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin
    * anasayfadaki arti butonuna tiklayin
    * "Gelir Ekle" Butonuna text uzerinden Tiklanir
    * Gelir Ekle sayfasinda aciklama kismina "T141 ilk gelir" deger girilir
    * Gelir Ekle sayfasinda Gelir tipi "Düzensiz" secilir
    * Gelir Ekle sayfasinda Kategori "Serbest Gelir" secilir
    * Gelir Ekle sayfasinda Tarih belirlemesi ve gun secimi yapilir
    * Gelir Ekle sayfasinda Tutar bilgisi girilir
    * "Kaydet" Butonuna text uzerinden Tiklanir
    * basariyla eklendigini dogrulayin
    * Kullanici uygulamayi kapatir