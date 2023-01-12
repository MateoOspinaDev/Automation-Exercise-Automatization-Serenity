package starter.stepdefinitions.remember;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RememberTwoStepDefinition {
    @Then("he should get (.*)$")
    public void he_should_get_foo(String foo) {
        String recall = theActorInTheSpotlight().recall("something");
        Assert.assertEquals(recall,"foo");
    }
}
