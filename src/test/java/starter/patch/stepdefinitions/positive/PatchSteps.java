package starter.patch.stepdefinitions.positive;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.patch.user.positive.Patch;
import starter.put.user.positive.UpdateUser;

public class PatchSteps {
    @Steps
    Patch patch;

    @Given("I set PATCH api endpoints")
    public void setPutApiEndpoints(){
        patch.setPutApiEndpoints();
    }

    @When("I send PATCH HTTP Request")
    public void sendPutHttpRequest(){
        patch.sendPutHttpRequest();
    }

    @And("I receive valid data for patch user")
    public void receiveValidDataForUser(){
        patch.validateUpdateUser();
    }
}
