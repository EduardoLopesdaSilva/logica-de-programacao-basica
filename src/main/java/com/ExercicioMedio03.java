package main.java.com;

import java.util.Scanner;

public class ExercicioMedio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o preço do produto");
        int preco = scanner.nextInt();

        System.out.println("digite o desconto do produto");
        int desconto = scanner.nextInt();

        System.out.println("O valor final do desconto é: ");
        int valorFinal = preco - (preco * desconto / 100);
        System.out.println(valorFinal);
    }
}
