package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int contador = 0;
    int quantidadedeNumerosPares = 0;
    int quantidadedeNumerosImpares = 0;
    int somaNumerosImpares = 0;
    int maiorNumero = 0;
    int maiorFrequencia = 0;

    while (contador <10) {
        System.out.println("Digite um numero");
        int numero = scanner.nextInt();

        if ((contador == 0) || (numero > maiorNumero)){
            maiorNumero = numero;
    }
    if (numero % 2 == 0) {
        quantidadedeNumerosPares++;
    } else {
        quantidadedeNumerosImpares++;
        somaNumerosImpares = somaNumerosImpares + numero;
            }
    contador++;
        }
        System.out.println("Quantidade de numeros pares: " + quantidadedeNumerosPares);
        double media = (double) somaNumerosImpares / quantidadedeNumerosImpares;
        System.out.println("Media de numeros impares: " + media);
        System.out.println("Maior numero: " + maiorNumero);

        if (quantidadedeNumerosPares > quantidadedeNumerosPares) {
        System.out.println("");

        }
    }
}
