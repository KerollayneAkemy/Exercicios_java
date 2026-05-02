package Orm;

import Annotations.Column;
import Annotations.Entity;

import java.lang.reflect.Field;

public class EntityManager {

    public static void salvar(Object obj) {

        Class<?> classe = obj.getClass();

        if (!classe.isAnnotationPresent(Entity.class)) {
            System.out.println("Não é uma entidade!");
            return;
        }

        System.out.println("INSERT INTO " + classe.getSimpleName());

        Field[] campos = classe.getDeclaredFields();

        for (Field campo : campos) {
            if (campo.isAnnotationPresent(Column.class)) {

                campo.setAccessible(true);

                try {
                    System.out.println(
                        campo.getAnnotation(Column.class).name()
                        + " = " + campo.get(obj)
                    );
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}