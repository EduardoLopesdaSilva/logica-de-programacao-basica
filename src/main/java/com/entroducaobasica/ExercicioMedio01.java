package main.java.com.entroducaobasica;

import java.util.Scanner;

public class ExercicioMedio01 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do motorista: ");
    String motorista = scanner.next();

    System.out.println("Digite a distancia percorrida: ");
    double distancia = scanner.nextDouble();

    System.out.println("Digite o tempo em horas percorrida: ");
    double horas = scanner.nextDouble();

    System.out.println("A velocidade media de " + motorista + " é:") ;
    double velocidadeMedia = distancia / horas;
    System.out.println(velocidadeMedia);

    }
}
