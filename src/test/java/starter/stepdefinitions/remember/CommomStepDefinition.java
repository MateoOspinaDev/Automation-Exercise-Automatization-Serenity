package starter.stepdefinitions.remember;

import io.cucumber.java.en.Given;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CommomStepDefinition {

    @Given("^(.*) wants to remember something")
    public void pepito_wants_to_remember_something(String actorName) {
        theActorCalled(actorName);
    }
}
