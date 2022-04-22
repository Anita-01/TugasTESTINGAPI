package starter.get.stepdefinitions.negative;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.get.user.negative.GetListUserText;

public class ListUserStepsText {
    @Steps
    GetListUserText getListUserText;

    @Given("I set GET api endpoints for list user for text")
    public void setGetApiEndpoints(){
        getListUserText.setApiEndpoints();
    }
}
