package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserDriver;

public class ObiletPage {
    public ObiletPage(){
        PageFactory.initElements((WebDriver) BrowserDriver.getBrowserDriver(),this);
    }

    @FindBy(xpath = "//button[@aria-label='Menü']")
    public WebElement hamburgerMenu;
    @FindBy(xpath = "//a[@id='language-modal-btn']")
    public WebElement language;

    @FindBy(xpath = "(//a[@data-language=\"tr-TR\"])[1]")
    public WebElement turkishLanguage;

    @FindBy(xpath = "//a[@id='currency-modal-btn']")
    public WebElement currencyMenu;

    @FindBy(xpath = "(//*[@data-code=\"TRY\"])[1]")
    public WebElement turkishLira;

    @FindBy(xpath = "//button[@id='search-button']")
    public WebElement searchButton;

    @FindBy(xpath = "(//*[@class='amount-sign'])[1]")
    public WebElement priceType;
}
