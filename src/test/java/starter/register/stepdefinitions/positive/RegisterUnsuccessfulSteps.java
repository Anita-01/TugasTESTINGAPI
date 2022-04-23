package starter.register.stepdefinitions.positive;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.user.positive.LoginUnsuccessful;
import starter.register.user.positive.RegisterSuccess;
import starter.register.user.positive.RegisterUnsuccessful;

public class RegisterUnsuccessfulSteps {
    @Steps
    RegisterUnsuccessful registerUnsuccessful;

    @Given("I set POST api endpoints for unsuccessful register")
    public void setPostApiEndpoints(){
        registerUnsuccessful.setApiEndpoints();
    }

    @When("I send POST HTTP Request for unsuccessful register")
    public void sendPostHttpRequest(){
        registerUnsuccessful.sendPostHttpRequest();
    }

    @And("I receive message error for register")
    public void receiveValidDataForUser(){
        registerUnsuccessful.validateDataDetailUser();
    }
}
