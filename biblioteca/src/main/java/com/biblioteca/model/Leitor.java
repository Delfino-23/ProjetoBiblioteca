package com.biblioteca.model;

/**
 * Classe que representa um leitor da biblioteca.
 * Esta classe herda de Usuario e apresenta funcionalidades específicas para leitores,
 * como consultar e reservar livros.
 */

public class Leitor extends Usuario {

    public Leitor(String nome, String email, String dataCadastro) {
        super(nome, email, dataCadastro);
    }

    public void consultarLivro(String titulo) {
        // Lógica para consultar um livro pelo título
        System.out.println("Consultando o livro: " + titulo);
    }

    public void reservarLivro(String titulo) {
        // Lógica para reservar um livro pelo título
        System.out.println("Reservando o livro: " + titulo);
    }

    @Override
    public String exibirMenu() {
        // Lógica para exibir o menu do leitor
        return super.exibirMenu() +
                "\n- Consultar Livro" +
                "\n- Reservar Livro" +
                "\n- Devolver Livro";
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
