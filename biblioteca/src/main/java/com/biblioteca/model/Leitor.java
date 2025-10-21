package com.biblioteca.model;

/**
 * Classe que representa um leitor da biblioteca.
 * Esta classe herda de Usuario e implementa funcionalidades específicas para leitores,
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
        return "=========================================" +
                "\n1 - Consultar Livro" +
                "\n2 - Reservar Livro" +
                "\n3 - Devolver Livro" +
                "\n=========================================";
    }

    @Override
    public String toString() {
        return "Leitor{" +
                ", nome='" + getNome() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", dataCadastro=" + getDataCadastro() +
                '}';
    }
}
