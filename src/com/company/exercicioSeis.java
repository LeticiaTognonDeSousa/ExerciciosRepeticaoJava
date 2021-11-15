package com.company;

//Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
// Depois modifique o programa para que ele mostre os números um ao lado do outro.

public class exercicioSeis {
    public static void main(String[] args) {
        for(int i=1; i <= 20; i++) {
            System.out.print(i+" ");
            /*A remoção das letras LN no fim de .print possibilitou que
            os números aparecessem um ao lado do outro.
            */
        }
    }
}
