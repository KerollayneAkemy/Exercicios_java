package Threads;

public class Consumidor extends Thread {

    private Buffer buffer;//guarda referencia

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {

        try {
            while (true) {
                buffer.consumir();//remmover valor 
                Thread.sleep(600);
            }
        } catch (InterruptedException e) {
            System.out.println("Consumidor interrompido");
        }
    }
}