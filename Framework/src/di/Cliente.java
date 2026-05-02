package di;

public class Cliente {

    @Inject
    private Service service;

    public void usarServico() {
        service.executar();
    }
}