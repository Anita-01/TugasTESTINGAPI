package starter.get.stepdefinitions.negative;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.get.user.negative.GetListUserCharacters;
import starter.get.user.negative.GetListUserText;

public class ListUserStepsCharacters {
    @Steps
    GetListUserCharacters getListUserCharacters;

    @Given("I set GET api endpoints for list user for characters")
    public void setGetApiEndpoints(){
        getListUserCharacters.setApiEndpoints();
    }
}
