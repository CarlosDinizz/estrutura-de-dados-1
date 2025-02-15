package lab_aquecimento;

import java.util.Scanner;

// Peça ao usuário um número e exiba uma contagem regressiva até 0

public class Exercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----CONTAGEM REGRESSIVA----");

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        contagem(numero);
    }
    public static void contagem(int numero){
        System.out.print(numero + ", ");
        for (int i = numero - 1; i > 0; i--){
            System.out.print(i + ", ");
        }
        System.out.println(0);
    }
}
