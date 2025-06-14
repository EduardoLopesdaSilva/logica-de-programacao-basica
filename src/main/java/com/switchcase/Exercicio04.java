package main.java.com.switchcase;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o codigo do numerico do livro 1: Ficção 2: Não Ficção 3: Romance 4: Terror 5: Mistério ");

        String opcao = scanner.next();
        switch (opcao){
            case "1":
                System.out.println("Ficção");
                break;

            case "2":
                System.out.println("Não Ficção");
                break;

            case "3":
                System.out.println("Romance");
                break;

            case "4":
                System.out.println("Terror");
                break;
            case "5":
                System.out.println("Mistério");
                break;
            default:
                System.out.println("Operação Invalida");
                break;
        }
    }
}

