package main.java.com.estruturacondicional;

import java.util.Scanner;

public class ExercicioCondicional03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero:");
        int numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println (numero * -1);
            } else {
        System.out.println(numero);
            }
        }
    }