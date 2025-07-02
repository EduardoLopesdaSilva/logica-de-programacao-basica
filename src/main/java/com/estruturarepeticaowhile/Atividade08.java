package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade08 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador2 = 0;
        int contador = 0;
        double soma = 0;
        int quantidadeDeCidade = 5;

        while (contador < quantidadeDeCidade) {
            System.out.println("me diga quantos grau tem na sua cidade ");
            double temperatura = scanner.nextDouble();

                if (temperatura < 10) {
               contador2++;
            }
            soma += temperatura;
            contador++;
        }
        double media = soma / quantidadeDeCidade;
        System.out.println("A media é: " + media);
        System.out.println("Quais são as cidades estão abaixo de 5°C: ");
        System.out.println(quantidadeDeCidade);
    }

}