package Threads;

import java.util.LinkedList;//tamanho max
import java.util.Queue;//fila - fifo

public class ThreadPoolSimples {

	//fila de tarefas
    private final Queue<Runnable> tarefas = new LinkedList<>();

    public ThreadPoolSimples(int numThreads) {//cria algumas threads
        for (int i = 0; i < numThreads; i++) {
            new Worker().start();
        }
    }

    public synchronized void executar(Runnable tarefa) {
        tarefas.add(tarefa);
        notifyAll();//acorda as que estavam esperando
    }

    private class Worker extends Thread {

        public void run() {
            while (true) {

                Runnable tarefa;// guardar a tarefa retirada da fila

                synchronized (ThreadPoolSimples.this) {

                    while (tarefas.isEmpty()) {//verifica se fila esá vazia
                        try {
                            ThreadPoolSimples.this.wait(); //faz dormi/parada
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    tarefa = tarefas.poll();//remove da fila
                }

                try {
                    tarefa.run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}