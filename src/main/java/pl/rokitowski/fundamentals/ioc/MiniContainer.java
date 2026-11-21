package pl.rokitowski.fundamentals.ioc;

import java.util.HashMap;
import java.util.Map;

public class MiniContainer {
    private final Map<Class<?>, Object> beans = new HashMap<>();

    public <T> T getBean(Class<T> type) throws Exception{

        if(beans.containsKey(type)) {
            return type.cast(beans.get(type));
        }
        T instance = type.getDeclaredConstructor().newInstance();

        beans.put(type, instance);
        return instance;
    }
}
