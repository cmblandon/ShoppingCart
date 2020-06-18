package co.com.myshopping.certification.stepdefinitions;

import co.com.myshopping.certification.interactions.OpenTheBrowser;
import co.com.myshopping.certification.questions.TheElement;
import co.com.myshopping.certification.tasks.AddToCart;
import co.com.myshopping.certification.tasks.ClickOn;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static co.com.myshopping.certification.constants.ConstantsURL.MY_STORE;
import static co.com.myshopping.certification.ui.WomenPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddItemsSteps {
    @Managed
    private WebDriver hisBrowser;

    @Before
    public void userOnStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User")
                .can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^the user is on homepage$")
    public void theUserIsOnHomepage() {
        theActorInTheSpotlight().attemptsTo(OpenTheBrowser.on(MY_STORE));
    }

    @Then("^the user clicks women$")
    public void theUserClicksWomen() {
        theActorInTheSpotlight().attemptsTo(
                ClickOn.option(WOMEN_TAB)
        );
    }

    @When("^the user clicks Cart$")
    public void theUserClicksCart() {
        theActorInTheSpotlight().attemptsTo(
                Scroll.to(CART),
                ClickOn.option(CART)
        );
    }

    @And("^user verifies the total products equals one")
    public void userVerifiesTheTotalProducts() {
        theActorInTheSpotlight().should(
                seeThat(TheElement.withText(COUNT_CART_PRODUCTS),
                        Matchers.containsString("1"))
        );
    }

    @Then("^the user is returned to the homepage$")
    public void theUserIsReturnedToTheHomepage() {
        theActorInTheSpotlight().should(
                seeThat(TheElement.withText(CATALOG_TITLE),
                        Matchers.containsString("CATALOG"))
        );
    }

    @And("^user clicks tops$")
    public void userClicksTops() {
        theActorInTheSpotlight().attemptsTo(
                ClickOn.option(WOMEN_TOP)
        );
    }

    @And("^user clicks blouses$")
    public void userClicksBlouses() {
        theActorInTheSpotlight().attemptsTo(
                ClickOn.option(WOMEN_BLOUSES)
        );
    }

    @And("^user clicks on add to cart$")
    public void userClicksOnAddToCart() {
        theActorInTheSpotlight().attemptsTo(
                AddToCart.button(ADD_TO_CART_BUTTON)
        );
    }

    @Given("^the user clicks on continue shopping$")
    public void theUserClicksOnContinueShopping() {
        theActorInTheSpotlight().attemptsTo(
                Switch.toActiveElement(),
                ClickOn.option(CONTINUE_SHOPPING_BUTTON)
        );
    }

    @And("^user clicks dresses$")
    public void userClicksDresses() {
        theActorInTheSpotlight().attemptsTo(
                ClickOn.option(WOMEN_DRESSES)
        );
    }

    @And("^User clicks evening dresses$")
    public void userClicksEveningDresses() {
        theActorInTheSpotlight().attemptsTo(
                ClickOn.option(WOMEN_EVENING_DRESSES)
        );
    }

    @And("^user clicks on \\(Quick View\\) printed dress$")
    public void userClicksOnQuickViewPrintedDress() {
        theActorInTheSpotlight().attemptsTo(
                ClickOn.option(PRODUCT)
        );
    }

    @And("^user clicks on add to cart from pop up$")
    public void userClicksOnAddToCartFromPopUp() {
        theActorInTheSpotlight().attemptsTo(
                Switch.toFrame(0),
                ClickOn.option(SUBMIT_BUTTON),
                ClickOn.option(CONTINUE_SHOPPING_BUTTON),
                Scroll.to(CART),
                MoveMouse.to(CART)
        );
        theActorInTheSpotlight().should(
                seeThat(TheElement.withText(COUNT_CART_PRODUCTS),
                        Matchers.containsString("2"))
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOn.option(ORDER_CART_BUTTON),
                ClickOn.option(PROCEED_TO_CHECKOUT_BUTTON)
        );
        theActorInTheSpotlight().should(
                seeThat(TheElement.withText(AUTHENTICATION),
                        Matchers.containsString("Create an account"))
        );
    }
}
