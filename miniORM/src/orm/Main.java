package orm;

public class Main {

    public static void main(String[] args) {

        Usuario u = new Usuario(1, "Karol", "karol@email.com");

        OrmSimples.salvar(u);

        String texto = Serializador.serializar(u);

        System.out.println("Objeto serializado:");
        System.out.println(texto);
    }
}