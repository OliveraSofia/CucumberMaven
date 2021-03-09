package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WikipediaHomePage;


public class WikipediaStepsDefinitions {

    //To do: Update Steps Names to be (unicly identify) by feature

    //Testing with Several browsers:

    @Given("^User choose the \"([^\"]*)\" browser$")
    public void openPageOnBrowser(String browser) throws Exception {
        WikipediaHomePage.openBrowser(browser);

    }

    @When("^The Home page is load$")
    public void openMainPage(){
        WikipediaHomePage.openPage();
        WikipediaHomePage.initHashMap();
    }

    @Then("^Close the browser$")
    public void closeBrowser(){
        WikipediaHomePage.closeBrowser();

    }

    @When("^Language \"([^\"]*)\"  is Selected$")
    public void selectLanguage(String language){
        WikipediaHomePage.initHashMap();
        WikipediaHomePage.selectLanguage(language);
    }
}
