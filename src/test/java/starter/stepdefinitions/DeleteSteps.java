package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.DeleteUser;

public class DeleteSteps {
    @Steps
    DeleteUser deleteUser;

    @Given("I set DELETE api endpoints")
    public void setDeleteApiEndpoints(){
        deleteUser.setDeleteApiEndpoints();
    }

    @When("I send DELETE HTTP Request")
    public void sendDeleteHttpRequest(){
        deleteUser.sendDeleteHttpRequest();
    }

    @Then("I receive valid HTTP response code 204")
    public void receiveValidHttpResponse(){
        deleteUser.validateHttpResponseCode204();
    }
}
