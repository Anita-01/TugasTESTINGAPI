package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class DeleteUser {
    protected static String url = "https://reqres.in/api/";

    @Step("I set GET api endpoints for single user")
    public String setDeleteApiEndpoints() {
        return url + "users/2";
    }

    @Step("I send GET HTTP Request single user")
    public void sendDeleteHttpRequest() {
        SerenityRest.given().delete(setDeleteApiEndpoints());
    }

    @Step("I receive valid HTTP response code 200 single user")
    public void validateHttpResponseCode204() {
        restAssuredThat(response -> response.statusCode(204));
    }

}
