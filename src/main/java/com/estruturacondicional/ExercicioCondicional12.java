package main.java.com.estruturacondicional;

import java.util.Scanner;

public class ExercicioCondicional12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();
        System.out.println("digite o segundo numero: ");
        double numero2 = scanner.nextDouble();
        System.out.println("digite o terceiro numero");
        double numero3 = scanner.nextDouble();

        double maior = 0.0;

        if ((numero1 > numero2) && (numero1 > numero3)) {
            maior = numero1;
            if(numero2 > numero3) {
                meio = numero2;
                menor = numero3;
            }else{
                meio = numero3;
                menor = numero2;
            }
        } else if (numero2 > numero3) {
            maior = numero2;
        } else {
            maior = numero3;
        }

        if ((numero1 > numero2) && (numero1 > numero3)) {
            maior = numero1;
        }

        if ((numero2 > numero1) && (numero2 > numero3)) {
            maior = numero2;
        }

        if ((numero3 > numero1) && (numero3 > numero2)) {
            maior = numero3;
        }


        System.out.println("O maior numero é: " + maior);

    }
}
