package aft.actions;

import aft.core.helper.RequestHelper;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UsersAction {

    @Autowired
    private RequestHelper requestHelper;

    @Value("${baseUrl}")
    private String url;

    public Response getAllUsers() {
        return requestHelper.sendGetRequest(url + "users");
    }
}
