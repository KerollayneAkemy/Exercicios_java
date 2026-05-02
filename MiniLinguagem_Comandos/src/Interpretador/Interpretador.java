package Interpretador;

public class Interpretador {

    public static void interpretar(String comando, Contexto ctx) {

        String[] partes = comando.split(" ");//Divide em partes
        String acao = partes[0];

        switch (acao) {

            case "print":
                if (partes.length == 2) {
                    String valor = ctx.get(partes[1]);

                    if (valor != null) {
                        System.out.println(valor);
                        break;
                    }
                }

                // imprime texto normal(retirando print da frente)
                System.out.println(comando.substring(6));
                break;

            case "set":
                if (partes.length >= 3) {
                    ctx.set(partes[1], partes[2]);
                } else {
                    System.out.println("Uso: set nome valor");
                }
                break;

            case "soma":
                int a = Integer.parseInt(partes[1]);
                int b = Integer.parseInt(partes[2]);
                System.out.println("Resultado: " + (a + b));
                break;

            case "sub":
                int x = Integer.parseInt(partes[1]);
                int y = Integer.parseInt(partes[2]);
                System.out.println("Resultado: " + (x - y));
                break;

            default:
                System.out.println("Comando desconhecido!");
        }
    }
}