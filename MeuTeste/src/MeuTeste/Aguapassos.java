package MeuTeste;

import java.util.Scanner;

public class Aguapassos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Qual o tamanho do seu copo (em ml)?");
		int copo = teclado.nextInt();

		encherCopo(copo);
		teclado.close();

	}

	public static void encherCopo(int copo) {
		System.out.println("=============Indo até o bebedouro...=============\n");

		for (int passo = 1; passo <= 13; passo++) {
			System.out.println("Passo " + passo);
		}
		
		System.out.println("Virar à esquerda");

        for (int passo = 1; passo <= 7; passo++) {
            System.out.println("Passo " + passo);
        }

		System.out.println("\n=============Chegou ao bebedouro e pego o copo!=============\n");

		
		for (int i = 0; i <= copo; i += 10) 
			if (i < copo) {
				System.out.println("Enchendo... " + i + " ml");
			} else {
				System.out.println("\nCopo cheio! \n" + copo + " ml");
			} 
	}
}
