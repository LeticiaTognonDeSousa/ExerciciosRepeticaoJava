package com.company;

import java.util.Scanner;

//Faça um programa que receba dois números inteiros e
//gere os números inteiros que estão no intervalo compreendido por eles.
public class exercicioDez {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int comeco, fim;

        System.out.println("Digite um numero: ");
        comeco = scan.nextInt();
        System.out.println("Digite outro numero: ");
        fim = scan.nextInt();
        for(int i = comeco; i <= fim; i++){
            System.out.println(i);
        }
    }
}
