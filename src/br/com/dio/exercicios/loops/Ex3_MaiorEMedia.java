package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero; //variavel para guardar numero digitado
        int maior = 0; //variavel para guardar maior numero
        int soma = 0; //variavel para guardar soma dos numeros

        int count = 0; //controla loop
        do {
            System.out.println("Numero: "); //Solicita numero
            numero = scan.nextInt(); //Guarda numero digitado

            soma += numero; //Soma todos numeros digitados

            if(numero > maior) maior = numero; //Variavel maior receber valor de numero, caso ele seja maior

            count += 1; //Soma valor 1 ao contador  do loop

        } while (count < 5); //Limita contador para rodar 5 vezes

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/5));
    }
}
