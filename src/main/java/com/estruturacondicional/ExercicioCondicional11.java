package main.java.com.estruturacondicional;

import java.util.Scanner;

public class ExercicioCondicional11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a quantidade de copias: ");
        int copias = scanner.nextInt();


        if (copias <= 10) {

            System.out.println(copias * 0.10);

        } else if (copias >50) {

            System.out.println(copias * 0.08);

        } else if (copias <= 50) {

            System.out.println(copias * 0.05);
        }
    }
}
