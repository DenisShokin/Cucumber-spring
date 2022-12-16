package aft.steps;

import aft.actions.UsersAction;
import io.cucumber.java.ru.И;
import org.springframework.beans.factory.annotation.Autowired;

public class UsersCucumberStepDefinitions {

    @Autowired
    private UsersAction usersAction;

    @И("^получены все пользователи$")
    public void getAllUsers() {
        usersAction.getAllUsers().then().assertThat().statusCode(200);
    }
}
