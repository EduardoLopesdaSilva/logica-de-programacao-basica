package main.java.com.entroducaobasica;

import java.util.Scanner;

public class ExercicioMedio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o numero da letra C: ");
        double C = scanner.nextDouble();

        double formula = ( C * 9/5 + 32);
        System.out.println(nome + " o seu resultado nessa formula é: " + formula);

    }
}
