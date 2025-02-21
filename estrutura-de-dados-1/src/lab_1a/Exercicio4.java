package lab_1a;


import java.util.Scanner;

//Escreva um código Java que leia 10 números inteiros e, em seguida, exiba-os na
//ordem inversa que foram inseridas pelo usuário.

public class Exercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for(int i = 0; i < 10; i++){
            numeros[i] = scanner.nextInt();
        }

        for(int i = 9; i >= 0; i--){
            System.out.println(numeros[i]);
        }
        scanner.close();
    }
}