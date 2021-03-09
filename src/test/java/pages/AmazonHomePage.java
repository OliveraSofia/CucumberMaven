package pages;


import Setup.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class AmazonHomePage {

    private static final String IN_STOCK = "In Stock.";
    private static final String ONLY_N_IN_STOCK = "left in stock - order soon.";
    private static final String NO_SHIPPED = "This item cannot be shipped to your selected delivery location.";
    private static final String CURRENTLY_UNAVAILABLE = "Currently unavailable";


    private static WebElement filteroption;


    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    private static WebElement searchBar;

    @FindBy(xpath = "//*[@id='nav-search-submit-button']")
    private static WebElement searchSubmit;

    @FindBy(xpath = "//div[@class='a-text-center']//ul[@class='a-pagination']/li[2]/a")
    private static WebElement firstPage;

    @FindBy(xpath = "//div[@class='a-text-center']//ul[@class='a-pagination']/li[3]/a")
    private static WebElement secondPage;

    @FindBy(xpath = "//div[@data-index=0]//div[@class='a-section aok-relative s-image-fixed-height']/img[@data-image-index='0']")
    private static WebElement firstOptionResult;

    @FindBy(xpath = "//div[@data-index=1]//div[@class='a-section aok-relative s-image-fixed-height']/img[@data-image-index='1']")
    private static WebElement secondOptionResult;

    @FindBy(xpath = "//div[@data-index=2]//div[@class='a-section aok-relative s-image-fixed-height']/img[@data-image-index='2']")
    private static WebElement thirdOptionResult;

    @FindBy(xpath = "//span[@class='a-button-inner']")
    private static WebElement addToCartButton;

    public static void setSearch(String text) {
        searchBar.sendKeys(text);
    }

    public static void clickOnSearchSubmit() {
        searchSubmit.click();

    }

    public static void clickOnNumberPage(int page) {

        Driver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        switch (page) {
            case 1:
                filteroption = firstPage;
                break;
            case 2:
                filteroption = secondPage;
                break;
        }
        System.out.print("page number selected: " + filteroption.getText());
        filteroption.click();
    }

    public static void clickOnOptionResult(int option) {
        switch (option) {
            case 1:
                firstOptionResult.click();
                break;
            case 2:
                secondOptionResult.click();
                break;
            case 3:
                thirdOptionResult.click();
                break;
        }

        Driver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public static void verifyAddToCartEnable(){


        Assert.assertTrue("Is Avilable",addToCartButton.isEnabled());
        //Assert.assertFalse("Is Not Avilable",addToCartButton.isEnabled());
    }

    public static void addItemToCart(){
        Driver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.print(" Added to cart: " + addToCartButton.getText());
        addToCartButton.click();

    }
}



