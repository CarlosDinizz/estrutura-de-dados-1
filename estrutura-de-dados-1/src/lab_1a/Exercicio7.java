package lab_1a;

import java.util.Scanner;

//Escreva um método estático contarVogais() que recebe uma string como parâmetro
//e retorna a quantidade de vogais encontradas na string

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra = scanner.nextLine();
        int vogais = contarVogais(palavra);

        System.out.println("Quantidade de vogais: " + vogais);
    }

    private static int contarVogais(String palavra){
        char[] letras = palavra.toLowerCase().toCharArray();

        int vogais = 0;

        for (int i = 0; i < letras.length; i++){
            if (
                    letras[i] == 'a' ||
                    letras[i] == 'e' ||
                    letras[i] == 'i' ||
                    letras[i] == 'o' ||
                    letras[i] == 'u'
            ){
                vogais++;
            }
        }

        return vogais;
    }
}