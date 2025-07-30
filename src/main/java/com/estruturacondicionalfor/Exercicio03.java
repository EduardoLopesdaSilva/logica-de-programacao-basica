package main.java.com.estruturacondicionalfor;

import java.util.Scanner;

public class Exercicio03 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite quantos numero deseja somar: ");
            int quantidade = scanner.nextInt();

            int soma = 0;

            for (int i = 3; i <= quantidade; i++) {
                System.out.println("Digite o numero");
                int numero = scanner.nextInt();
                soma = soma + numero;
            }
            System.out.println("A soma dos numeros é " + soma);
        }
    }
