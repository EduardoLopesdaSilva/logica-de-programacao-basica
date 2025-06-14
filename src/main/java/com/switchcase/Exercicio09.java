package main.java.com.switchcase;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o menu dos nossos pratos  " +
                "1:XCalabresa " +
                "2:XBacon" +
                "3:XFrango" +
                "4:Xegg" +
                "5:XTudo ");

        int opcao = scanner.nextInt();
        switch (opcao){
            case 1:
                System.out.println("XCalabresa $25 45min");
                break;

            case 2:
                System.out.println("XBacon $22 45min");
                break;

            case 3:
                System.out.println("XFrango $30 50min");
                break;

            case 4:
                System.out.println("Xegg $20 30min");

            case 5:
                System.out.println("Xtudo $55 1h");

            default:
                System.out.println("Operação Invalida");
        }
    }
}

