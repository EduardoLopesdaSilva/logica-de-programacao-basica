package main.java.com.switchcase;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o codigo do numero de 0 a 10 para classificar");

        int nota = scanner.nextInt();
        switch (nota){
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("Insuficiente");
                break;

            case 4:
            case 5:
                System.out.println ("Regular");
                break;

            case 6:
            case 7:
                System.out.println("Bom");
                break;

            case 8:
            case 9:
                System.out.println("Muito bom");
                break;

            case 10:
                System.out.println("Excelente");
                break;

            default:
                System.out.println("Operação Invalida");
                break;
        }
    }
}

