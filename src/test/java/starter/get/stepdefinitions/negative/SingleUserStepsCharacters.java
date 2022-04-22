package starter.get.stepdefinitions.negative;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.get.user.negative.GetSingleUserCharacters;
import starter.get.user.negative.GetSingleUserText;

public class SingleUserStepsCharacters {
    @Steps
    GetSingleUserCharacters getSingleUserCharacters;

    @Given("I set GET api endpoints for single user for characters")
    public void setGetApiEndpoints(){
        getSingleUserCharacters.setApiEndpoints();
    }
}
