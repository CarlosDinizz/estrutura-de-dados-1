package lab_1a;

import java.util.Scanner;

//Escreva um código Java que leia 10 números reais e, após a leitura dos números,
//informe qual é o maior e qual é o menor.

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] reais = new double[10];

        for (int i = 0; i < 10; i++){
            System.out.print("Número " + (i+1) + ": ");
            reais[i] = scanner.nextDouble();
        }

        System.out.println("Menor: " + min(reais) + "\nMaior: " + max(reais));
    }

    private static double max(double[] array){
        double maior = array[0];

        for (int i = 1; i < array.length; i++){
            if (maior < array[i]){
                maior = array[i];
            }
        }

        return maior;
    }

    private static double min(double[] array){
        double menor = array[0];

        for (int i = 1; i < array.length; i++){
            if (menor > array[i]){
                menor = array[i];
            }
        }

        return menor;
    }
}
