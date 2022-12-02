package aft.steps;

import io.cucumber.java.Before;
import io.cucumber.java.ru.Когда;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class SearchCucumberStepDefinitions {

    public final String BASE_URL = "https://yandex.ru";
    public RequestSpecification requestSpec;

    @Before
    public void setUp() {
        requestSpec = new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .setBasePath("/search")
                .setAccept(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
    }

    @Когда("пользователь выполнил успешный поиск запроса: {string}")
    public void searchQuery(String query) {
        RestAssured
                .given()
                .spec(requestSpec)
                    .queryParam("text",query)
                .when()
                .get()
                .then()
                .statusCode(200)
                .log().all();
    }

}
