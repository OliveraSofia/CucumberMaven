package pages;


import Setup.Driver;

public class WikipediaHomePage {

    public static void openBrowser(String browser) throws Exception {
        Driver.selectBrowser(browser);
    }

    public static void openPage(){
        Driver.openPage("wikipedia");
    }

    public static void closeBrowser(){
        Driver.quit();
    }
}
