package lab_1a;

import java.util.Scanner;

//Escreva um código Java que leia dois números inteiros informados pelo usuário.
//Cada número deve ser salvo em variáveis distintas, por exemplo, valor1 e valor2.
//Após ler os dois números, o código deve trocar o conteúdo das variáveis.

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor 1: ");
        int valorUm = scanner.nextInt();

        System.out.print("Valor 2: ");
        int valorDois = scanner.nextInt();

        int auxiliar = valorDois;
        valorDois = valorUm;
        valorUm = auxiliar;


        System.out.println("Novo valor 1: " + valorUm + "\nNovo valor 2: " + valorDois);
        scanner.close();
    }

}
