package orm;

import java.io.FileWriter;//escrever no arquivo
import java.io.IOException;
import java.lang.reflect.Field;//atributos 

public class OrmSimples {

    public static void salvar(Object obj) {

        try {
            // Nome do arquivo = nome da classe que vai ser salvo txt
            String nomeArquivo = obj.getClass().getSimpleName() + ".txt";

            FileWriter writer = new FileWriter(nomeArquivo, true);
            //vai escrever no arquivo e o true serve salvar o contéudo do arquivo

            Field[] fields = obj.getClass().getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);

                // Nome do campo + valor + ;
                writer.write(field.getName() + "=" + field.get(obj) + ";");
            }

            writer.write("\n");
            writer.close();

            System.out.println("Objeto salvo no arquivo!");

        } catch (IOException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}