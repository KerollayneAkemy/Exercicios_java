package Interpretador;

import java.util.HashMap;// chave - valor
import java.util.Map;//implementação map

public class Contexto {

	//onde ira ficar guardado os valores em string(texto)
    private Map<String, String> variaveis = new HashMap<>();

    public void set(String chave, String valor) {
        variaveis.put(chave, valor);
    }//Salva uma variável na memória

    // busca variável
    public String get(String chave) {
        return variaveis.get(chave);
    }
}