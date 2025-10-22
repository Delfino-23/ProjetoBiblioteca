package com.biblioteca.model;

/**
 * Classe que representa um administrador da biblioteca.
 * Esta classe herda de Bibliotecario e além das funcionalidades de um bibliotecário apresenta funcionalidades específicas para administradores,
 * como gerenciar usuários.
 */

public class Administrador extends Bibliotecario {

    public Administrador(String nome, String email, String dataCadastro) {
        super(nome, email, dataCadastro);
    }

    public void gerenciarUsuarios() {
        // Lógica para gerenciar usuários
        System.out.println("Gerenciando usuários...");
    }

    @Override
    public String exibirMenu() {
        // Lógica para exibir o menu do administrador
        return super.exibirMenu() +
                "\n- Cadastrar Usuário" +
                "\n- Remover Usuário" +
                "\n- Consultar Relatórios" +
                "\n- Consultar Usuários";
    }

    @Override
    public String toString() {
        return "Leitor {" +
                "\n\tNome: " + getNome() +
                "\n\tEmail: " + getEmail() +
                "\n\tData de Cadastro: " + getDataCadastro() +
                "\n}";
    }
}
