package com.biblioteca.model;

/**
 * Classe que representa um administrador da biblioteca.
 * Esta classe herda de Usuario e implementa funcionalidades específicas para administradores,
 * como gerenciar usuários.
 */

public class Administrador extends Usuario {

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
        return "=========================================" +
                "\n1 - Cadastrar Usuário" +
                "\n2 - Remover Usuário" +
                "\n3 - Consultar Relatórios" +
                "\n4 - Consultar Usuários" +
                "\n=========================================";
    }

    @Override
    public String toString() {
        return "Administrador{" +
                ", nome='" + getNome() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", dataCadastro=" + getDataCadastro() +
                '}';
    }
}
