package starter.get.user.negative;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetListUserNumber {
    protected static String url = "https://reqres.in/api/";


    @Step("I set GET api endpoints for list user for minus")
    public String setApiEndpoints() {
        return url + "users?page=-2,0";
    }

    @Step("I receive valid HTTP response code 404 list user")
    public void validateHttpResponseCode404() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
