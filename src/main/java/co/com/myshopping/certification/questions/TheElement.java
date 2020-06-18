package co.com.myshopping.certification.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.targets.Target;

@Subject("Validation of step elements")
public class TheElement implements Question<String> {

    private Target element;

    public TheElement(Target element) {
        this.element = element;
    }

    @Override
    public String answeredBy(Actor actor) {
        element.resolveFor(actor).isVisible();
        return element.resolveFor(actor).getTextValue().trim();

    }

    public static TheElement withText(Target element) {
        return new TheElement(element);
    }
}
