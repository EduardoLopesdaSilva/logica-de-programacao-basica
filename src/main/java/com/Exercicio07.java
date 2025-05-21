package main.java.com;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        double primeiro = scanner.nextDouble();

        System.out.println("digite o segundo numero: ");
        double segundo = scanner.nextDouble();

        System.out.println("O resultado são" + " o da divisão é: " + (primeiro/segundo) + " da multiplicação: " +
                (primeiro*segundo) + " da soma é: " + (primeiro+segundo) + " da subtração é: " + (primeiro-segundo));

    }
}
