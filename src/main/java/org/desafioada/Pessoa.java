package org.desafioada;

import java.time.LocalDate;

public abstract class Pessoa {

    protected final String nome;
    protected final LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public abstract boolean ehDiretor();

}

