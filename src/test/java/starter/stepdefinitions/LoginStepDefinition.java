package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.NavigateTo;
import starter.questions.LoggedUserQuestion;
import starter.tasks.Login;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class LoginStepDefinition {

    String actorName;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast()); //Con esta linea serenity tiene el poder para orquestar, importa varias cosas de selenium
    }

    @Given("^(.*) has an active account$")
    public void pepito_has_an_active_account(String actorName) {
        // Write code here that turns the phrase above into concrete actions
        this.actorName = actorName;
    }
    @When("he sends their valid credentials")
    public void he_sends_their_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        theActorCalled(actorName).attemptsTo(
                NavigateTo.theAutomationExercisePage(),
                //LoginBuilderTask.with()
                        //.username("jhon@gmail.com").password("123456").rememberMe(false)
                Login.withCredentials("jhon@gmail.com","123456")
        );
    }
    @Then("He can see that his login was successful")
    public void he_should_have_access_to_manage_his_account() {
        theActorInTheSpotlight().should(
                seeThat("The login was successful", LoggedUserQuestion.theLoginIsSuccessful(),is(true))
                //seeThat("The displayed credit balance", TotalBalanceQuestion.value(),equalTo("$350%7")
        );
    }

}
