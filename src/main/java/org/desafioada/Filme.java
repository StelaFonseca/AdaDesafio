package org.desafioada;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    protected String nome;
    protected String dataLancamento;
    protected double orcamento;
    protected String descricao;
    private List<Pessoa> pessoas;


    public Filme(String nome, String dataLancamento, double orcamento, String descricao) {
        this.nome = nome;
        this.dataLancamento=dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.pessoas = new ArrayList<>();
    }
    public void vincularAtorAoFilme(Pessoa pessoa) {
        if (pessoa.ehDiretor()) {
            System.out.println("Somente ator pode ser adicionado nessa sessão");
        } else {
            this.pessoas.add(pessoa);
            System.out.println("Ator " + pessoa.getNome() + " adicionado ao filme " + this.getNome());
        }
    }
    public String getNome(){
        return nome;
    }
    public String getDataLancamento(){
        return dataLancamento;
    }

    public double getOrcamento(){
        return orcamento;
    }

    public String getDescricao(){
        return descricao;
    }
    public void vincularDiretorAoFilme(Pessoa pessoa) {
        boolean temDiretor = false;

        for (Pessoa pessoaDaLista : pessoas) {
            if (pessoaDaLista.ehDiretor()) {
                temDiretor = true;
                break;
            }
        }

        if (temDiretor) {
            System.out.println("Somente pode ser adicionado 1 Diretor ao filme!");
        } else {
            if (pessoa.ehDiretor()) {
                this.pessoas.add(pessoa);
            } else {
                System.out.println("Somente pode ser adicionado Diretores nessa funcionalidade!");
            }
        }
    }

    public void exibirParticipantesFilme() {
        for (Pessoa pessoa : pessoas) {
            System.out.print(" " + pessoa.getNome() + ",");
        }
    }
    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", dataLancamento='" + dataLancamento + '\'' +
                ", orcamento=" + orcamento +
                ", descricao='" + descricao + '\'' +
                ", pessoas=" + pessoas +
                '}';
    }
}