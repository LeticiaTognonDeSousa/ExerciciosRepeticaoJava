package com.company;

//Faça um programa que peça uma nota, entre zero e dez.
// Mostre uma mensagem caso o valor seja inválido e
// continue pedindo até que o usuário informe um valor válido.

import java.util.Scanner;

public class exercicioUm {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        do {
            System.out.println("Digite uma nota de zero a dez: ");
            nota = scan.nextInt();
            if (nota > 10 | nota < 0) System.out.println("Esse valor é inválido.");
        } while (nota > 10 | nota < 0);

        System.out.println("Você digitou "+nota+ "." + " Esse valor é válido!");
    }
}
