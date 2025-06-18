package main.java.com.entroducaobasica;

import java.util.Scanner;

public class Exercicio09 {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

          System.out.println("Digite o numero da letra A: ");
            double A = scanner.nextDouble();

         System.out.println("Digite o numero da letra B: ");
            double B = scanner.nextDouble();

        System.out.println("Digite o numero da letra C: ");
            double C = scanner.nextDouble();

         double formula = (B * B - 4 * A*C) / (2*A);
            System.out.println("O resultado dessa formula é: " + formula);

    }
}