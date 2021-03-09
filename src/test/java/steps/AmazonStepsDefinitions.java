package steps;

import Setup.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AmazonHomePage;



public class AmazonStepsDefinitions {

    @Given("^Main page is load$")
    public void mainPageIsLoad() throws Exception {
        Driver.setup();
        Driver.openPage("amazon");
    }

    @And("^Search for \"([^\"]*)\" item$")
    public void searchesForItemName(String text) {
        AmazonHomePage.setSearch(text);
        AmazonHomePage.clickOnSearchSubmit();
    }

    @And("^navigates to the \"([^\"]*)\" page$")
    public void navigatesToTheNumberPage(int page) {
        AmazonHomePage.clickOnNumberPage(page);
    }

    @And("^select the \"([^\"]*)\" item$")
    public void selectTheThirdItem(int option) {
        AmazonHomePage.clickOnOptionResult(option);
    }

    @And("^Close page$")
    public void closePage() {
        Driver.quit();
    }

    @Then("^Verify item is aviable for purchase$")
    public void verifyItemIsAviableForPurchase() {
        AmazonHomePage.verifyAddToCartEnable();
    }

    @And("^Add the item to cart$")
    public void addTheItemToCart() {
        AmazonHomePage.addItemToCart();
    }


}


