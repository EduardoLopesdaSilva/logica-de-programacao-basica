package main.java.com.estruturacondicional;

import java.util.Scanner;

public class ExercicioCondicional14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("digite o segundo numero: ");
        double num2 = scanner.nextDouble();

            if ( num1 == 0 || num2 == 0 ){
            System.out.println("Z");
        } else if ((num1 > 0 && num2 > 0) || (num1 < 0 && num2 < 0)){

                System.out.println("M");
            } else {
            System.out.println("O");
        }
    }
}
