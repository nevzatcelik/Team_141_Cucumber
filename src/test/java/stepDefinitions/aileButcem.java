package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AilePages;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class aileButcem {
    AilePages pages=new AilePages();


    @Given("ilk ekran ayarlarini yapin {int} {int} {int} {int} {int} ve ardindan login sayfasina {string} ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_giris_yap_ulasin(int x,int y,int bekleme,int moveX,int moveY,String girisYapText) throws InterruptedException {
     pages.ilkEkranAyarlari(x,y,bekleme,moveX,moveY,girisYapText);
    }
    @Given("{string} ve {string} bilgilerini girerek kullanici bilgileriyle giris yapin")
    public void mail_ve_sifre_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin(String mail,String sifre) {
        pages.loginMethodu(mail,sifre);
    }
    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {
        Assert.assertTrue(pages.basariliGirisText.isDisplayed());
    }
    @Given("sol kisimdaki menuden {string} bolumune gidin")
    public void sol_kisimdaki_menuden_hesabım_bolumune_gidin(String menuSecim) throws InterruptedException {
        Thread.sleep(4000);
        pages.hamburgerMenu.click();
        ReusableMethods.scrollWithUiScrollableAndClick(menuSecim);
    }
    @Given("hesabim sayfasindaki bilgileri {string} {string} {string} {string} {string} degistirerek degisikleri kaydedin ve dogrulayin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin_ve_dogrulayin(String isim,String soyIsim,String sehir,String yas,String meslek) throws InterruptedException {
    pages.hesabimYeniBilgiDogrulama(isim,soyIsim,sehir,yas,meslek);
    Thread.sleep(2000);
    }
    @Given("Kullanici uygulamayi kapatir")
    public void kullanici_uygulamayi_kapatir() {
     Driver.quitAppiumDriver();
    }


    @Given("anasayfadaki arti butonuna tiklayin")
    public void anasayfadaki_arti_butonuna_tiklayin() throws InterruptedException {
        ReusableMethods.koordinatTiklamaMethodu(536,2040,500);
    }
    @Given("{string} Butonuna text uzerinden Tiklanir")
    public void butonuna_text_uzerinden_tiklanir(String secenek) {
        ReusableMethods.scrollWithUiScrollableAndClick(secenek);
    }
    @Given("Gelir Ekle sayfasinda aciklama kismina {string} deger girilir")
    public void gelir_ekle_sayfasinda_aciklama_kismina_ıkinci_gelir_degeri_deger_girilir(String aciklama) {
        pages.aciklamaKutusu.sendKeys(aciklama);
    }
    @Given("Gelir Ekle sayfasinda Gelir tipi {string} secilir")
    public void gelir_ekle_sayfasinda_gelir_tipi_düzenli_secilir(String gelirTipi) {
        pages.gelirTipi.click();
        ReusableMethods.scrollWithUiScrollableAndClick(gelirTipi);
    }
    @Given("Gelir Ekle sayfasinda Gelir Periyodu Gelir tipi Aylık secilir")
    public void gelir_ekle_sayfasinda_gelir_periyodu_gelir_tipi_aylık_secilir() {
    pages.kategoriTipi.click();
    ReusableMethods.scrollWithUiScrollableAndClick("");
    }
    @Given("Gelir Ekle sayfasinda Kategori {string} secilir")
    public void gelir_ekle_sayfasinda_kategori_kategori_maaş_geliri_secilir() {

    }
    @Given("Gelir Ekle sayfasinda Tarih belirlemesi ve gun secimi yapilir")
    public void gelir_ekle_sayfasinda_tarih_belirlemesi_ve_gun_secimi_yapilir() {

    }
    @Given("Gelir Ekle sayfasinda Tutar bilgisi girilir")
    public void gelir_ekle_sayfasinda_tutar_bilgisi_girilir() {

    }

    @Given("basariyla eklendigini dogrulayin")
    public void basariyla_eklendigini_dogrulayin() {

    }

}
