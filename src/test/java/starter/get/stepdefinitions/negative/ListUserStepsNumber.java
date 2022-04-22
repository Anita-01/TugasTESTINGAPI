package starter.get.stepdefinitions.negative;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.get.user.negative.GetListUserNumber;
import starter.get.user.negative.GetSingleUserNumber;

public class ListUserStepsNumber {
    @Steps
    GetListUserNumber getListUserNumber;

    @Given("I set GET api endpoints for list user for minus")
    public void setGetApiEndpoints(){
        getListUserNumber.setApiEndpoints();
    }

    @Then("I receive valid HTTP response code 404 list user")
    public void receiveValidHttpResponse(){
        getListUserNumber.validateHttpResponseCode404();
    }
}
