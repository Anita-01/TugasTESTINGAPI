package starter.register.user.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class RegisterSuccess {
    protected static String url = "https://reqres.in/api/";

    @Step("I set POST api endpoints for register")
    public String setPostApiEndpoints() {
        return url + "register";
    }

    @Step("I send POST HTTP Request for register")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "eve.holt@reqres.in");
        requestBody.put("password", "pistol");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoints());
    }

    @Step("I receive valid HTTP response code 200 for register")
    public void validateHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for new user for register")
    public void validateDataDetailUser() {
        restAssuredThat(response -> response.body("'id'", equalTo(4)));
        restAssuredThat(response -> response.body("token", equalTo("QpwL5tke4Pnpja7X4")));
    }
}
