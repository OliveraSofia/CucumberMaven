package pages;


import Setup.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

import java.util.HashMap;

public class WikipediaHomePage {

    public static void initHashMap(){
        languageList();
    }

    public static void openBrowser(String browser) throws Exception {
        Driver.selectBrowser(browser);
    }

    public static void openPage(){
        Driver.openPage("wikipedia");
    }

    public static void closeBrowser(){
        Driver.quit();
    }

    @FindBy(xpath = "//*[@id='js-link-box-en']/strong")
    static WebElement engLink;

    @FindBy(xpath = "//*[@id='js-link-box-es']/strong")
    static WebElement spaLink;

    @FindBy(xpath = "//*[@id='js-link-box-ja']/strong")
    static WebElement japLink;

    @FindBy(xpath = "//*[@id='js-link-box-de']/strong")
    static WebElement deuLink;

    @FindBy(xpath = "//*[@id='js-link-box-fr']/strong")
    static WebElement franLink;

    @FindBy(xpath = "//*[@id='js-link-box-zh']/strong")
    static WebElement chiLink;

    @FindBy(xpath = "//*[@id='js-link-box-pl']/strong")
    static WebElement polLink;

    @FindBy(xpath = "//*[@id='js-link-box-ru']/strong")
    static WebElement ruLink;

    @FindBy(xpath = "//*[@id='js-link-box-it']/strong")
    static WebElement italLink;

    @FindBy(xpath = "//*[@id='js-link-box-pt']/strong")
    static WebElement portlLink;

      static HashMap<String, WebElement> languages = new HashMap<>();

    public static void languageList(){

        languages.put("English", engLink);
        languages.put("Español", spaLink);
        languages.put("日本語", japLink);
        languages.put("Deutsch", deuLink);
        languages.put("Français", franLink);
        languages.put("中文", chiLink);
        languages.put("Polski", polLink);
        languages.put("Русский", ruLink);
        languages.put("Italiano", italLink);
        languages.put("Português", portlLink);

    }


    public static void selectLanguage(String language){
        languages.get(language).click();
    }

}
