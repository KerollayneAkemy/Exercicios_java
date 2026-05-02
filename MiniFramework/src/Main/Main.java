package Main;

import DI.Injector;
import Model.Controller;
import Model.Usuario;
import Orm.EntityManager;
import Reflection.ReflectionUtil;

public class Main {

    public static void main(String[] args) {

        // 🔹 Reflection
        ReflectionUtil.listarMetodos(Controller.class);

        // 🔹 DI
        Controller c = new Controller();
        Injector.injetar(c);
        c.iniciar();

        // 🔹 ORM
        Usuario u = new Usuario("Karol", 20);
        EntityManager.salvar(u);
    }
}