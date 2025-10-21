package com.biblioteca;

import java.util.ArrayList;

import com.biblioteca.model.Administrador;
import com.biblioteca.model.Bibliotecario;
import com.biblioteca.model.Leitor;
import com.biblioteca.model.Usuario;

public class BibliotecaApp {
    public static void main(String[] args) {
        ArrayList<Usuario> listaDeUsuarios = new ArrayList<>();
        Leitor leitor1 = new Leitor("Ana Silva", "ana.silva@email.com", "15/10/2025");
        Bibliotecario biblio1 = new Bibliotecario("Carlos Souza", "carlos.souza@email.com", "10/08/2024");
        Administrador admin1 = new Administrador("Marcos Roberto", "marcos.roberto@email.com", "01/01/2023");

        listaDeUsuarios.add(leitor1);
        listaDeUsuarios.add(biblio1);
        listaDeUsuarios.add(admin1);

        System.out.println("--- Testando Polimorfismo no Sistema da Biblioteca ---");
        for (Usuario usuario : listaDeUsuarios) {
            System.out.println("\n--------------------------------------------------");
            System.out.println("Dados do Usuário:");
            System.out.println(usuario.toString()); // método da superclasse

            System.out.println("\nAções Disponíveis para o perfil:");
            System.out.println(usuario.exibirMenu());
            System.out.println("--------------------------------------------------");
        }
    }
}