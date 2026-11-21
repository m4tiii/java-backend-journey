package pl.rokitowski.fundamentals.ioc;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class MiniContainer {
    private final Map<Class<?>, Object> beans = new HashMap<>();

    public <T> T getBean(Class<T> type) throws Exception{

        if(beans.containsKey(type)) {
            return type.cast(beans.get(type));
        }
        Constructor<?> ctor = type.getDeclaredConstructors()[0];   // pierwszy konstruktor
        Class<?>[] paramTypes = ctor.getParameterTypes();          // np. [Engine.class]

        Object[] args = new Object[paramTypes.length];
        for (int i = 0; i < paramTypes.length; i++) {
            args[i] = getBean(paramTypes[i]);
        }

        T instance = type.cast(ctor.newInstance(args));

        beans.put(type, instance);
        return instance;
    }
}
