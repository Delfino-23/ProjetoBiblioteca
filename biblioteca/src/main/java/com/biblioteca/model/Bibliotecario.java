package com.biblioteca.model;

/**
 * Classe que representa um bibliotecário da biblioteca.
 * Esta classe herda de Leitor e além das funcionalidades de um leitor apresenta funcionalidades específicas para bibliotecários,
 * como cadastrar e remover livros.
 */

public class Bibliotecario extends Leitor{

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
        return super.exibirMenu() +
                "\n- Cadastrar Livro" +
                "\n- Remover Livro" +
                "\n- Consultar Empréstimos";
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
