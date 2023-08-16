package org.desafioada;

import java.time.LocalDate;

public class Diretor extends Pessoa {
    public Diretor(String nome, LocalDate dataNascimento) {
        super(nome, dataNascimento);
    }

    @Override
    public boolean ehDiretor() {
        return true;
    }
}
