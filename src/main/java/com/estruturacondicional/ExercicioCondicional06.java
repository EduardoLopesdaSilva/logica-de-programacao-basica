package main.java.com.estruturacondicional;

import java.util.Scanner;

public class ExercicioCondicional06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();
        System.out.println("digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        double maior = 0.0;

        if (numero1 > numero2){
            maior = numero1;
            System.out.println("O maior numero é: " + maior);
        }else {
            maior = numero2;
        }
    }
}