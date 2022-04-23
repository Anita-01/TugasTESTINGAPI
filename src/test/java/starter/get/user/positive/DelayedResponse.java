package starter.get.user.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class DelayedResponse {
    protected static String url = "https://reqres.in/api/";

    @Step("I set GET api endpoints for delayed response")
    public String setApiEndpoints() {
        return url + "users?delay=3";
    }

    @Step("I send GET HTTP Request delayed response")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoints());
    }

    @Step("I receive valid HTTP response code 200 delayed response")
    public void validateHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail delayed response")
    public void validateDataDetailUser() {
        restAssuredThat(response -> response.body("'page'", equalTo(1)));
    }
}
