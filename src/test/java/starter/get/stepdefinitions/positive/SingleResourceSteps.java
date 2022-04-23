package starter.get.stepdefinitions.positive;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.get.user.positive.GetListUser;
import starter.get.user.positive.GetSingleResource;

public class SingleResourceSteps {
    @Steps
    GetSingleResource getSingleResource;

    @Given("I set GET api endpoints for single resource")
    public void setGetApiEndpoints(){
        getSingleResource.setApiEndpoints();
    }

    @When("I send GET HTTP Request single resource")
    public void sendGetHttpRequest(){
        getSingleResource.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200 single resource")
    public void receiveValidHttpResponse(){
        getSingleResource.validateHttpResponseCode200();
    }

    @And("I receive valid data for detail single resource")
    public void receiveValidDataForUser(){
        getSingleResource.validateDataDetailUser();
    }
}
