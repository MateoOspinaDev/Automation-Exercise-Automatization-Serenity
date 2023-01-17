package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class DashBoardPage {

    public static final Target LOGGED_AS_USERNAME = Target.the("Logged evidence")
            .locatedBy("//li/a[contains(text(),'Logged in as')]");
}
