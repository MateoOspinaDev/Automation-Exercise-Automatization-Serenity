package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.model.Purchaser;
import starter.ui.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Enter.theValue;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Register implements Task {

    private final Purchaser purchaser;

    public Register(Purchaser purchaser) {
        this.purchaser = purchaser;
    }

    public static Performable withDates(String name) {
        return instrumented(Login.class, name);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPage.SIGNUP_LOGIN_OPTION, isVisible()),
                Enter.theValue(purchaser.getName()).into(LoginPage.NAME_FIELD_NEW_USER),
                Enter.theValue(purchaser.getEmail()).into(LoginPage.EMAIL_FIELD_NEW_USER),
                Click.on(LoginPage.SIGN_UP_BUTTON)
        );
    }
}
