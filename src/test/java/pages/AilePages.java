package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class AilePages {

    public AilePages(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(),Duration.ofSeconds(15)),this);
    }

    @FindBy(xpath = "djkasdgjadsj")
    public MobileElement girisYap;






    public void ilkEkranAyarlari() throws InterruptedException {
        Driver.getAndroidDriver();
        Thread.sleep(2000);
        for (int i = 0; i < 6; i++) {
            ReusableMethods.ekranKaydirmaMethodu(889,1275,750,178,1275);
        }
        ReusableMethods.scrollWithUiScrollableAndClick("Giriş Yap");

    }
}
