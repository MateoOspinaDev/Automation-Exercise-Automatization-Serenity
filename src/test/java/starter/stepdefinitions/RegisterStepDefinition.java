package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.model.Purchaser;
import starter.model.PurchaserFactory;
import starter.tasks.Register;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterStepDefinition {


    @Given("^(.*) is a person with the correct data to register$")
    public void pepito_is_a_person_with_the_correct_data_to_register(String actorName) {
        Purchaser aPurchaser = PurchaserFactory.createByName(actorName);
        theActorCalled(aPurchaser.getName());
    }

    @Given("he fill the first form")
    public void pepito_fill_the_first_form() {
        theActorInTheSpotlight().attemptsTo(
        );
    }

    @Given("he fill the second form")
    public void pepito_fill_the_second_form() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("he complete the registration")
    public void he_complete_the_registration() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("He can see that his registration was successful")
    public void he_can_see_that_his_registration_was_successful() {
        // Write code here that turns the phrase above into concrete actions
    }

}
