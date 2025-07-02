package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade07 {
public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    double soma = 0;
    int quantidade = 0;
    int contador = 0;

        while (contador < 10){
            System.out.println("informe o valor pago pelas compras:");
            double valorCompra = scanner.nextDouble();
            if (valorCompra>100) {
                quantidade++;
            }
            soma = soma + valorCompra;
            contador++;
        }
              double media = soma / contador;
              System.out.println("A média é: " + media);
              System.out.println("A quantidade que excederam a 100 foi: " + quantidade);
         }
    }

