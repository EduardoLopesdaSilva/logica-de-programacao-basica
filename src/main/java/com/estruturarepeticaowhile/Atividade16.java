package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade16 {
    public static int QUANTIDADE = 5;
    public static void main(String[]args) {
    Scanner scanner = new Scanner(System.in);

        double maiorCompra = 0;
        double somaTodasCompras = 0;
        int contador = 0;

    while (contador < QUANTIDADE) {
        System.out.println("Digite o valor de Compra");
    double valorCompra = scanner.nextDouble();
    if (contador == 0){
        maiorCompra = valorCompra;
    }
    if (valorCompra > maiorCompra) {
        maiorCompra = valorCompra;
    }
    somaTodasCompras = somaTodasCompras + valorCompra;
    contador++;
    }
    System.out.println("Maior compra: " + maiorCompra);
    double media = somaTodasCompras/QUANTIDADE;
    System.out.println("Média das compras: " + media);
    }
}
