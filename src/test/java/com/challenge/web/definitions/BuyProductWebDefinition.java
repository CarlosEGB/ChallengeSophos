package com.challenge.web.definitions;

import com.challenge.web.steps.BuyProductWebSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Esta clase interpreta el .feature y realiza el Given When y Then del escenario.
 *
 * @author Carlos Garcia
 */
public class BuyProductWebDefinition {

    @Steps
    private BuyProductWebSteps buyProductWebSteps;

    @Given("^The client is on the cyberwong special page$")
    public void theClientIsOnTheCyberwongSpecialPage() {
        buyProductWebSteps.openHomePage();
    }

    @When("^Add (\\d+) to cart$")
    public void buyThe(int idProduct) {
        buyProductWebSteps.waitPage();
        buyProductWebSteps.addProduct(idProduct);
        buyProductWebSteps.closePopUp();
    }

    @Then("^Verify that the (\\d+) has been added$")
    public void verifyThatTheWasPurchased(int idProduct) {
        buyProductWebSteps.checkProduct(idProduct);
    }
}
