package starter.get.stepdefinitions.positive;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.get.user.positive.GetListUnknown;

public class ListUnknownSteps {
    @Steps
    GetListUnknown getListUnknown;

    @Given("I set GET api endpoints for list unknown")
    public void setGetApiEndpoints(){
        getListUnknown.setApiEndpoints();
    }

    @When("I send GET HTTP Request list unknown")
    public void sendGetHttpRequest(){
        getListUnknown.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200 list unknown")
    public void receiveValidHttpResponse(){
        getListUnknown.validateHttpResponseCode200();
    }

    @And("I receive valid data for detail list unknown")
    public void receiveValidDataForUser(){
        getListUnknown.validateDataDetailUser();
    }
}
