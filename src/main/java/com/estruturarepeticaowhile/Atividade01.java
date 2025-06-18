package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String nome;
        int contador = 0;
        int sair = 0;

        while (sair != 3) {
            System.out.println("Informe o nome do aluno");
            nome = scanner.next();
            contador = contador + 1;
            System.out.println("Digite 3 para sair");
            sair = scanner.nextInt();
        }
        System.out.println("A quantidade de alunos é: " + contador);
    }
}

