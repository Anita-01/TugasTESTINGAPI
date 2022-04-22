package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.PostNewUser;

public class CreateNewUser {
    @Steps
    PostNewUser postNewUser;

    @Given("I set POST api endpoints")
    public void setPostApiEndpoints(){
        postNewUser.setPostApiEndpoints();
    }

    @When("I send POST HTTP Request")
    public void sendPostHttpRequest(){
        postNewUser.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP response code 201")
    public void receiveValidHttpResponse(){
        postNewUser.validateHttpResponseCode201();
    }

    @And("I receive valid data for new user")
    public void receiveValidDataForUser(){
        postNewUser.validateDataDetailUser();
    }
}
