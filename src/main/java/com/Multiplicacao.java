package main.java.com;

import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double segundoNumero = scanner.nextDouble();

        System.out.println("o resultado da multiplicação é: ");
        System.out.println(primeiroNumero * segundoNumero);
    }

}
