package starter.builders;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.LoginPage;

import static net.serenitybdd.screenplay.actions.Enter.theValue;
import static starter.ui.LoginPage.LOGIN_BUTTON;
import static starter.ui.LoginPage.REMEMBER_ME;

public class LoginBuilderTask implements Task {

    private  String username;
    private  String password;
    private boolean rememberMe;

    public LoginBuilderTask(String username, String password, boolean rememberMe) {
        this.username = username;
        this.password = password;
        this.rememberMe = rememberMe;
    }

    public static LoginWith with(){
        return new LoginWith();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                theValue(username).into(LoginPage.USERNAME_FIELD),
                theValue(password).into(LoginPage.PASSWORD_FIELD)
        );
        if(rememberMe){
            actor.attemptsTo(
            Click.on(REMEMBER_ME)
            );
        }
        actor.attemptsTo(
                Click.on(LOGIN_BUTTON)
        );


    }

    //Clase que se encargará de construirnos el objeto, es decir es el builder
    public static class LoginWith{
        private  String username;
        private  String password;

        public LoginWith username(String username){
            this.username = username;
            return this;
        }

        public LoginWith password(String password){
            this.password = username;
            return this;
        }

        public Performable rememberMe(boolean rememberMe){
            return new LoginBuilderTask(username,password,rememberMe);
        }
    }
}
