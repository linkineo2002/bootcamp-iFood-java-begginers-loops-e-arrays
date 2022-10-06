package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Digite o nome: "); //Sera exibida mensagem solicitando que usuario digite o nome
            nome = scan.next(); //Para alimentar variavel com informacao do nome digitada anteriormente
            if(nome.equals("0")) break; //Para de executar quando digitado nome igual a "0"

            System.out.println("Digite a idade: "); //Sera exibida mensagem solicitando que usuario digite a idade
            idade = scan.nextInt(); //Para alimentar variavel com informacao da idade digitada anteriormente
        }

        System.out.println("Voce digitou o comando para encerrar");

    }

}
