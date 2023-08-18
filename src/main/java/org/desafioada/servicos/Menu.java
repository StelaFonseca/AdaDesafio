package org.desafioada.servicos;

public class Menu {
    public void exibir(){
        System.out.println("=============================================");
        System.out.println("1. Cadastrar um Ator: ");
        System.out.println("2. Cadastrar um Diretor: ");
        System.out.println("3. Cadastrar um Filme: ");
        System.out.println("4. Associar uma pessoa a um filme: ");
        System.out.println("5. Pesquisar filme por nome: ");
        System.out.println("6. Sair: ");
        System.out.println("=============================================\n");

        System.out.print("Qual opçāo você deseja? ");
    }
    public void exibirTelaDespedida() {
        System.out.println("Certo, irei encerrar o programa. Muito obrigado! \n");
    }
}
