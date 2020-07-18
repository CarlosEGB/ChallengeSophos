package com.challenge.web.pages_objects;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Esta clase nos permite mandar ordenes al navegador para realizar flujo funcional.
 *
 * @author Carlos Garcia
 */
@DefaultUrl("https://www.wong.pe/especiales/cyberwong")
public class BuyProductWebPageObject extends PageObject {

    public void waitPage() {
        waitFor(3).second();
    }

    public void addToCart(int idProduct) {
        $("//button[contains(@class,'product-item')][@data-productid='" + idProduct + "']").waitUntilClickable().and().click();
    }

    public void closePopUp() {
        $("//button[@class='modal-address__close font-icn cross']").waitUntilClickable().and().click();
    }

    public void checkProduct(int idProduct) {
        boolean visible = $("(//div[contains(@class,'product-item--minicar')][@data-id='" + idProduct + "'])[3]").isVisible();
        assertThat(visible, is(true));
    }


}
