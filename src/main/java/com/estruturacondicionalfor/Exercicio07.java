package main.java.com.estruturacondicionalfor;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int somaFatorial = 1;
            for (int i = 1; i <= numero; i++) {
                somaFatorial = somaFatorial * i;
            }
            System.out.println("O fatorial de " + numero + " é: " + somaFatorial);
        }
    }

