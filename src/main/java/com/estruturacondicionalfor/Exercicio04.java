package main.java.com.estruturacondicionalfor;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero : ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
        if (i % 2 == 0) {
            System.out.println(i);
            }
        }
    }
}
