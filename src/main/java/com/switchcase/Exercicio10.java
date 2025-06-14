package main.java.com.switchcase;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o codigo do numerico do livro 1:Sudeste" +
                " 2:Sul 3:Centro-Oeste " +
                " 4: Norte 5: Nordeste");

        String opcao = scanner.next();
        switch (opcao){
            case "1":
                System.out.println("Sudeste");
                break;

            case "2":
                System.out.println("Sul");
                break;

            case "3":
                System.out.println("Centro-Oeste");
                break;

            case "4":
                System.out.println("Norte");
                break;
            case "5":
                System.out.println("Nordeste");
                break;
            default:
                System.out.println("Operação Invalida");
                break;
        }
    }
}
