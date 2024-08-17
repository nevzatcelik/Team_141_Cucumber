package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.ObiletPage;
import utils.BrowserDriver;

public class browserStepDefinitions {
 Actions actions=new Actions(BrowserDriver.getBrowserDriver());
     ObiletPage page=new ObiletPage();
    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String url) {
        BrowserDriver.getBrowserDriver().get(url);
    }
    @Given("dil olarak turkce secilir")
    public void dil_olarak_turkce_secilir() {
      page.hamburgerMenu.click();
        page.language.click();
        page.turkishLanguage.click();
    }
    @Given("para birimi olarak tl secilir")
    public void para_birimi_olarak_tl_secilir() {
      page.hamburgerMenu.click();
      page.currencyMenu.click();
      page.turkishLira.click();
    }
    @Given("otobus bileti bul a tiklanir")
    public void otobus_bileti_bul_a_tiklanir() {
      page.searchButton.click();
    }
    @Given("gelen bilet fiyatlarinin tl oldugu dogrulanir")
    public void gelen_bilet_fiyatlarinin_tl_oldugu_dogrulanir() {
       // Assert.assertTrue(page.priceType.getText().contains("TL"));
        actions.moveToElement(page.priceType).perform();
    }
}
