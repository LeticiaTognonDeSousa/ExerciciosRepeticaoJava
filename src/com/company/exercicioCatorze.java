package com.company;

import java.util.Scanner;

//Faça um programa que peça 10 números inteiros, calcule e
// mostre a quantidade de números pares e a quantidade de números impares.
public class exercicioCatorze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int par = 0;
        int impar = 0;

        for (int i = 1; i <= 10; i++){
            System.out.println("Digite o "+i+"º número: ");
            numero = scan.nextInt();
            if (numero%2==0){
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Dentre os números digitados, "+par+" são pares e "
        +impar+" são ímpares.");
    }
}
