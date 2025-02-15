package lab_aquecimento;

import java.util.Scanner;

// Peça um número e exiba sua tabuada de 1 a 10.

public class Exercicio6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------TABUADA-------");

        System.out.print("Digite o numero: ");
        int numero = scanner.nextInt();
        tabuada(numero);
    }

    private static void tabuada(int numero) {
        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
