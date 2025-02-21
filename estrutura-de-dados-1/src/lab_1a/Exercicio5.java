package lab_1a;

import java.util.Scanner;

//Escreva um método estático min() que recebe dois parâmetros numéricos inteiros
//e retorna o menor valor entre eles e um método estático max() que recebe dois
//parâmetros numéricos inteiros e retorna o maior valor entre eles.

public class Exercicio5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int primeiro = sc.nextInt();
        int segundo = sc.nextInt();

        int minimo = min(primeiro, segundo);
        int maximo = max(primeiro, segundo);

        System.out.println("Minimo: " + minimo);
        System.out.println("Maximo: " + maximo);

        sc.close();
    }

    public static int min(int primeiro, int segundo){
        if (primeiro < segundo){
            return primeiro;
        }
        return segundo;
    }

    public static int max(int primeiro, int segundo){
        if (primeiro > segundo){
            return primeiro;
        }
        return segundo;
    }
}