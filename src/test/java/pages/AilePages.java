package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class AilePages {

    public AilePages(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(),Duration.ofSeconds(15)),this);
    }

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    private MobileElement emailBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    private MobileElement passwordBox;

    @FindBy(xpath ="//*[@text='Başarıyla giriş yapıldı.']") //
    public MobileElement basariliGirisText;
    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[1]")
    public MobileElement hamburgerMenu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement isimKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement soyisimKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public MobileElement sehirKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public MobileElement yasKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[5]")
    public MobileElement meslekKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement aciklamaKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement tutarKutusu;

    @FindBy(xpath = "(//*[@class='android.view.ViewGroup'])[10]")
    public MobileElement gelirGiderTipi;

    @FindBy(xpath = "//*[@text='Kategori']")
    public MobileElement kategoriTipi;

    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[5]")
    public MobileElement tarih;

    @FindBy(id = "android:id/next")
    public MobileElement nextMonth;

    @FindBy(xpath = "//*[@text='Gelir eklendi.']")
    public MobileElement gelirEklendiText;

    @FindBy(xpath = "//*[@text='Gider eklendi.']")
    public MobileElement giderEklendiText;

    public void aySecmeMethodu(int gidilecekAY,String secilecekGun) throws InterruptedException {
        for (int i = 0; i <gidilecekAY ; i++) {
            nextMonth.click();
            Thread.sleep(1000);
        }
        ReusableMethods.scrollWithUiScrollableAndClick(secilecekGun);
        ReusableMethods.scrollWithUiScrollableAndClick("OK");
    }


      public void hesabimKutuTemizleme(){
          isimKutusu.clear();
          soyisimKutusu.clear();
          sehirKutusu.clear();
          yasKutusu.clear();
          meslekKutusu.clear();
      }

      public void hesabimYeniBilgiDogrulama(String isim,String soyIsim,String sehir,String yas,String meslek){
          hesabimKutuTemizleme();
          isimKutusu.sendKeys(ConfigReader.getProperty(isim));
          soyisimKutusu.sendKeys(ConfigReader.getProperty(soyIsim));
          sehirKutusu.sendKeys(ConfigReader.getProperty(sehir));
          yasKutusu.sendKeys(ConfigReader.getProperty(yas));
          meslekKutusu.sendKeys(ConfigReader.getProperty(meslek));
          ReusableMethods.scrollWithUiScrollableAndClick("Kaydet");
          Assert.assertEquals(isimKutusu.getText(), ConfigReader.getProperty(isim));
          Assert.assertEquals(soyisimKutusu.getText(),ConfigReader.getProperty(soyIsim));
          Assert.assertEquals(sehirKutusu.getText(), ConfigReader.getProperty(sehir));
          Assert.assertEquals(yasKutusu.getText(), ConfigReader.getProperty(yas));
          Assert.assertEquals(meslekKutusu.getText(), ConfigReader.getProperty(meslek));
      }




    public void loginMethodu(String email,String password){
        emailBox.sendKeys(ConfigReader.getProperty(email));
        passwordBox.sendKeys(ConfigReader.getProperty(password));
        ReusableMethods.scrollWithUiScrollableAndClick("Giriş Yap");
    }
    public void ilkEkranAyarlari(int xPress,int yPress, int bekleme,int xMove,int yMove,String girisYap) throws InterruptedException {
        Driver.getAndroidDriver();
        Thread.sleep(2000);
        for (int i = 0; i < 6; i++) {
            ReusableMethods.ekranKaydirmaMethodu(xPress,yPress,bekleme,xMove,yMove);
        }
        ReusableMethods.scrollWithUiScrollableAndClick(girisYap);
    }
}
