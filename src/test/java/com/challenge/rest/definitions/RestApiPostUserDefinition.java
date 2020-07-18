package com.challenge.rest.definitions;

import com.challenge.rest.models.UserModel;
import com.challenge.rest.steps.RestApiPostUserSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Esta clase interpreta el .feature y realiza el Given When y Then del escenario.
 *
 * @author Carlos Garcia
 */
public class RestApiPostUserDefinition {

    @Steps
    private RestApiPostUserSteps restApiPostUserSteps;

    private String userJson;

    @Given("^The service rest of users the gorest$")
    public void theServiceRestOfUsersTheGorestCoIn(List<UserModel> dataBody) {
        userJson = dataBody.toString().replace("[", "").replace("]", "");
    }

    @When("^sent a post request with the data$")
    public void sentAPostRequestWithTheData() {
        restApiPostUserSteps.withDetails(userJson);
    }

    @Then("^Verify that the user has been added$")
    public void verifyThatTheUserHasBeenAdded(List<Map<String, String>> dataBody) {
        Response response = Serenity.sessionVariableCalled("response");

        assertEquals("201", response.jsonPath().get("_meta.code").toString());
        assertEquals(dataBody.get(0).get("first_name"), response.jsonPath().get("result.first_name"));
        assertEquals(dataBody.get(0).get("last_name"), response.jsonPath().get("result.last_name"));
        assertEquals(dataBody.get(0).get("gender"), response.jsonPath().get("result.gender"));
        assertEquals(dataBody.get(0).get("dob"), response.jsonPath().get("result.dob"));
        assertEquals(dataBody.get(0).get("email"), response.jsonPath().get("result.email"));
        assertEquals(dataBody.get(0).get("phone"), response.jsonPath().get("result.phone"));
    }
}
