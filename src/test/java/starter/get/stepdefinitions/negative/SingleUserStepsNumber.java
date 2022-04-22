package starter.get.stepdefinitions.negative;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.get.user.negative.GetSingleUserNumber;

public class SingleUserStepsNumber {
    @Steps
    GetSingleUserNumber getSingleUserNumber;

    @Given("I set GET api endpoints for single user for number")
    public void setGetApiEndpoints(){
        getSingleUserNumber.setApiEndpoints();
    }

    @Then("I receive HTTP response code 404 single user")
    public void receiveValidHttpResponse(){
        getSingleUserNumber.validateHttpResponseCode404();
    }
}
