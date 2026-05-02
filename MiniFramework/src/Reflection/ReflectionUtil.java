package Reflection;

import java.lang.reflect.Method;

public class ReflectionUtil {

    public static void listarMetodos(Class<?> classe) {
        Method[] metodos = classe.getDeclaredMethods();

        for (Method m : metodos) {
            System.out.println("Método: " + m.getName());
        }
    }
}