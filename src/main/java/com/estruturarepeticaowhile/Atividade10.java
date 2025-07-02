package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double numeros = 0;


        System.out.println("Informe os numeros:");
        numeros = scanner.nextDouble();

        int par = 1;

        while (contador < 12){

            if (par % 2 == 0) {
                System.out.println(par);
            }
            par++;
            contador++;

        }
    }
}
