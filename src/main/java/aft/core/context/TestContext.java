package aft.core.context;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Класс для хранения переменных сценария, общих для всех шагов
 */
@Component
public class TestContext {

    @Autowired
    public static ApplicationContext applicationContext;

    private Map<String, Object> map = new HashMap<>();

    public void addVar(String name, Object var) {
        map.put(name, var);
    }

    public <T> T getVar(String name, Class<T> classType) {
        return classType.cast(map.get(name));
    }

}
