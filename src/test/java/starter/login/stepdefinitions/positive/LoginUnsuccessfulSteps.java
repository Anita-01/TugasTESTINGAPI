package starter.login.stepdefinitions.positive;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.user.positive.LoginUnsuccessful;

public class LoginUnsuccessfulSteps {
    @Steps
    LoginUnsuccessful loginUnsuccessful;

    @Given("I set POST api endpoints for unsuccessful login")
    public void setGetApiEndpoints(){
        loginUnsuccessful.setApiEndpoints();
    }

    @When("I send POST HTTP Request for unsuccessful login")
    public void sendGetHttpRequest(){
        loginUnsuccessful.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP response code 400")
    public void receiveValidHttpResponse(){
        loginUnsuccessful.validateHttpResponseCode400();
    }

    @And("I receive message error")
    public void receiveValidDataForUser(){
        loginUnsuccessful.validateDataDetailUser();
    }
}
