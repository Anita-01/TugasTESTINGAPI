package starter.login.user.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginUnsuccessful {
    protected static String url = "https://reqres.in/api/";

    @Step("I set POST api endpoints for unsuccessful login")
    public String setApiEndpoints() {
        return url + "login";
    }

    @Step("I send POST HTTP Request for unsuccessful login")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "peter@klaven");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setApiEndpoints());
    }

    @Step("I receive valid HTTP response code 400")
    public void validateHttpResponseCode400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I receive message error")
    public void validateDataDetailUser() {
        restAssuredThat(response -> response.body("error", equalTo("Missing password")));
    }
}
