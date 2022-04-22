package starter.get.user.negative;

import net.thucydides.core.annotations.Step;

public class GetListUserText {
    protected static String url = "https://reqres.in/api/";


    @Step("I set GET api endpoints for list user for text")
    public String setApiEndpoints() {
        return url + "users?page=uybkfa";
    }
}
