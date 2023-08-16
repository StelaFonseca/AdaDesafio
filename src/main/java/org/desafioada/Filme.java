package org.desafioada;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    protected String nome;
    protected LocalDate dataLancamento;
    protected double Orcamento;
    protected String Descricao;
    private List<Pessoa> pessoas;


    public Filme(String nome, LocalDate dataLancamento, double orcamento, String descricao, List<Pessoa> pessoas) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        Orcamento = orcamento;
        Descricao = descricao;
        this.pessoas = new ArrayList<>();
    }
    public void adicionarAtor(Pessoa pessoa){
        if(pessoa.ehDiretor()) {
            System.out.println("Somente ator pode ser adiconado nessa sessão ");
        }else{
            this.pessoas.add(pessoa);
        }
}

    public String getNome(){
        return nome;
    }
    public LocalDate getDataLancamento(){
        return dataLancamento;
    }

    public double getOrcamento(){
        return Orcamento;
    }

    public String getDescricao(){
        return Descricao;
    }

    public List<Pessoa> getPessoas(){
        return pessoas;

    }
    // FALTA: add diretor
    //pesquisar por filme por nome, independente de ser maiuscula e minuscula;

}

