package starter.register.stepdefinitions.positive;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.register.user.positive.RegisterSuccess;

public class RegisterSuccessSteps {
    @Steps
    RegisterSuccess registerSuccess;

    @Given("I set POST api endpoints for register")
    public void setPostApiEndpoints(){
        registerSuccess.setPostApiEndpoints();
    }

    @When("I send POST HTTP Request for register")
    public void sendPostHttpRequest(){
        registerSuccess.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP response code 200 for register")
    public void receiveValidHttpResponse(){
        registerSuccess.validateHttpResponseCode200();
    }


    @And("I receive valid data for new user for register")
    public void receiveValidDataForUser(){
        registerSuccess.validateDataDetailUser();
    }
}
