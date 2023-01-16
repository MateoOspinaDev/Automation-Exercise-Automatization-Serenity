package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class DashBoardPage {

    public static final Target LOGGED_AS_USERNAME = Target.the("Logged evidence")
            .locatedBy("//li/a[contains(text(),'Logged in as')]");
    public static final Target CREDIT_AVAILABLE = Target.the("Credit available number").locatedBy("//div[contains(text(), 'Credit Available')]/following-sibling::div[@class='balance-value']");
    public static final Target TOTAL_BALANCE = Target.the("Credit available number").locatedBy("//div[contains(text(), 'Total Balance')]/following-sibling::div[@class='balance-value']");
}
