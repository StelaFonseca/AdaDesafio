package org.desafioada.model;

public class Ator extends Pessoa {

    public Ator(String nome, String dataNascimento ) {
        super(nome, dataNascimento);
    }


    @Override
    public boolean ehDiretor() {
        return false;
    }

    @Override
    public String toString() {
        return "Ator{" +
                "nome='" + nome + '\'' +
                '}';
    }
}