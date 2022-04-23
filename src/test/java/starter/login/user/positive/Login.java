package starter.login.user.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Login {
    protected static String url = "https://reqres.in/api/";

    @Step("I set POST api endpoints for login")
    public String setApiEndpoints() {
        return url + "login";
    }

    @Step("I send POST HTTP Request for login")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "eve.holt@reqres.in");
        requestBody.put("password", "cityslicka");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setApiEndpoints());
    }

    @Step("I receive valid token for login")
    public void validateDataDetailUser() {
        restAssuredThat(response -> response.body("token", equalTo("QpwL5tke4Pnpja7X4")));
    }
}
