package starter.put.stepdefinitions.positive;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.put.user.positive.UpdateUser;

public class UpdateSteps {
    @Steps
    UpdateUser updateUser;

    @Given("I set PUT api endpoints")
    public void setPutApiEndpoints(){
        updateUser.setPutApiEndpoints();
    }

    @When("I send PUT HTTP Request")
    public void sendPutHttpRequest(){
        updateUser.sendPutHttpRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponse(){
        updateUser.validateHttpResponseCode200();
    }

    @And("I receive valid data for updated user")
    public void receiveValidDataForUser(){
        updateUser.validateUpdateUser();
    }
}
