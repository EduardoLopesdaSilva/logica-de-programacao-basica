package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;


        System.out.println("Informe os numeros:");
        int numeros = scanner.nextInt();

        int par = 1;

        while (contador <= 10){
            int proximoNumero = numeros + contador;
            if (proximoNumero % 2 == 0) {
                System.out.println(proximoNumero);
            }
            contador++;

        }
    }
}
