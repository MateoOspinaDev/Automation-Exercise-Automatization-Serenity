package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USERNAME_FIELD = Target.the("username")
            .locatedBy("//form[@action='/login']//input[@placeholder='Email Address']");

    public static final Target PASSWORD_FIELD = Target.the("password")
            .locatedBy("//form[@action='/login']//input[@placeholder='Password']");

    public static final Target LOGIN_BUTTON = Target.the("login")
            .locatedBy("//button[contains(text(), 'Login')]");

    public static final Target SIGNUP_LOGIN_OPTION = Target.the("Link to login")
            .locatedBy("//a[@href='/login']");

    public static final Target NAME_FIELD_NEW_USER = Target.the("username new user")
            .locatedBy("//input[@placeholder='Name']");

    public static final Target EMAIL_FIELD_NEW_USER = Target.the("email")
            .locatedBy("//input[@data-qa='signup-email']");

    public static final Target SIGN_UP_BUTTON = Target.the("Sign up")
            .locatedBy("//button[normalize-space()='Signup']");
}
