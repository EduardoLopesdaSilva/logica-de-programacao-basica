package main.java.com.entroducaobasica;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
    double primeiro = scanner.nextDouble();

    System.out.println("digite o segundo numero: ");
    double segundo = scanner.nextDouble();

        System.out.println("O valor da divisão é: " + primeiro/segundo);
        System.out.println("O resto da divisão é: " + primeiro%segundo);
   }
}