package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade06 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int contador = 0;
    double numeros = 0;
    int razao = 0;
    int somaRazao = 0;

   System.out.println("Informe o numero:");
   numeros = scanner.nextDouble();

   System.out.print("Informe a razão da progressão aritmética: ");
   razao = scanner.nextInt();

    while (contador < 10){
        somaRazao = somaRazao + razao;
        System.out.println(numeros + somaRazao);
        contador++;
      }
    }
}

