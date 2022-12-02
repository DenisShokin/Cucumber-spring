package aft.hook;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.BeforeAll;

public class Hooks {

    @BeforeAll
    public static void setUp() {
        Configuration.headless = false;
    }
}
