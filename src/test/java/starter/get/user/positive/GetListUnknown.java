package starter.get.user.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetListUnknown {
    protected static String url = "https://reqres.in/api/";

    @Step("I set GET api endpoints for list unknown")
    public String setApiEndpoints() {
        return url + "unknown";
    }

    @Step("I send GET HTTP Request list unknown")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoints());
    }

    @Step("I receive valid HTTP response code 200 list unknown")
    public void validateHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail list unknown")
    public void validateDataDetailUser() {
        restAssuredThat(response -> response.body("'page'", equalTo(1)));
    }
}
