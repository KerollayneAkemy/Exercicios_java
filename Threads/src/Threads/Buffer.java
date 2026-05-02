package Threads;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {

	//onde os dados são agurdados
    private Queue<Integer> fila = new LinkedList<>();
    private final int LIMITE = 5;

    		//uma thread por vez
    public synchronized void produzir(int valor) throws InterruptedException {

    	//espera se não tiver espa~ço
        while (fila.size() == LIMITE) {
            wait();
        }

        fila.add(valor);
        System.out.println("Produziu: " + valor);

        notifyAll();//acorda
    }

    public synchronized int consumir() throws InterruptedException {

        while (fila.isEmpty()) {
            wait();
        }

        int valor = fila.poll();//remove 1°valor
        System.out.println("Consumiu: " + valor);

        notifyAll();//tem espaço

        return valor;
    }
}