package pl.rokitowski.fundamentals.annotations;

import java.lang.reflect.Field;

public class Validator {
    public static void validate(Object obj) throws IllegalAccessException{
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields){
            if (field.isAnnotationPresent(NotBlankField.class)){
                field.setAccessible(true);
                Object value = field.get(obj);

                if(value == null || value.toString().isBlank()){
                    throw new IllegalArgumentException(
                            "Field '" + field.getName() + "' cannot be blank"
                    );
                }
            }
        }
    }
}
