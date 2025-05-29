package main.java.com.estruturacondicional;

import java.util.Scanner;

public class ExercicioCondicional04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero A:");
        double A = scanner.nextDouble();

        System.out.println("Digite o numero B:");
        double B = scanner.nextDouble();

        System.out.println("Adição " + (A+B));

        System.out.println("Subtração " + (A-B));

        System.out.println("Multiplicação " + A*B);

        System.out.println("Divisão " + A/B);


    }
}
