package com.challenge.web.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com/challenge/web/features/web_shopping.feature",
        tags = "@BuyProduct",
        glue = "com/challenge/web/definitions",
        snippets = SnippetType.CAMELCASE,
        plugin = "pretty"
)
/**
 Esta clase ejecuta el web_shopping.feature, al escenario @BuyProduct.
 @author Carlos Garcia
 */
public class BuyProductWebRunner {
}
