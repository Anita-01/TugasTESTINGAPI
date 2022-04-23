package starter.login.stepdefinitions.positive;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.user.positive.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Given("I set POST api endpoints for login")
    public void setGetApiEndpoints(){
        login.setApiEndpoints();
    }

    @When("I send POST HTTP Request for login")
    public void sendGetHttpRequest(){
        login.sendPostHttpRequest();
    }

    @And("I receive valid token for login")
    public void receiveValidDataForUser(){
        login.validateDataDetailUser();
    }
}
