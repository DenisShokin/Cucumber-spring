package aft.steps;

import io.cucumber.java.ru.Когда;
import io.restassured.RestAssured;

public class SearchCucumberStepDefinitions {

    @Когда("пользователь выполнил успешный поиск запроса: {string}")
    public void searchQuery(String query) {
        RestAssured
                .given()
                .get("https://yandex.ru/search/?text=" + query)
                .then()
                .assertThat().statusCode(200)
                .log().all();
    }

}
