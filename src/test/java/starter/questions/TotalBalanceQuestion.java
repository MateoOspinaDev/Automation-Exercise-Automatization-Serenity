package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static starter.ui.DashBoardPage.CREDIT_AVAILABLE;
import static starter.ui.DashBoardPage.TOTAL_BALANCE;

public class TotalBalanceQuestion  implements Question<String> {

    public static Question<String> value() {
        return new TotalBalanceQuestion();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(TOTAL_BALANCE).getText();
    }
}
