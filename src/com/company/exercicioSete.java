package com.company;

import java.util.Scanner;

//Faça um programa que leia 5 números e informe o maior número.
public class exercicioSete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num =0;
        int maior =0;

        for (int i = 1; i <= 5; i++){
            System.out.println("Digite um valor: ");
            num = scan.nextInt();
            if (num > maior) maior = num;
        }
        System.out.println("O maior valor digitado é: "+maior);
    }
}
