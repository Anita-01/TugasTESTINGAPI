package starter.register.user.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class RegisterUnsuccessful {
    protected static String url = "https://reqres.in/api/";

    @Step("I send POST HTTP Request for unsuccessful register")
    public String setApiEndpoints() {
        return url + "register";
    }

    @Step("I send POST HTTP Request for unsuccessful register")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "sydney@fife");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setApiEndpoints());
    }

    @Step("I receive message error for register")
    public void validateDataDetailUser() {
        restAssuredThat(response -> response.body("error", equalTo("Missing password")));
    }
}
