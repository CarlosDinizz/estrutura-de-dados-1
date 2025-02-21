package lab_1a;

import java.util.Scanner;

//Escreva um código Java que leia uma letra e indique se é uma vogal ou consoante.

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Letra: ");
        char letra = scanner.next().toLowerCase().charAt(0);

        if (ehVogal(letra)){
            System.out.println("É vogal.");
            return;
        }
        System.out.println("É consoante.");

        scanner.close();
    }
    private static boolean ehVogal(char letra){
        if (
                letra == 'a' ||
                letra == 'e' ||
                letra == 'i' ||
                letra == 'o' ||
                letra == 'u'
        ){
            return true;
        }
        return false;
    }
}