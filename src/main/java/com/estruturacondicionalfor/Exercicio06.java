package main.java.com.estruturacondicionalfor;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para iniciar a contagem regressiva: ");
        int numero = scanner.nextInt();

        System.out.println("Contagem regressiva até 1:");
        for (int i = numero; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
