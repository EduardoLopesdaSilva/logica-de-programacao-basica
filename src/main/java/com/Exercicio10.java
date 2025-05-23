package main.java.com;

import java.util.Scanner;

public class Exercicio10 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite quantos dias são:");
        int dias = scanner.nextInt();

        System.out.println("digite quantas horas são:");
         int horas = scanner.nextInt();

        System.out.println("digite quantos minutos são:");
        int minutos = scanner.nextInt();

        System.out.println("digite quantos segundos são:");
        int segundos = scanner.nextInt();

        int horasDias = dias * 24 * 60 * 60;
        int horasMinutos = horas * 60 * 60;
        int minutosSegundos = minutos * 60;

        System.out.println("esses são todos os segundos: ");
        int soma = horasDias + horasMinutos + minutosSegundos + segundos;
        System.out.println(soma);
    }
}
