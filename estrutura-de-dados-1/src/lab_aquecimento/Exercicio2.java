package lab_aquecimento;

import java.util.Scanner;

// Peça dois números inteiros e exiba a soma.

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------SOMA-------");

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        System.out.println("Soma: " + soma(primeiroNumero,segundoNumero));
    }

    private static int soma(int primeiroNumero, int segundoNumero){
        return primeiroNumero + segundoNumero;
    }
}
