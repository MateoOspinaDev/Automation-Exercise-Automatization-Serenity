package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theHackatonPage() {
        return Task.where("{0} opens the Hackaton home page",
                Open.browserOn().the(ApplitoolsHomePage.class));
    }
}
