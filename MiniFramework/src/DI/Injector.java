package DI;

import Annotations.Inject;

import java.lang.reflect.Field;

public class Injector {

    public static void injetar(Object obj) {
        Field[] campos = obj.getClass().getDeclaredFields();

        for (Field campo : campos) {
            if (campo.isAnnotationPresent(Inject.class)) {

                try {
                    campo.setAccessible(true);

                    Object dependencia = campo.getType().newInstance();

                    campo.set(obj, dependencia);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}