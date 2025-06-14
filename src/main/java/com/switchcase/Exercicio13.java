package main.java.com.switchcase;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o codigo para descobrir a conversão do valor do Dolar 1: Euro 2: Libra 3: Peso argentino 4");

        double real = scanner.nextDouble();
        String opcao = scanner.next();
        switch (opcao){
            case "1":
                System.out.println("Dolar ");
                break;

            case "2":
                System.out.println("Euro ");
                break;

            case "3":
                System.out.println("Libra ");
                break;

            case "4":
                System.out.println("Peso");

            case "5":
                System.out.println("Real");

            default:
                System.out.println("Operação Invalida");


        }}

}