package aft.steps;

import aft.web.pages.SearchPage;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.Before;
import io.cucumber.java.ru.Когда;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static com.codeborne.selenide.Selenide.page;

public class SearchCucumberStepDefinitions {

    public final String BASE_URL = "https://ya.ru";

    public SearchPage searchPage = page(SearchPage.class);
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

    @Когда("перешел на главную страницу ya.ru")
    public void openPage() {
        Selenide.open(BASE_URL);
    }

    @Когда("выполнил поиск на странице: {string}")
    public void searchOnPage(String query) throws InterruptedException {
        searchPage.search(query);
        Thread.sleep(5000);
    }

}
