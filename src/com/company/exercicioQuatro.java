package com.company;

//Supondo que a população de um país A seja da ordem de 80000 habitantes
// com uma taxa anual de crescimento de 3% e
// que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.
// Faça um programa que calcule e
// escreva o número de anos necessários para que a população do país A ultrapasse
// ou iguale a população do país B, mantidas as taxas de crescimento.

public class exercicioQuatro {
    public static void main(String[] args) {

        double paisA = 80000;
        double paisB = 200000;
        int anos = 0;

        do{
            paisA+=((paisA*3)/100);
            paisB+=((paisB*1.5)/100);
            anos++;
        }while (paisA<=paisB);
        System.out.println("O país A ultrapassará ou se igualará ao país B em "
                +anos+" anos.");

    }
}
