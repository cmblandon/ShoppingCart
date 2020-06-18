package co.com.myshopping.certification.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/addItems.feature",
        glue = {"co.com.myshopping.certification.stepdefinitions"},
        snippets = SnippetType.CAMELCASE)

public class AddItems {
}
