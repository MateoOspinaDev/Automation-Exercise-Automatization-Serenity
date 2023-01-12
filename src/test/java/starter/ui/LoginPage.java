package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target USERNAME_FIELD = Target.the("username")
            .located(By.id("username"));

    public static final Target PASSWORD_FIELD = Target.the("username")
            .located(By.id("password"));

    public static final Target LOGIN_BUTTON = Target.the("username")
            .located(By.id("log-in"));
    public static final Target REMEMBER_ME = Target.the("username")
            .locatedBy("input.form-check-input");

}
