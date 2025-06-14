package main.java.com.switchcase;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero 1: ");
        double A = scanner.nextDouble();
        System.out.println("Digite o numero 2: ");
        double B = scanner.nextDouble();
        System.out.println("digite 1=Adição 2=Subtração 3=Multiplicação ou 4=Divisão ");


        String opcao = scanner.next();
        switch (opcao){
            case "1":
                System.out.println("Adição " + (A+B));
                break;

            case "2":
                System.out.println("Subtração " + (A-B));
                break;

            case "3":
                System.out.println("Multiplicação " + A*B);
                break;

            case "4":
                System.out.println("Divisão " + A/B);
            default:
                System.out.println("Operação Invalida");
        }
    }
}
