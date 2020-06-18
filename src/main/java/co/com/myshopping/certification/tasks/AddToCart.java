package co.com.myshopping.certification.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.myshopping.certification.ui.WomenPage.PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddToCart implements Task {

    private Target addToCartButton;

    public AddToCart(Target addToCartButton) {
        this.addToCartButton = addToCartButton;
    }

    public static AddToCart button(Target addToCartButton) {
        return instrumented(AddToCart.class, addToCartButton);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElementFacade elementFacade = addToCartButton.resolveFor(actor);
        if (elementFacade != null || elementFacade.isCurrentlyVisible()) {
            actor.attemptsTo(
                    MoveMouse.to(PRODUCT),
                    Click.on(addToCartButton)
            );
        }
    }
}
