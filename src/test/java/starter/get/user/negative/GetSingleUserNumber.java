package starter.get.user.negative;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetSingleUserNumber {
    protected static String url = "https://reqres.in/api/";


    @Step("I set GET api endpoints for single user for number")
    public String setApiEndpoints() {
        return url + "users/-2";
    }

    @Step("I receive HTTP response code 404 single user")
    public void validateHttpResponseCode404() {
        restAssuredThat(response -> response.statusCode(200));
    }

}
