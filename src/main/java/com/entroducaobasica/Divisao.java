package main.java.com.entroducaobasica;


import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double segundoNumero = scanner.nextDouble();

        System.out.println("o resultado da divisão é: ");
        System.out.println(primeiroNumero / segundoNumero);
    }

}
