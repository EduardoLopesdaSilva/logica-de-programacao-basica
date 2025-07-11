package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        System.out.println("Digite o numero: ");
        int termo = scanner.nextInt();

        System.out.print("Digite a razão: ");
        int razao = scanner.nextInt();


        while (contador < 10) {
            termo = termo * razao;
            System.out.println("PG: " + termo);
            contador++;

        }
    }
}
