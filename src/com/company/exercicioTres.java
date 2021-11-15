package com.company;

//Faça um programa que leia e valide as seguintes informações:
//Nome: maior que 3 caracteres;
//Idade: entre 0 e 150;
//Salário: maior que zero;
//Sexo: 'f' ou 'm';
//Estado Civil: 's', 'c', 'v', 'd';

import java.util.Scanner;

public class exercicioTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome, sexo, estadoCivil;
        int idade;
        float salario;

        do {
            System.out.println("Digite seu nome: ");
            nome = scan.next();
            if (nome.length()<3) System.out.println("Inválido! Digite 4 letras ou mais. ");
        } while (nome.length()<3);
        //O .length possibilita medir o tamanho de uma String.

        do {
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
            if(idade > 150 || idade <= 0)
                System.out.println("Inválido! Digite uma idade de 0 a 150. ");
        } while (idade > 150 || idade <= 0);

        do {
            System.out.println("Digite seu salário: ");
            salario = scan.nextFloat();
            if(salario <= 0)
                System.out.println("Inválido! Digite um valor maior do que R$ 0,00");
            }while (salario <= 0);

        do {
            System.out.println("Diga seu sexo: F para feminino e M para masculino: ");
            sexo = scan.next();
            if (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"))
                System.out.println("Inválido! Digite F ou M. ");
        }while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"));

        do {
            System.out.println("Diga seu estado civil: S para solteiro(a) " +
                    ", C para casado(a), V para viúvo(a) e D para divorciado(a): ");
            estadoCivil = scan.next();
            if (!estadoCivil.equalsIgnoreCase("s") &
                    !estadoCivil.equalsIgnoreCase("c") &
                    !estadoCivil.equalsIgnoreCase("v") &
                    !estadoCivil.equalsIgnoreCase("d"))
                    System.out.println("Inválido! Digite S, C, V ou D. ");
        } while (!estadoCivil.equalsIgnoreCase("s") &
                !estadoCivil.equalsIgnoreCase("c") &
                !estadoCivil.equalsIgnoreCase("v") &
                !estadoCivil.equalsIgnoreCase("d"));

        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Salário: R$ "+salario);
        System.out.println("Sexo: "+sexo);
        System.out.println("Estado Civil: "+estadoCivil);
    }
}
