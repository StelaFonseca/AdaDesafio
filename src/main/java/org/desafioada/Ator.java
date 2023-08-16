package org.desafioada;

import java.time.LocalDate;

public class Ator extends Pessoa{


    public Ator(String nome, LocalDate dataNascimento) {
        super(nome, dataNascimento);
    }

    @Override
    public boolean ehDiretor() {
        return false;
    }

}
