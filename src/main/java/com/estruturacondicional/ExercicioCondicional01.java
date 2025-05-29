package main.java.com.estruturacondicional;

import java.util.Scanner;

public class ExercicioCondicional01 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Digite a sua idade: ");

        int MAIORIDADE = 18;

        int idade = scanner.nextInt();

        if (idade >= MAIORIDADE) {
            System.out.println("você é maior de idade");
        }else {
            System.out.println("você é menor de idade");
        }
    }
}
