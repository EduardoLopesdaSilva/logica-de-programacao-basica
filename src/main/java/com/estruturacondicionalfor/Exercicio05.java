package main.java.com.estruturacondicionalfor;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de nota : ");
        int quantidadeNotas = scanner.nextInt();
        double soma = 0;

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.println("Digite a nota: ");
            double nota = scanner.nextDouble();
            soma = soma + nota;
        }
        double media = soma / quantidadeNotas;
        System.out.println("A media é: " + media);
    }
}
