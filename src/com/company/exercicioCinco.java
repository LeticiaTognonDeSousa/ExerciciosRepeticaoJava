package com.company;

import java.util.Scanner;

//Altere o programa anterior permitindo ao usuário informar as populações e
// as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
public class exercicioCinco {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            boolean continuar = false;

            while (!continuar) {
                System.out.println("Informe o primeiro país: ");
                double paisA = scan.nextDouble();
                System.out.println("Informe a taxa do primeiro país.");
                float taxaA = scan.nextFloat();
                System.out.println("Informe o segundo país: ");
                double paisB = scan.nextDouble();
                System.out.println("Informe a taxa do segundo país:");
                float taxaB = scan.nextFloat();

                int anos = 0;/*A varíaval ANOS foi colocada dentro do WHILE para que
                reiniciasse quando o usúario quisesse repetir a operação.*/

                do {
                    paisA += ((paisA * taxaA) / 100);
                    paisB += ((paisB * taxaB) / 100);
                    anos++;
                } while (paisA <= paisB);

                System.out.println("O país A ultrapassará ou se " +
                        "igualará ao país B em " + anos + " anos.");

                System.out.print("Gostaria de repitir a operação? S/N: ");
                String resposta = scan.next();

                if (resposta.equalsIgnoreCase("n")) {
                    continuar = true;
                }
            }
        }
    }


