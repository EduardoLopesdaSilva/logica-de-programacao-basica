package main.java.com.switchcase;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o codigo do numerico do livro " +
                "1:Ver Saldo" +
                " 2:Sacar seu Dinheiro 3:Depositar seu Dinheiro " +
                " 4: Sair");

        int saldo = scanner.nextInt();
        switch (saldo){
            case 1:
                System.out.println("O seu saldo é $800");
                break;

            case 2:
                System.out.println("Saque seu Dinheiro");
                break;

            case 3:
                System.out.println("Depositar Dinheiro");
                break;

            case 4:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Operação Invalida");
                break;
        }
    }
}
