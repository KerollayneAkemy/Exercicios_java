package orm;

import java.lang.reflect.Field;

public class Serializador {

    public static String serializar(Object obj) {

        StringBuilder sb = new StringBuilder();

        try {
            Field[] fields = obj.getClass().getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);

                sb.append(field.getName())//nome atributo
                  .append(":")//separador
                  .append(field.get(obj))//valor atributo
                  .append("|");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}