package lab_aquecimento;

import java.util.Scanner;

// Peça um número e exiba se ele é par ou ímpar.

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------PAR/IMPAR--------");

        System.out.print("Dígite o número: ");
        int numero = scanner.nextInt();

        if (ehPar(numero)){
            System.out.println("É par");
            return;
        }

        System.out.println("É ímpar");
    }

    private static boolean ehPar(int numero){
        return numero % 2 == 0;
    }
}
