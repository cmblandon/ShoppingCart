package co.com.myshopping.certification.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOn implements Task {

    private Target element;

    public ClickOn(Target element){
        this.element = element;
    }

    public static ClickOn option(Target element){
        return instrumented(ClickOn.class, element);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElementFacade elementFacade = element.resolveFor(actor);
        if (elementFacade != null || elementFacade.isCurrentlyVisible()) {
            actor.attemptsTo(
                    Click.on(element)
            );
        }
    }
}
