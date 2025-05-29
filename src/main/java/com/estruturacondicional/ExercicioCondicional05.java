package main.java.com.estruturacondicional;

import java.util.Scanner;

public class ExercicioCondicional05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno");
        String nome = scanner.nextLine();

        System.out.println("Digite o primeiro numero: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double segundoNumero = scanner.nextDouble();

        System.out.println("Digite o terceiro numero: ");
        double terceiroNumero = scanner.nextDouble();

        double soma = primeiroNumero + segundoNumero + terceiroNumero;
        double media = soma / 3;

        if (media >= 7) {
            System.out.println(nome + " está aprovado");
        } else {
            System.out.println(nome + " está reprovado");
        }
    }
}

