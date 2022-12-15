package aft.steps;

import aft.web.pages.MainPage;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.ru.Когда;

import static com.codeborne.selenide.Selenide.page;

public class SearchCucumberStepDefinitions {

    private final String BASE_URL = "https://ya.ru";

    private MainPage mainPage = page(MainPage.class);


    @Когда("пользователь перешел на главную страницу ya.ru")
    public void openPage() {
        Selenide.open(BASE_URL);
    }

    @Когда("пользователь выполнил поиск на главной странице: {string}")
    public void searchOnPage(String query) throws InterruptedException {
        mainPage.search(query);
        Thread.sleep(5000);
    }

}
