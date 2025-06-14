package main.java.com.switchcase;

import java.util.Scanner;

public class Exercicio07 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite o numero 1 Domingo 2 Segunda 3 Terça 4 Quarta 5 Quinta 6 Sexta e Sabado 7 para saber o dia correspondente: ");

    String opcao = scanner.next();
    switch (opcao){

        case "1":
            System.out.println("Domingo");
            break;

        case "2":
            System.out.println("Segunda-feira");
            break;

        case "3":
            System.out.println("Terça-Feira");
            break;

        case "4":
            System.out.println("Quarta-feira");
            break;

        case "5":
            System.out.println("Quinta-feira");
            break;
        case "6":
            System.out.println("Sexta-feira");
            break;
        case "7":
            System.out.println("Sabado");
            break;
        default:
            System.out.println("Operação Invalida");
            break;
    }
}
}
