package org.desafioada.model;

public class Diretor extends Pessoa {
    public Diretor(String nome, String dataNascimento) {
        super(nome, dataNascimento);
    }

    @Override
    public boolean ehDiretor() {
        return true;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "nome='" + nome + '\'' +
                '}';
    }
}