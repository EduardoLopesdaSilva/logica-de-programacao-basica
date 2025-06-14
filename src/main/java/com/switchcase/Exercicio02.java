package main.java.com.switchcase;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero 1: ");
        double A = scanner.nextDouble();
        System.out.println("Digite o numero 2: ");
        double B = scanner.nextDouble();
        System.out.println("digite A=Adição S=Subtração M=Multiplicação ou D=Divisão ");


        String opcao = scanner.next();
        switch (opcao){
            case "A":
                System.out.println("Adição " + (A+B));
                break;

            case "S":
                System.out.println("Subtração " + (A-B));
                break;

            case "M":
                System.out.println("Multiplicação " + A*B);
                break;

            case "D":
                System.out.println("Divisão " + A/B);
            default:
                System.out.println("Operação Invalida");
        }
    }
}
