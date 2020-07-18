package com.challenge.rest.steps;

import com.challenge.rest.utils.Utilities;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

/**
 * Esta clase ejecuta los pasos que usamos para hacer la petición POST.
 *
 * @author Carlos Garcia
 */
public class RestApiPostUserSteps {

    private final Utilities utilities = new Utilities();

    @Step("Record a new user")
    public void withDetails(String userJson) {
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .queryParam("access-token", utilities.getAccessToken())
                .body(userJson)
                .post(utilities.getUrlApi());
        Serenity.setSessionVariable("response").to(response);
    }
}
