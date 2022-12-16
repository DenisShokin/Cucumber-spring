package aft.web.pages;

import aft.core.page.AbstractWebPage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractWebPage {

    @FindBy(xpath = "//*[@class='search3__input mini-suggest__input']")
    private SelenideElement searchField;

    public void search(String query) {
        searchField.setValue(query).pressEnter();
    }

}
