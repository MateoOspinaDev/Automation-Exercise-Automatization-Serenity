package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static starter.ui.DashBoardPage.LOGGED_AS_USERNAME;

public class LoggedUserQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LOGGED_AS_USERNAME.isVisibleFor(actor);
    }

    public static LoggedUserQuestion theLoginIsSuccessful(){
        return new LoggedUserQuestion();
    }
}
