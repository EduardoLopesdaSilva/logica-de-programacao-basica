package main.java.com.estruturacondicional;

import java.util.Scanner;

public class ExercicioCondicional13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();
        System.out.println("digite o segundo numero: ");
        double numero2 = scanner.nextDouble();
        System.out.println("digite o terceiro numero");
        double numero3 = scanner.nextDouble();

        double primeiroNumero = 0;
        double segundoNumero = 0;
        double terceiroNumero = 0;


        if ((numero1 > numero2) && (numero1 > numero3)){
           terceiroNumero = numero1;
           if (numero2 > numero3) {
                segundoNumero = numero2;
                primeiroNumero = numero3;
        }else {
                segundoNumero  = numero3;
                primeiroNumero = numero2;
               }
        } else if (numero2 > numero3) {
            terceiroNumero = numero2;
            if (numero3 > numero1) {
                segundoNumero = numero3;
                primeiroNumero = numero1;
            } else {
                primeiroNumero = numero3;
                segundoNumero = numero1;
            }
        }else{
            terceiroNumero = numero3;
            if (numero2 > numero1) {
                segundoNumero = numero2;
                primeiroNumero = numero1;
            } else {
                segundoNumero = numero1;
                primeiroNumero = numero2;
            }
        }
        System.out.println(primeiroNumero + ", " + segundoNumero + ", " + terceiroNumero);
   }
   }


