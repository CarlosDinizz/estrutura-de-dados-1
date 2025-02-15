package lab_aquecimento;

import java.util.Scanner;

// Peça três números e retorne o maior valor usando uma função.

public class Exercicio4 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("------O maior-------");

        System.out.print("Primeiro numero: ");
        int numeroA = scanner.nextInt();

        System.out.print("Segundo numero: ");
        int numeroB = scanner.nextInt();

        System.out.print("Terceiro numero: ");
        int numeroC = scanner.nextInt();

        System.out.println("O maior é " + oMaior(numeroA, numeroB, numeroC));
    }

    private static int oMaior(int numeroA, int numeroB, int numeroC){
        if (numeroA > numeroB && numeroA > numeroC){
            return numeroA;
        }
        if (numeroB > numeroC){
            return  numeroB;
        }
        return  numeroC;
    }
}
