package starter.get.user.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetSingleUserNotFound {
        protected static String url = "https://reqres.in/api/";

        @Step("I set GET api endpoints for single user not found")
        public String setApiEndpoints() {
            return url + "users/23";
        }

        @Step("I send GET HTTP Request single user not found")
        public void sendGetHttpRequest() {
            SerenityRest.given().get(setApiEndpoints());
        }

        @Step("I receive valid HTTP response code 404 single user not found")
        public void validateHttpResponseCode404() {
            restAssuredThat(response -> response.statusCode(404));
        }

}
