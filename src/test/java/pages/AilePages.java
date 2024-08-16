package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
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

    @FindBy(id = "text2")
    public MobileElement basariliGirisText;



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
