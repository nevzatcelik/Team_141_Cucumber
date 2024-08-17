package stepDefinitions;

import io.cucumber.java.en.Given;
import utils.BrowserDriver;

public class browserStepDefinitions {

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String url) {
        BrowserDriver.getBrowserDriver().get(url);
    }

}
