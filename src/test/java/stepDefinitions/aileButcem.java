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
    @Given("sol kisimdaki menuden Hesabım bolumune gidin")
    public void sol_kisimdaki_menuden_hesabım_bolumune_gidin() {

    }
    @Given("hesabim sayfasindaki bilgileri degistirerek degisikleri kaydedin ve dogrulayin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin_ve_dogrulayin() {

    }
    @Given("Kullanici uygulamayi kapatir")
    public void kullanici_uygulamayi_kapatir() {

    }

}
