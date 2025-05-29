package main.java.com.estruturacondicional;

import java.util.Scanner;

public class ExercicioCondicional08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero positivo: ");
        int idade = scanner.nextInt();

        if (idade < 10) {
            System.out.println("O numero é uma unidade");
        } else if (idade < 100)  {
            System.out.println("o numero é uma dezena");
        } else if (idade < 1000) {
            System.out.println("o numero é uma centena");
        }
    }
}
