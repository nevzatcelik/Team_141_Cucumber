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


      public void hesabimKutuTemizleme(){
          isimKutusu.clear();
          soyisimKutusu.clear();
          sehirKutusu.clear();
          yasKutusu.clear();
          meslekKutusu.clear();
      }

      public void hesabimYeniBilgiDogrulama(String isim,String soyIsim,String sehir,String yas,String meslek){
          hesabimKutuTemizleme();
          isimKutusu.sendKeys(isim);
          soyisimKutusu.sendKeys(soyIsim);
          sehirKutusu.sendKeys(sehir);
          yasKutusu.sendKeys(yas);
          meslekKutusu.sendKeys(meslek);
          ReusableMethods.scrollWithUiScrollableAndClick("Kaydet");
          Assert.assertEquals(isimKutusu.getText(), isim);
          Assert.assertEquals(soyisimKutusu.getText(),soyIsim);
          Assert.assertEquals(sehirKutusu.getText(), sehir);
          Assert.assertEquals(yasKutusu.getText(), yas);
          Assert.assertEquals(meslekKutusu.getText(), meslek);
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
