package main.java.com.estruturacondicional;

import java.util.Scanner;

public class ExercicioCondicional07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        if  (idade <= 5 ) {
            System.out.println("vc não pode participar");
        }
        if ((idade >= 6) && (idade <= 10)) {
            System.out.println("Infantil");
        } else if ((idade >=11) && (idade <= 17)){
            System.out.println("Juvenil");
        } else if (idade >= 18){
            System.out.println("Adulto");
        }
    }
}
