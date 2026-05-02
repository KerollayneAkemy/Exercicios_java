package Threads;

public class Produtor extends Thread {

    private Buffer buffer;

    public Produtor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {

        int valor = 1;

        try {
            while (true) {
                buffer.produzir(valor++);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("Produtor interrompido");
        }
    }
}