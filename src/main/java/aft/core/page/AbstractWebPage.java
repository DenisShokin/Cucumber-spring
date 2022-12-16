package aft.core.page;

import com.codeborne.selenide.Selenide;

public abstract class AbstractWebPage implements Page {

    @Override
    public void open(String url) {
        Selenide.open(url);
    }
}