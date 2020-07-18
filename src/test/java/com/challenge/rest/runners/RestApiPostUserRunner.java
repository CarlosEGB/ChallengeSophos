package com.challenge.rest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com/challenge/rest/features/api_gorest.feature",
        tags = "@PostUser",
        glue = "com/challenge/rest/definitions",
        snippets = SnippetType.CAMELCASE,
        plugin = "pretty"
)
/**
 Esta clase ejecuta el api_gorest.feature, al escenario @PostUser.
 @author Carlos Garcia
 */
public class RestApiPostUserRunner {

}
