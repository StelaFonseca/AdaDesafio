package org.desafioada;

import org.desafioada.model.Pessoa;
import org.desafioada.servicos.CadastroDePessoa;
import org.desafioada.servicos.CatalogoFilmes;
import org.desafioada.servicos.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CatalogoFilmes catalogoFilmes = new CatalogoFilmes();
        CadastroDePessoa cadastroDePessoa = new CadastroDePessoa();
        Menu menu = new Menu();
        Scanner in = new Scanner(System.in);
        boolean executa = true;

        do {
            menu.exibir();
            int opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    cadastroDePessoa.cadastrarAtor();
                    break;
                case 2:
                    cadastroDePessoa.cadastrarDiretor();
                    break;
                case 3:
                    catalogoFilmes.adicionarFilme();
                    break;
                case 4:
                    Pessoa pessoa = cadastroDePessoa.buscarPessoaPorNome();
                    if (pessoa == null) {
                        break;
                    }

                    catalogoFilmes.associarPessoaAFilme(pessoa);
                    break;
                case 5:
                    catalogoFilmes.pesquisarPorNome();
                    break;
                case 6:
                    menu.exibirTelaDespedida();
                    executa = false;
            }
        } while (executa);
    }
}


