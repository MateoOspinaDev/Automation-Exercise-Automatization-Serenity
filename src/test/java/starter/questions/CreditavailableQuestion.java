package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.QuestionSubject;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static starter.ui.DashBoardPage.CREDIT_AVAILABLE;

public class CreditavailableQuestion implements Question<String> {

    public static Question<String> value() {
        return new CreditavailableQuestion();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(CREDIT_AVAILABLE).getText();
    }
}
