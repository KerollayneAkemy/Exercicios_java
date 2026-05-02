package Model;

import Annotations.Inject;

public class Controller {

    @Inject
    private Servico servico;

    public void iniciar() {
        servico.executar();
    }
}