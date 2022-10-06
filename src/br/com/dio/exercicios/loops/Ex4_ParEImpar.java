package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros; //Variavel para quantidade de números
        int numero; //Variavel para numeros digitados
        int quantPares = 0, quantImpares = 0; //Variavel para separar numeros pares e impares

        System.out.println("Quantidade de numeros: "); //Solicita quantidade de numeros
        quantNumeros = scan.nextInt(); //Guarda quantidade de numeros digitados

        int count = 0; //Variavel para contador
        do {
            System.out.println("Numero: "); //Solicita numero
            numero = scan.nextInt(); //Guarda numero digitado

            if (numero % 2 == 0) quantPares++; //Divide numeros por 2 e guarda na variavel os numeros com resto igual a 0
            else quantImpares++; //Divide numeros por 2 e guarda na variavel os numeros com resto diferente de 0

            count++; //System o valor 1 ao contador
        } while (count < quantNumeros); //Para loop quando contador for igual a quantidade de numeros escolhida

        System.out.println("Quantide pares: " + quantPares);
        System.out.println("Quantide impares: " + quantImpares);

    }
}
