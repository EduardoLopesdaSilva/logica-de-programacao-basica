package main.java.com.switchcase;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero correspondente ao mês: ");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Janeiro Capricórnio (até dia 20) e Aquário (a partir de 21)");
                break;
            case 2:
                System.out.println("Fevereiro Aquário (até dia 18) e Peixes (a partir de 19)");
                break;
            case 3:
                System.out.println("Março Peixes (até dia 20) e Áries (a partir de 21)");
                break;
            case 4:
                System.out.println("Áries (até dia 20) e Touro (a partir de 21)");
                break;
            case 5:
                System.out.println("Touro (até dia 20) e Gêmeos (a partir de 21)");
                break;
            case 6:
                System.out.println("Gêmeos (até dia 20) e Câncer (a partir de 21)");
                break;
            case 7:
                System.out.println("Câncer (até dia 22) e Leão (a partir de 23)");
                break;
            case 8:
                System.out.println("Leão (até dia 22) e Virgem (a partir de 23)");
                break;
            case 9:
                System.out.println("Virgem (até dia 22) e Libra (a partir de 23)");
                break;
            case 10:
                System.out.println(" Libra (até dia 22) e Escorpião (a partir de 23)");
                break;
            case 11:
                System.out.println(" Escorpião (até dia 21) e Sagitário (a partir de 22)");
                break;
            case 12:
                System.out.println("Sagitário (até dia 21) e Capricórnio (a partir de 22)");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }
    }
}