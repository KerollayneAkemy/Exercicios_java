package di;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        Injector.injetar(cliente);

        cliente.usarServico();

        System.out.println("\n===Métodos do Cliente===");

        Method[] metodos = Cliente.class.getDeclaredMethods();

        for (Method m : metodos) {
            System.out.println(m.getName());
        }

        System.out.println("\n===Método via Reflection===");

        try {
            Method metodo = Cliente.class.getDeclaredMethod("usarServico");
            metodo.invoke(cliente);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}