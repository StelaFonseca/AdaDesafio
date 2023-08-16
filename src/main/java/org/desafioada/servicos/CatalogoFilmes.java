package org.desafioada.servicos;

import org.desafioada.Filme;
import org.desafioada.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogoFilmes {

    List<Filme>filmes= new ArrayList<>();

    public CatalogoFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public void adicionarFilme(Filme filme){
        filmes.add(filme);
    }
    public void associarPessoaAFilme(Pessoa pessoa){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Vamos buscar um filme para associar a uma pessoa, digite o nome do filme: ");
        String nome = scanner.nextLine();

        for(Filme filme: filme){
            if(filme.getNome().equalsIgnoreCase(nome)){
                System.out.println("Achei seu filme" + filme);
                if(pessoa.ehDiretor()){
                   ///filme.addDiretor;


                }
            }

        }

    }

}
