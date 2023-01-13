package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Enter.*;

public class Login implements Task {
    private final String username;
    private final String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Performable withCredentials(String username, String password) {
        return instrumented(Login.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                theValue(username).into(LoginPage.USERNAME_FIELD),
                theValue(password).into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
}