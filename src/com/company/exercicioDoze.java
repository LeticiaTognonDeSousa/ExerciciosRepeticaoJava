package com.company;

//Desenvolva um gerador de tabuada,
// capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
// O usuário deve informar de qual numero ele deseja ver a tabuada.

import java.util.Scanner;

public class exercicioDoze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Digite um número: ");
        num = scan.nextInt();

        for (int i = 1; i <= 10; i++)
            System.out.println(num+" x "+i+ " = "+(num*i));

    }
}
