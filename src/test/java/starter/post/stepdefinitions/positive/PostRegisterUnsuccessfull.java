package starter.post.stepdefinitions.positive;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PostRegisterUnsuccessfull {
    @Steps
    PostRegisterUnsuccessfull postRegisterUnsuccessfull;

    @Given("I am on the sign up page")
    public void iAmOnTheSignUpPage() {
        postRegisterUnsuccessfull.iAmOnTheSignUpPage() ;
    }

    @When("I enter username")
    public void iEnterInTheEmail() {
        postRegisterUnsuccessfull.iEnterInTheEmail()  ;
    }

    @Then("I should see sign up and receive unvalid HTTP respondse code 400")
    public void iShouldSeeSignUpAndReceiveUnvalidHTTPRespondseCode() {
        postRegisterUnsuccessfull.iShouldSeeSignUpAndReceiveUnvalidHTTPRespondseCode();
    }

    @And("I receive unvalSid data for wrong email")
    public void iReceiveUnvalSidDataForWrongEmail() {
        postRegisterUnsuccessfull.iReceiveUnvalSidDataForWrongEmail();
    }
}
