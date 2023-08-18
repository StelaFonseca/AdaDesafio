package org.desafioada.servicos;
import org.desafioada.Ator;
import org.desafioada.Diretor;
import org.desafioada.Pessoa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroDePessoa {
    private List<Pessoa> pessoas;

    public CadastroDePessoa() {
        pessoas = new ArrayList<>();
    }

    public void cadastrarDiretor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o nome do Diretor que você deseja adicionar: ");
        String nome = scanner.nextLine();
        System.out.println("Qual a data de Nascimento do "+ nome + ": ");
        String dataNascimento = scanner.nextLine();

        pessoas.add(new Diretor(nome, dataNascimento));
        System.out.println("Diretor(a) " + nome + " adicionado(a) ao cadastro.\n");
    }

    public void cadastrarAtor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o nome do Ator que você deseja adicionar: ");
        String nome = scanner.nextLine();
        System.out.println("Qual a data de Nascimento do "+ nome + ": ");
        String dataNascimento = scanner.nextLine();

        pessoas.add(new Ator(nome, dataNascimento));
        System.out.println("Ator " + nome + " adicionado(a) ao cadastro.\n");
    }

    public Pessoa buscarPessoaPorNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o nome da Pessoa que você deseja Buscar: ");
        String nome = scanner.nextLine();

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                return pessoa;
            }
        }

        System.out.println("A pessoa que voce deseja nao está cadastrada no nosso sistema!\n");
        return null;
    }

    public void imprimirPessoas() {
        System.out.println("Lista de Pessoas no Cadastro:");
        for (Pessoa pessoa : pessoas) {
            System.out.println("- " + pessoa.getNome());
        }
    }
}






