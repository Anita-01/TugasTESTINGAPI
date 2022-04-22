package starter.get.stepdefinitions.negative;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.get.user.negative.GetSingleUserText;

public class SingleUserStepsText {
    @Steps
    GetSingleUserText getSingleUserText;

    @Given("I set GET api endpoints for single user for text")
    public void setGetApiEndpoints(){
        getSingleUserText.setApiEndpoints();
    }
}
