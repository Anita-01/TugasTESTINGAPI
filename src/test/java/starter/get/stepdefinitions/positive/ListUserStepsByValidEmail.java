package starter.get.stepdefinitions.positive;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.get.user.positive.GetSingleUser;
import starter.get.user.positive.GetSingleUserByValidEmail;

public class ListUserStepsByValidEmail {
    @Steps
    GetSingleUserByValidEmail getSingleUserByValidEmail;

    @Given("I set GET api endpoints for single user by valid email")
    public void setGetApiEndpoints(){
        getSingleUserByValidEmail.setApiEndpoints();
    }

    @When("I send GET HTTP Request single user by valid email")
    public void sendGetHttpRequest(){
        getSingleUserByValidEmail.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200 single user by valid email")
    public void receiveValidHttpResponse(){
        getSingleUserByValidEmail.validateHttpResponseCode200();
    }

    @And("I receive valid data for detail single user by valid email")
    public void receiveValidDataForUser(){
        getSingleUserByValidEmail.validateDataDetailUser();
    }
}
