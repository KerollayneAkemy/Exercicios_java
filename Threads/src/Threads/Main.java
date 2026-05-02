package Threads;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Thread básica ===");

        MyThread t1 = new MyThread();
        t1.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        // =========================

        System.out.println("\n=== Produtor-Consumidor ===");

        Buffer buffer = new Buffer();

        Produtor p = new Produtor(buffer);
        Consumidor c = new Consumidor(buffer);

        p.start();
        c.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}

        // =========================

        System.out.println("\n=== Thread Pool ===");

        ThreadPoolSimples pool = new ThreadPoolSimples(3);

        for (int i = 1; i <= 5; i++) {
            int num = i;

            pool.executar(() -> {
                System.out.println("Executando tarefa " + num);
            });
        }
    }
}