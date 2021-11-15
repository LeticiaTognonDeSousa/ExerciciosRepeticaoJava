package com.company;

import java.util.Scanner;

//Altere o programa anterior para mostrar no final a soma dos números.
public class exercicioOnze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int comeco, fim;
        int soma=0;

        System.out.println("Digite um numero: ");
        comeco = scan.nextInt();
        System.out.println("Digite outro numero: ");
        fim = scan.nextInt();
        for(int i = comeco; i <= fim; i++){
            System.out.print(i+" ");
            soma+=i;
        }
        System.out.println("\nSoma: "+soma);
    }
}