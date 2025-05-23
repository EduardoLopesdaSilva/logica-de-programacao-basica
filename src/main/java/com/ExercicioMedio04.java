package main.java.com;

import java.util.Scanner;

public class ExercicioMedio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println(nome + " o seu IMC deu:");
        double IMC = peso / (altura * altura);
        System.out.println(IMC);
    }
}
