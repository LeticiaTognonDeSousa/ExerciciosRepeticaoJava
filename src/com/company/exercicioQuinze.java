package com.company;

import java.util.Scanner;

//Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
// Ex.: 5!=5.4.3.2.1=120
public class exercicioQuinze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int fatorial = 1;

        System.out.println("Digite um número: ");
        num = scan.nextInt();

        for (int i = num; i >= 1; i--) {
            if(i!=1) {
                System.out.print(i + " x ");
            } else {
                System.out.print(i);
            }
            fatorial*=i;
        }
        System.out.print(" = "+fatorial);
    }
}
