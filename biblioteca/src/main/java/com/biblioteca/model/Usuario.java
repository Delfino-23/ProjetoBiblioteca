package com.biblioteca.model;

/**
 * Classe abstrata que representa um usuário genérico da biblioteca.
 * Esta classe serve como superclasse para diferentes tipos de usuários,
 * como Leitor, Bibliotecario e Administrador.
 */

public abstract class Usuario {
    private String nome;
    private String email;
    private String dataCadastro;

    public Usuario(String nome, String email, String dataCadastro) {
        this.nome = nome;
        this.email = email;
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void login() {
        // Lógica de login
        System.out.println(nome + " fez login.");
    }

    public void logout() {
        // Lógica de logout
        System.out.println(nome + " fez logout.");
    }

    public String exibirMenu() {
        return "====================================" +
                "\n1 - Login" +
                "\n2 - Logout" +
                "\n====================================";
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", dataCadastro=" + dataCadastro +
                '}';
    }
}