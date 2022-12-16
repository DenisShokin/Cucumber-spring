package aft.core.helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.springframework.stereotype.Component;

@Component
public class RequestHelper {

    public Response sendGetRequest(String url) {
        return RestAssured.given().get(url).then().log().all().extract().response();
    }
}
