package com.biblioteca.model;

/**
 * Classe que representa um bibliotecário da biblioteca.
 * Esta classe herda de Usuario e implementa funcionalidades específicas para bibliotecários,
 * como cadastrar e remover livros.
 */

public class Bibliotecario extends Usuario{

    public Bibliotecario(String nome, String email, String dataCadastro) {
        super(nome, email, dataCadastro);
    }

    public void cadastrarLivro(String titulo) {
        // Lógica para cadastrar um livro
        System.out.println("Cadastrando o livro: " + titulo);
    }

    public void removerLivro(String titulo) {
        // Lógica para remover um livro
        System.out.println("Removendo o livro: " + titulo);
    }

    @Override
    public String exibirMenu() {
        // Lógica para exibir o menu do bibliotecário
        return "=========================================" +
                "\n1 - Cadastrar Livro" +
                "\n2 - Remover Livro" +
                "\n3 - Consultar Empréstimos" +
                "\n=========================================";
    }

    @Override
    public String toString() {
        return "Bibliotecario{" +
                ", nome='" + getNome() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", dataCadastro=" + getDataCadastro() +
                '}';
    }
}
