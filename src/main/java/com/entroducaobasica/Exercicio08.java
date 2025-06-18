package main.java.com.entroducaobasica;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double segundoNumero = scanner.nextDouble();

        System.out.println("Digite o terceiro numero: ");
        double terceiroNumero = scanner.nextDouble();

        double soma = primeiroNumero + segundoNumero + terceiroNumero;
        double media = soma /3;

        System.out.println("A media é: ");
        System.out.println(media);


    }
}
