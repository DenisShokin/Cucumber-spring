package aft.steps;

import aft.web.pages.MainPage;
import io.cucumber.java.ru.Когда;
import org.springframework.beans.factory.annotation.Value;

import static com.codeborne.selenide.Selenide.page;

public class SearchCucumberStepDefinitions {

    @Value("${mainPageUrl}")
    private String url;
    private MainPage mainPage = page(MainPage.class);

    @Когда("пользователь перешел на главную страницу ya.ru")
    public void openPage() {
        mainPage.open(url);
    }

    @Когда("пользователь выполнил поиск на главной странице: {string}")
    public void searchOnPage(String query) throws InterruptedException {
        mainPage.search(query);
        Thread.sleep(5000);
    }

}
