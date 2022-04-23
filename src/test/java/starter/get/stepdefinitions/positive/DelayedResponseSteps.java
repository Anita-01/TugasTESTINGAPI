package starter.get.stepdefinitions.positive;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.get.user.positive.DelayedResponse;
import starter.get.user.positive.GetListUser;

public class DelayedResponseSteps {
    @Steps
    DelayedResponse delayedResponse;

    @Given("I set GET api endpoints for delayed response")
    public void setGetApiEndpoints(){
        delayedResponse.setApiEndpoints();
    }

    @When("I send GET HTTP Request delayed response")
    public void sendGetHttpRequest(){
        delayedResponse.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200 delayed response")
    public void receiveValidHttpResponse(){
        delayedResponse.validateHttpResponseCode200();
    }

    @And("I receive valid data for detail delayed response")
    public void receiveValidDataForUser(){
        delayedResponse.validateDataDetailUser();
    }
}
