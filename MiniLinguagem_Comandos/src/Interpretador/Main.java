package Interpretador;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Contexto ctx = new Contexto();

        System.out.println("Mini Interpretador (digite 'sair' para encerrar)");

        while (true) {

            System.out.print("> ");
            String comando = sc.nextLine();

            if (comando.equalsIgnoreCase("sair")) {
                break;
            }

            Interpretador.interpretar(comando, ctx);
        }

        sc.close();
    }
}