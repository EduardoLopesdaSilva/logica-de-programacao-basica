package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        int calcular = 0;

        System.out.println("Informe um valor de X:");
        int x = scanner.nextInt();

        while (contador <= 20){
           calcular += contador + x;
           contador += 1;
        }
        System.out.println("O valor de Y é: " + calcular);
    }
}
