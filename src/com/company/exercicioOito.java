package com.company;

import java.util.Scanner;

//Faça um programa que leia 5 números e informe a soma e a média dos números.
public class exercicioOito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int soma =0;

        for (int i = 1; i <= 5; i++){
            System.out.println("Digite um valor: ");
            num = scan.nextInt();
            soma+=num;
        }
        double media = soma/5.00;
        System.out.println("A soma do valor digitado é "+soma+" e sua média é "+media);
    }
}
