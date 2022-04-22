package starter.get.user.negative;

import net.thucydides.core.annotations.Step;

public class GetSingleUserText {
    protected static String url = "https://reqres.in/api/";


    @Step("I set GET api endpoints for single user for text")
    public String setApiEndpoints() {
        return url + "users/aa";
    }
}
