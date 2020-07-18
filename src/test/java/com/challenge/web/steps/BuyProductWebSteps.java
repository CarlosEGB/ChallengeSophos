package com.challenge.web.steps;

import com.challenge.web.pages_objects.BuyProductWebPageObject;
import net.thucydides.core.annotations.Step;

/**
 * Esta clase ejecuta los pasos que usamos para realizar el flujo en la pagina.
 *
 * @author Carlos Garcia
 */
public class BuyProductWebSteps {

    private BuyProductWebPageObject buyProductWebPageObject;

    @Step("Open the browser and enter the page")
    public void openHomePage() {
        buyProductWebPageObject.open();
    }

    @Step("Wait for the page to finish loading")
    public void waitPage() {
        buyProductWebPageObject.waitPage();
    }

    @Step("Search and add the product to the cart")
    public void addProduct(int idProduct) {
        buyProductWebPageObject.addToCart(idProduct);
    }

    @Step("Close the pop-up")
    public void closePopUp() {
        buyProductWebPageObject.closePopUp();
    }

    @Step("Search the product in the cart")
    public void checkProduct(int idProduct) {
        buyProductWebPageObject.checkProduct(idProduct);
    }
}
