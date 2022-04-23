package starter.get.stepdefinitions.positive;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.get.user.positive.GetListUser;
import starter.get.user.positive.GetSingleUserNotFound;

public class SingleUserNotFoundSteps {
    @Steps
    GetSingleUserNotFound getSingleUserNotFound;

    @Given("I set GET api endpoints for single user not found")
    public void setGetApiEndpoints(){
        getSingleUserNotFound.setApiEndpoints();
    }

    @When("I send GET HTTP Request single user not found")
    public void sendGetHttpRequest(){
        getSingleUserNotFound.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 404 single user not found")
    public void receiveValidHttpResponse(){
        getSingleUserNotFound.validateHttpResponseCode404();
    }
}
