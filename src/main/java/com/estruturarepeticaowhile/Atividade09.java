package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        double numeros = 0;
        System.out.println("Informe os numeros:");
        numeros = scanner.nextDouble();

        while (contador < 5){

            System.out.println(numeros + contador);
            contador++;
        }
    }
}


