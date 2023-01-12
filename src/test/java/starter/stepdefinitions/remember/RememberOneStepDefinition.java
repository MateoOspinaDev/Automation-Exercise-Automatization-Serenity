package starter.stepdefinitions.remember;

import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RememberOneStepDefinition {
    @When("he tries to remember (.*)$")
    public void he_tries_to_remember_foo(String foo) {
        theActorInTheSpotlight().remember("something",foo);
    }
}
