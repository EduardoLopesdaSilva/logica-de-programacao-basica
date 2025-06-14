package main.java.com.switchcase;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o numero x: ");
        int numero1 = scanner.nextInt();
        System.out.println("digite o numero a: ");
        double numero2 = scanner.nextDouble();
        System.out.println("digite o numero b e que sejá distante do a: ");
        double numero3 = scanner.nextDouble();


        double maior = 0.0;
        switch (numero1) {

            case 1:
                System.out.println("a soma é " + (numero2+numero3));
                break;

            case 2:
                System.out.println("A divisão é " + numero2*numero3);
                break;

            case 3:

                if (numero2 > numero3){
                    System.out.println(numero3 + "," + numero2);
                } else {
                    System.out.println(numero2 + "," + numero3);
                }
                break;

            case 4:
                if (numero2 > numero3){
                    System.out.println(numero2 - numero3);
                } else {
                    System.out.println(numero3 - numero2);
                }
                break;

            case 5:
                  System.out.println((numero2 + numero3) /2);
                  break;
            default:
                System.out.println("Operação Invalida");

        }
    }
}
