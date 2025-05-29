package main.java.com.estruturacondicional;

import java.util.Scanner;

public class ExercicioCondicional09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero A:");
        double A = scanner.nextDouble();

        System.out.println("Digite o numero B:");
        double B = scanner.nextDouble();

        double maior = 0.0;

        if (A > B) {
            maior = A;
            System.out.println("Adição " + (A + B));
        } else {
            maior = B;
            System.out.println("Multiplicação " + A * B);
        }
      }
    }