package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorjovem = 0;
        int contadormeiaidade = 0;
        int contadoridoso = 0;
        double idade = 0;
        int sair = 0;



        while (sair != 3) {
            System.out.println("Digite a idade do colaborador: ");
            idade = scanner.nextInt();
             if ((idade >=18) && (idade <= 25)){
                 contadorjovem = contadorjovem + 1;
            } else if ((idade >= 26) && (idade <= 50))
                 contadormeiaidade = contadormeiaidade + 1;
            else if ((idade >= 51) && (idade <= 65)) {
                 contadoridoso = contadoridoso + 1;
            }
            System.out.println("Digite 3 para sair");
            sair = scanner.nextInt();
        }
        System.out.println ("na sua empresa tem " + contadorjovem + " jovem");
        System.out.println("na sua empresa tem " + contadormeiaidade + " Meia Idade");
        System.out.println("na sua empresa tem " + contadoridoso + " Idoso");
    }
}
