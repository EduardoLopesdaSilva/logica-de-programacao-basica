package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int soma = 0;
        int contador = 0;

        while (contador < 10) {
            System.out.println("Digite 10 numeros: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                soma += numero;
            }
            contador = contador + 1;


        } System.out.println("A soma é: " + soma);
    }
}

