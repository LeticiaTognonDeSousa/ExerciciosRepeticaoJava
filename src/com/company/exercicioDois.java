package com.company;

//Faça um programa que leia um nome de um usuário e a sua senha
// e não aceite a senha igual ao nome do usuário,
// mostrando uma mensagem de erro e voltando a pedir as informações.

import java.util.Scanner;

public class exercicioDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String usuario;
        String senha;

        do {
            System.out.println("Digite seu usuário: ");
            usuario = scan.next();
            System.out.println("Digite sua senha: ");
            senha = scan.next();
            if (usuario.equalsIgnoreCase(senha))
                System.out.println("Usuário e senha devem ser diferentes");
        } while(usuario.equalsIgnoreCase(senha));
        //O equalsIgnoreCase() compara Strings, verificando se são iguais,
        //ignorando o fato de haver letras maiúsculas e minúsculas em alguma delas.
        System.out.println("Cadastro realizado com sucesso!");

    }
}
