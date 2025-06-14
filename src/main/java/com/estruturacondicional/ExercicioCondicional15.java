package main.java.com.estruturacondicional;

import java.util.Scanner;

public class ExercicioCondicional15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o peso da mercadoria: ");
        double peso = scanner.nextDouble();

        System.out.println("digite o tipo da entrega 1 para Sedex ou digite 2 para Sedex 10: ");
        int tipo = scanner.nextInt();

        System.out.println("digite a região da sua entrega 1 para Norte ou 2 para Nordeste ou Sudeste e digite " +
                "3 para Centro Oeste e 5 é para Sul ");
        double região = scanner.nextDouble();

        double valorTotal = 0.0;

        if (peso <= 1) {
            valorTotal = 5;
        } else if ((peso >= 1) && (peso <= 5)) {
            valorTotal = 10;
        } else if (peso > 5) {
            valorTotal = 15;
        }

        if (tipo == 1) {
            valorTotal = valorTotal + 9;
        } else if (tipo == 2){
            valorTotal = valorTotal + 11;
        }

        if (região == 1) {
            valorTotal = valorTotal + 4;
        } else if (região ==2){
            valorTotal = valorTotal + 2;
        }else if (região == 3){
            valorTotal = valorTotal + 5;
        } else if (região == 5){
            valorTotal = valorTotal + 3;
        }
        System.out.println("O valor total é " + valorTotal);
    }
}




