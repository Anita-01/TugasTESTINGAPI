package starter.get.user.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetSingleResource {
    protected static String url = "https://reqres.in/api/";

    @Step("I set GET api endpoints for single resource")
    public String setApiEndpoints() {
        return url + "unknown/2";
    }

    @Step("I send GET HTTP Request single resource")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoints());
    }

    @Step("I receive valid HTTP response code 200 single resource")
    public void validateHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail single resource")
    public void validateDataDetailUser() {
        restAssuredThat(response -> response.body("'data'.'id'", equalTo(2)));
        restAssuredThat(response -> response.body("'data'.'name'", equalTo("fuchsia rose")));
    }
}
