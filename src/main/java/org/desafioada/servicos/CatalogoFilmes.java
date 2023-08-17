package org.desafioada.servicos;
import org.desafioada.model.Ator;
import org.desafioada.Diretor;
import org.desafioada.model.Filme;
import org.desafioada.Pessoa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogoFilmes {

    private List<Filme> filmes;

    public CatalogoFilmes() {
        this.filmes = new ArrayList<>();
    }

    public void adicionarFilme() {
        Scanner scanner = new Scanner(System.in);

        String nome;
        String dataLancamento;
        double orcamento;
        String descricao;

        System.out.println("Qual o nome do Filme?");
        nome = scanner.nextLine();

        System.out.println("Qual Data de Lançamento do Filme?");
        dataLancamento = scanner.nextLine();

        System.out.println("Qual o orçamento do Filme?");
        orcamento = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Qual a descriçāo do Filme?");
        descricao = scanner.nextLine();

        Filme filme = new Filme(nome, dataLancamento, orcamento, descricao);
        this.filmes.add(filme);

        System.out.println("Sucesso! O filme foi adicionado ao Catálogo.\n");
    }

    // EXEMPLO A MAIS
    public void imprimirListaFilme() {
        for (Filme filme : filmes) {
            System.out.println("[nome = " + filme.getNome() + ", descriçāo = " + filme.getDescricao());
            System.out.println(", Participantes = ");
            filme.exibirParticipantesFilme();
            System.out.println("]");
        }
    }


    public void associarPessoaAFilme(Pessoa pessoa) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos buscar um filme para associar a uma pessoa, digite o nome do filme: ");
        String nome = scanner.nextLine();

        for (Filme filme: filmes) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Achei o seu filme: " + filme);

                if(pessoa.ehDiretor()) {
                    filme.vincularDiretorAoFilme(pessoa);
                    return;
                }

                filme.vincularAtorAoFilme(pessoa);
                System.out.println(pessoa.getNome() + "Foi adicionada ao filme " + filme.getNome() + "\n");
                return;
            }
        }

        System.out.println("Nao achei nenhum filme com esse nome!\n");
    }


    public void cadastrarAtor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do ator que deseja cadastrar: ");
        String nomeAtor = scanner.nextLine();

        System.out.println("Digite a data de nascimento do ator: ");
        String dataNascimentoAtor = scanner.nextLine();

        Ator ator = new Ator(nomeAtor, dataNascimentoAtor);
        // Se a classe Ator não tiver um construtor que recebe a data de nascimento, ajuste essa linha conforme necessário

        System.out.println("Ator " + nomeAtor + " cadastrado.");
    }

    public void cadastrarDiretor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do diretor que deseja cadastrar: ");
        String nomeDiretor = scanner.nextLine();

        System.out.println("Digite a data de nascimento do diretor: ");
        String dataNascimentoDiretor = scanner.nextLine();

        Diretor diretor = new Diretor(nomeDiretor, dataNascimentoDiretor);
        // Se a classe Diretor não tiver um construtor que recebe a data de nascimento, ajuste essa linha conforme necessário

        System.out.println("Diretor " + nomeDiretor + " cadastrado.");
    }




    public void pesquisarPorNome() {
        Scanner scanner = new Scanner(System.in);
        boolean filmeAchado = false;

        System.out.println("Qual o nome do Filme que voce deseja pesquisar?");
        String nome = scanner.nextLine();

        for (Filme filme : filmes) {
            filmeAchado = filme.getNome().equalsIgnoreCase(nome);

            if (filmeAchado) {
                System.out.println("Achei o seu filme: " + filme);
            }
        }

        if (!filmeAchado) {
            System.out.println("Nao achei nenhum filme com esse nome!");
        }
    }

    /*public void exibirParticipantesFilme() {
        for (Pessoa pessoa : pessoa) {
            System.out.print(" " + pessoa.getNome() + ",");
        }*/
    }






