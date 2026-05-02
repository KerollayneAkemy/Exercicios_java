package di;

import java.lang.reflect.Field;

public class Injector {

    public static void injetar(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        //pega todos os atributos dentro da classe

        for (Field field : fields) {//verificar atributo
            if (field.isAnnotationPresent(Inject.class)) {
                try {
                    field.setAccessible(true);

                    Object instancia = field.getType().getDeclaredConstructor().newInstance();

                    field.set(obj, instancia);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}