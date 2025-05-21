package main.java.com;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("qual o nome da mercadoria");
         String mercadoria = scanner.next();

        System.out.println("digite o preço da compra?");
        double compra = scanner.nextDouble();

        System.out.println("qual o preco da venda" );
         double venda = scanner.nextDouble();

        System.out.println("O lucro obtido de " + mercadoria + " foi de: " + (venda-compra));

    }
}
