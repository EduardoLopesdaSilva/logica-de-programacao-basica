package main.java.com.switchcase;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite o codigo para descobrir a conversão do valor do Dolar 1: Euro 2: Libra 3: Peso argentino 4");

    double real = scanner.nextDouble();
    String opcao = scanner.next();
    switch (opcao){
        case "1":
            System.out.println("Dolar " + real*5.50);
            break;

        case "2":
            System.out.println("Euro " + real*6.50);
            break;

        case "3":
            System.out.println("Libra " + real*7.50);
            break;

        case "4":
            System.out.println("Peso argentino " + real*0.050);

        default:
            System.out.println("Operação Invalida");


        }}

}


