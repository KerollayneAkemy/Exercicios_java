package Model;

import Annotations.Entity;
import Annotations.Column;

@Entity
public class Usuario {

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private int idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}