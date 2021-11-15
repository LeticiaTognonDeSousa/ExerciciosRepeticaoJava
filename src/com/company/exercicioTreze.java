package com.company;

//Faça um programa que peça dois números, base e expoente,
// calcule e mostre o primeiro número elevado ao segundo número.

import java.util.Scanner;

public class exercicioTreze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int base, expoente;

        System.out.println("Digite um valor para a base: ");
        base = scan.nextInt();
        System.out.println("Digite um valor que será o expoente: ");
        expoente = scan.nextInt();

        int multiplicado = 1;

        for (int i = 1; i <= expoente; i++) {
            multiplicado *= base;
        }
        System.out.println("O valor "+base+" elevado a "+expoente+
                " resulta em "+multiplicado);
    }
}
